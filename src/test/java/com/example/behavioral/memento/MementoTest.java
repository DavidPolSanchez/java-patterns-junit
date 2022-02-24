package com.example.behavioral.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DisplayName("Memento pattern tests")
@ExtendWith(MockitoExtension.class)
class MementoTest {

    @Mock
    TextFileRepository repository;

    @InjectMocks
    TextFileHistory fileHistory;

    TextFileOriginator file1 = new TextFileOriginator("Draft1.txt");

    @Test
    @DisplayName("Write content on file")
    void writeTest() {

        file1.writeContent("write 1");

        assertEquals("write 1", file1.getContent());
    }

    @Test
    @DisplayName("Commit one change")
    void commitTest() {

        file1.writeContent("write 1");
        fileHistory.commit(file1, "commit 1");

        List<TextFileSnapshot> commits = fileHistory.getCommits(file1);
        assertEquals(1, commits.size());

        TextFileSnapshot commit = commits.get(0);
        assertEquals("write 1", commit.getContent());
        assertEquals("commit 1", commit.getCommitMessage());
        assertEquals(0, commit.getSerialNo());
        assertEquals(file1.getId(), commit.getId());
        assertEquals(file1.getName(), commit.getName());
        assertEquals(file1.getContent(), commit.getContent());

        verify(repository).create();
    }

    @Test
    @DisplayName("Commit two changes")
    void commitTwoTest() {

        file1.writeContent("write 1");
        fileHistory.commit(file1, "commit 1");

        file1.writeContent("write 2");
        fileHistory.commit(file1, "commit 2");

        List<TextFileSnapshot> commits = fileHistory.getCommits(file1);

        assertEquals(2, commits.size());
        assertEquals("write 2", commits.get(commits.size() - 1).getContent());

        verify(repository, times(2)).create();
        verify(repository).retrieve(0);
        verify(repository).retrieve(1);
    }

    @Test
    @DisplayName("Restore commit")
    void restoreTest() {

        file1.writeContent("write 1");
        fileHistory.commit(file1, "commit 1");

        file1.writeContent("write 2");
        fileHistory.commit(file1, "commit 2");

        fileHistory.restore(file1, 0);

        List<TextFileSnapshot> commits = fileHistory.getCommits(file1);

        assertEquals(0, commits.size());
        assertEquals("write 1", file1.getContent());

        verify(repository, times(2)).create();
        verify(repository, atMost(1)).retrieve(0);
    }

    @Test
    @DisplayName("Restore non-existing commit")
    void restoreNonExistingCommitTest() {

        fileHistory.restore(file1, 2);

        assertNull(file1.getContent());

        verify(repository, never()).retrieve(2);
    }

}
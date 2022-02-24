package com.example.behavioral.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextFileHistory{ // CareTaker

    private final Map<String, List<TextFileSnapshot>> states = new HashMap<>();
    private final TextFileRepository repository;

    public TextFileHistory(TextFileRepository repository) {
        this.repository = repository;
    }

    public void commit(TextFileOriginator file, String commitMessage) {

        List<TextFileSnapshot> snapshots = states.get(file.getId());
        if (snapshots == null) {
            snapshots = new ArrayList<>();
            states.put(file.getId(), snapshots);
        }

        List<TextFileSnapshot> mementos = states.get(file.getId());
        TextFileSnapshot memento = file.createSnapshot(snapshots.size(), commitMessage);
        mementos.add(memento);

        repository.create();

        System.out.println("Commit created: " + file.getName());
    }

    public void restore(TextFileOriginator file, int commitSerialNo) {

        List<TextFileSnapshot> commits = states.get(file.getId());
        if (commits != null && commitSerialNo > -1) {
            TextFileSnapshot versionToRestore = commits.get(commitSerialNo);
            file.writeContent(versionToRestore.getContent());

            states.put(file.getId(), commits.subList(0, commitSerialNo));

            repository.retrieve(commitSerialNo);

            System.out.println("Rollback to: " + commitSerialNo);
        }
    }

    public List<TextFileSnapshot> getCommits(TextFileOriginator file) {

        List<TextFileSnapshot> snapshots = states.get(file.getId());
        snapshots.forEach(snap -> {
            repository.retrieve(snap.getSerialNo());
            System.out.println(snap);
        });

        return snapshots;
    }
}

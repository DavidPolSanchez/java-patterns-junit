package com.example;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"com.example.behavioral", "com.example.creational",
        "com.example.factory", "com.example.structural"})
public class SuiteAll {
}

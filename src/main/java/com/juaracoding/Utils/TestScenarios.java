package com.juaracoding.Utils;

public enum TestScenarios {

    T1("TCC.JC.002 Invalid URL"),
    T2("TCC.JC.002 Valid URL"),
    T3("TCC.JC.003 Admin Kosongkan Username dan password"),
    T4("TCC.JC.004 Admin input invalid Username dan password"),
    T5("TCC.JC.005 Admin input Username menggunakan (uppercase)"),
    T6("TCC.JC.006 Admin valid login"),
    T7("TCC.JC.007 Admin logout");
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}

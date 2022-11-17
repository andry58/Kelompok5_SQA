package com.juaracoding.Utils;

public enum TestScenarios {


    T1("User invalid login"),
    T2("User valid login"),
    T3("User valid login 2"),
    T4("TCC.JC.069 Input Judul satu kosong"),
    T5("TCC.JC.070 Input Judul satu angka huruf"),
    T6("TCC.JC.071 Input Judul satu simbol"),
    T7("TCC.JC.072 Input deskripsi satu kosong"),
    T8("TCC.JC.073 Input deskripsi satu angka huruf"),
    T9("TCC.JC.074 Input deskripsi satu simbol"),
    T10("TCC.JC.075 Input Judul dua kosong"),
    T11("TCC.JC.076 Input Judul dua angka huruf"),
    T12("TCC.JC.077 Input Judul dua simbol"),
    T13("TCC.JC.078 Input deskripsi dua kosong"),
    T14("TCC.JC.079 Input deskripsi dua angka huruf"),
    T15("TCC.JC.080 Input deskripsi dua simbol"),
    T16("TCC.JC.081 Input Judul tiga kosong"),
    T17("TCC.JC.082 Input Judul tiga angka huruf"),
    T18("TCC.JC.083 Input Judul tiga simbol"),
    T19("TCC.JC.084 Input deskripsi tiga kosong"),
    T20("TCC.JC.085 Input deskripsi tiga angka huruf"),
    T21("TCC.JC.086 Input deskripsi tiga simbol"),
    T22("TCC.JC.081 Input Judul empat kosong"),
    T23("TCC.JC.082 Input Judul empat angka huruf"),
    T24("TCC.JC.083 Input Judul empat simbol"),
    T25("TCC.JC.084 Input deskripsi empat kosong"),
    T26("TCC.JC.085 Input deskripsi empat angka huruf"),
    T27("TCC.JC.086 Input deskripsi empat simbol");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}

package com.juaracoding.Utils;

public enum TestScenarios {

    T1("TCC.JC.002 Invalid URL"),
    T2("TCC.JC.002 Valid URL"),
    T3("TCC.JC.003 Admin Kosongkan Username dan password"),
    T4("TCC.JC.004 Admin input invalid Username dan password"),
    T5("TCC.JC.005 Admin input Username menggunakan (uppercase)"),
    T6("TCC.JC.006 Admin valid login"),
    T7("TCC.JC.035 Menampilkan halaman Rincian Biaya"),
    T8("TCC.JC.037 Shorting Data by Diskon"),
    T9("TCC.JC.038 Shorting Data by Nama Program"),
    T10("TCC.JC.039 Shorting Data by Harga-Normal"),
    T11("TCC.JC.040 Shorting Data by Harga-Diskon"),
    T12("TCC.JC.041 Search Data by Diskon"),
    T13("TCC.JC.042 Search Data by Nama Program"),
    T14("TCC.JC.043 Search Data by Harga-Normal"),
    T15("TCC.JC.044 Search Data by Harga-Diskon"),
    T16("TCC.JC.045 Menampilkan form Tambah Rincian Biaya"),
    T17("TCC.JC.046 Input Data Lengkap"),
    T18("TCC.JC.047 Kosongkan Nama Perogram"),
    T19("TCC.JC.048 Kosongkan Harga Normal"),
    T20("TCC.JC.049 Input Harga Normal menggunakan (huruf)"),
    T21("TCC.JC.051 Kosongkan Diskon"),
    T22("TCC.JC.050 Input Diskon menggunakan (huruf)"),
    T23("TCC.JC.052 Harga Diskon terisi otomatis"),
    T24("TCC.JC.053 Kosongkan Keunggulan satu"),
    T25("TCC.JC.054 Kosongkan Keunggulan dua"),
    T26("TCC.JC.055 Kosongkan Keunggulan tiga"),
    T27("TCC.JC.056 Kosongkan Keunggulan empat"),
    T28("TCC.JC.057 Kosongkan Keunggulan lima"),
    T29("TCC.JC.058 Select status publish Active");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}

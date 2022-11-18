package com.juaracoding.Utils;

public enum TestScenarios {

    T1("TCC.JC.002 Invalid URL"),
    T2("TCC.JC.002 Valid URL"),
    T3("TCC.JC.003 Admin Kosongkan Username dan password"),
    T4("TCC.JC.004 Admin input invalid Username dan password"),
    T5("TCC.JC.005 Admin input Username menggunakan (uppercase)"),
    T6("TCC.JC.006 Admin valid login"),
    T7("TCC.JC.007 Admin logout"),
    T8("TCC.JC.008 Testimonial user Menu"),
    T9("TCC.JC.009 Add  Testimonial file uploud foto"),
    T10("TCC.JC.010 Add Testimonial uploud foto size maksimal 1 MB"),
    T11("TCC.JC.011 Add Testimonial uploud foto format selain gambar"),
    T12("TCC.JC.012 Add Testimonial Tidak Uploud Foto"),
    T13("TCC.JC.013 Add Testimonial Input nama lengkap menggunakan huruf"),
    T14("TCC.JC.014 Add Testimonial Input nama lengkap  menggunakan simbol"),
    T15("TCC.JC.015 Add Testimonial Tidak Input Nama Peserta"),
    T16("TCC.JC.016 Add Testimonial Select Publish   berdasarkan pilihan (Active)"),
    T17("TCC.JC.017 Add Testimonial Select Publish  berdasarkan pilihan (No Active )"),
    T18("TCC.JC.018 Add Testimonial Input Isi Testimonial  menggunakan huruf"),
    T19("TCC.JC.019 Add Testimonial Input Isi Testimonial  menggunakan simbol"),
    T20("TCC.JC.020 Add Testimonial Tidak Isi Testimonial"),
    T21("TCC.JC.021 Add Testimonial Select Rating   berdasarkan pilihan"),
    T22("TCC.JC.022 Add Testimonial Button Simpan"),
    T23("TCC.JC.023 Testimonial Search Nama Peserta"),
    T24("TCC.JC.024 Edit Testimonial Foto yang dipilih memiliki size maksimal 1 MB"),
    T25("TCC.JC.025 Edit Testimonial Tidak Edit Uploud Foto"),
    T26("TCC.JC.026 Edit Testimonial Edit nama lengkap menggunakan huruf"),
    T27("TCC.JC.027 Edit Testimonial Edit nama lengkap menggunakan simbol"),
    T28("TCC.JC.028 Edit Testimonial Tidak Edit Nama Peserta"),
    T29("TCC.JC.029 Edit Testimonial Edit Select Publish   berdasarkan pilihan (Active )"),
    T30("TCC.JC.030 Edit Testimonial Edit  Select Publish   berdasarkan pilihan (No Active )"),
    T31("TCC.JC.031 Edit Testimonial Edit  Isi Testimonial  menggunakan huruf"),
    T32("TCC.JC.032 Edit Testimonial Edit  Isi Testimonial menggunakan simbol"),
    T33("TCC.JC.033 Edit Testimonial Tidak Edit Isi Testimonial"),
    T34("TCC.JC.034 Edit Testimonial Edit  Select Rating   berdasarkan pilihan (0, 1, 2, 3,4,5)"),
    T35("TCC.JC.035 Edit Testimonial Menyimpan Edit Testimonial")

    ;



    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }


}

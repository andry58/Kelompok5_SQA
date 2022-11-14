
Feature: Tambah Benfit

  Scenario: User tambah data benefit
    When User go to web Tambah Benefit
    And User input judul satu
    And User input deskripsi satu
    And User input judul dua
    And User input deskripsi dua
    And User input judul tiga
    And User input deskripsi tiga
    And User input judul empat
    And User input deskripsi empat

    And User click button simpan
    Then Muncul Pesan Data Tersimpan
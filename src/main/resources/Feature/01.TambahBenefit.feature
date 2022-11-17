
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
    And User input publish

    Then User click button simpan


  Scenario: User tambah data benefit angka huruf
    When TCC.Juara.007 User go to web Tambah Benefit
    And User input judul satu angka huruf
    And User input deskripsi angka huruf
    And User input judul dua angka huruf
    And User input deskripsi dua angka huruf
    And User input judul tiga angka huruf
    And User input deskripsi tiga angka huruf
    And User input judul empat angka huruf
    And User input deskripsi empat angka huruf
    And TCC.Juara.007 User input publish

    Then TCC.Juara.007 User click button simpan

  Scenario: User tambah symbol
    When TCC.Juara.008 User go to web Tambah Benefit
    And User input judul satu simbol
    And User input deskripsi simbol
    And User input judul dua simbol
    And User input deskripsi dua simbol
    And User input judul tiga simbol
    And User input deskripsi tiga simbol
    And User input judul empat simbol
    And User input deskripsi empat simbol
    And TCC.Juara.008 User input publish

    Then TCC.Juara.008 User click button simpan

  Scenario: Input Judul satu kosong
    When TCC.Juara.009 User go to web Tambah Benefit
    And TCC.Juara.009 User input judul satu
    And User input deskripsi jd satu
    And User input judul dua jd satu
    And User input deskripsi dua jd satu
    And User input judul tiga jd satu
    And User input deskripsi tiga jd satu
    And User input judul empat jd satu
    And User input deskripsi empat jd satu
    And TCC.Juara.009 User input publish

    Then TCC.Juara.009 User click button simpan

  Scenario: TCC.JC.070 Input Judul satu angka huruf
    When TCC.JC.070 User go to web Tambah Benefit
    And TCC.JC.070 User input judul satu
    And TCC.JC.070 User input deskripsi satu
    And TCC.JC.070 User input judul dua
    And TCC.JC.070 User input deskripsi dua
    And TCC.JC.070 User input judul tiga
    And TCC.JC.070 User input deskripsi tiga
    And TCC.JC.070 User input judul empat
    And TCC.JC.070 User input deskripsi empat
    And TCC.JC.070 User input publish

    Then TCC.JC.070 User click button simpan

  Scenario: TCC.JC.071 Input Judul satu simbol
    When TCC.JC.071 User go to web Tambah Benefit
    And TCC.JC.071 User input judul satu
    And TCC.JC.071 User input deskripsi satu
    And TCC.JC.071 User input judul dua
    And TCC.JC.071 User input deskripsi dua
    And TCC.JC.071 User input judul tiga
    And TCC.JC.071 User input deskripsi tiga
    And TCC.JC.071 User input judul empat
    And TCC.JC.071 User input deskripsi empat
    And TCC.JC.071 User input publish

    Then TCC.JC.071 User click button simpan

  Scenario: TCC.JC.072 Input deskripsi satu kosong
    When TCC.JC.072 User go to web Tambah Benefit
    And TCC.JC.072 User input judul satu
    And TCC.JC.072 User input deskripsi satu
    And TCC.JC.072 User input judul dua
    And TCC.JC.072 User input deskripsi dua
    And TCC.JC.072 User input judul tiga
    And TCC.JC.072 User input deskripsi tiga
    And TCC.JC.072 User input judul empat
    And TCC.JC.072 User input deskripsi empat
    And TCC.JC.072 User input publish

    Then TCC.JC.072 User click button simpan

  Scenario: TCC.JC.073 Input deskripsi satu angka huruf
    When TCC.JC.073 User go to web Tambah Benefit
    And TCC.JC.073 User input judul satu
    And TCC.JC.073 User input deskripsi satu
    And TCC.JC.073 User input judul dua
    And TCC.JC.073 User input deskripsi dua
    And TCC.JC.073 User input judul tiga
    And TCC.JC.073 User input deskripsi tiga
    And TCC.JC.073 User input judul empat
    And TCC.JC.073 User input deskripsi empat
    And TCC.JC.073 User input publish

    Then TCC.JC.073 User click button simpan

  Scenario: TCC.JC.074 Input deskripsi satu simbol
    When TCC.JC.074 User go to web Tambah Benefit
    And TCC.JC.074 User input judul satu
    And TCC.JC.074 User input deskripsi satu
    And TCC.JC.074 User input judul dua
    And TCC.JC.074 User input deskripsi dua
    And TCC.JC.074 User input judul tiga
    And TCC.JC.074 User input deskripsi tiga
    And TCC.JC.074 User input judul empat
    And TCC.JC.074 User input deskripsi empat
    And TCC.JC.074 User input publish

    Then TCC.JC.074 User click button simpan

  Scenario: TCC.JC.075 Input judul dua kosong
    When TCC.JC.075 User go to web Tambah Benefit
    And TCC.JC.075 User input judul satu
    And TCC.JC.075 User input deskripsi satu
    And TCC.JC.075 User input judul dua
    And TCC.JC.075 User input deskripsi dua
    And TCC.JC.075 User input judul tiga
    And TCC.JC.075 User input deskripsi tiga
    And TCC.JC.075 User input judul empat
    And TCC.JC.075 User input deskripsi empat
    And TCC.JC.075 User input publish

    Then TCC.JC.075 User click button simpan

  Scenario: TCC.JC.076 Input judul dua angka huruf
    When TCC.JC.076 User go to web Tambah Benefit
    And TCC.JC.076 User input judul satu
    And TCC.JC.076 User input deskripsi satu
    And TCC.JC.076 User input judul dua
    And TCC.JC.076 User input deskripsi dua
    And TCC.JC.076 User input judul tiga
    And TCC.JC.076 User input deskripsi tiga
    And TCC.JC.076 User input judul empat
    And TCC.JC.076 User input deskripsi empat
    And TCC.JC.076 User input publish

    Then TCC.JC.076 User click button simpan

  Scenario: TCC.JC.077 Input judul dua simbol
    When TCC.JC.077 User go to web Tambah Benefit
    And TCC.JC.077 User input judul satu
    And TCC.JC.077 User input deskripsi satu
    And TCC.JC.077 User input judul dua
    And TCC.JC.077 User input deskripsi dua
    And TCC.JC.077 User input judul tiga
    And TCC.JC.077 User input deskripsi tiga
    And TCC.JC.077 User input judul empat
    And TCC.JC.077 User input deskripsi empat
    And TCC.JC.077 User input publish

    Then TCC.JC.077 User click button simpan

  Scenario: TCC.JC.078 Input deskripsi dua kosong
    When TCC.JC.078 User go to web Tambah Benefit
    And TCC.JC.078 User input judul satu
    And TCC.JC.078 User input deskripsi satu
    And TCC.JC.078 User input judul dua
    And TCC.JC.078 User input deskripsi dua
    And TCC.JC.078 User input judul tiga
    And TCC.JC.078 User input deskripsi tiga
    And TCC.JC.078 User input judul empat
    And TCC.JC.078 User input deskripsi empat
    And TCC.JC.078 User input publish

    Then TCC.JC.078 User click button simpan

  Scenario: TCC.JC.079 Input deskripsi dua angka huruf
    When TCC.JC.079 User go to web Tambah Benefit
    And TCC.JC.079 User input judul satu
    And TCC.JC.079 User input deskripsi satu
    And TCC.JC.079 User input judul dua
    And TCC.JC.079 User input deskripsi dua
    And TCC.JC.079 User input judul tiga
    And TCC.JC.079 User input deskripsi tiga
    And TCC.JC.079 User input judul empat
    And TCC.JC.079 User input deskripsi empat
    And TCC.JC.079 User input publish

    Then TCC.JC.079 User click button simpan

  Scenario: TCC.JC.080 Input deskripsi dua simbol
    When TCC.JC.080 User go to web Tambah Benefit
    And TCC.JC.080 User input judul satu
    And TCC.JC.080 User input deskripsi satu
    And TCC.JC.080 User input judul dua
    And TCC.JC.080 User input deskripsi dua
    And TCC.JC.080 User input judul tiga
    And TCC.JC.080 User input deskripsi tiga
    And TCC.JC.080 User input judul empat
    And TCC.JC.080 User input deskripsi empat
    And TCC.JC.080 User input publish

    Then TCC.JC.080 User click button simpan

  Scenario: TCC.JC.081 Input judul tiga kosong
    When TCC.JC.081 User go to web Tambah Benefit
    And TCC.JC.081 User input judul satu
    And TCC.JC.081 User input deskripsi satu
    And TCC.JC.081 User input judul dua
    And TCC.JC.081 User input deskripsi dua
    And TCC.JC.081 User input judul tiga
    And TCC.JC.081 User input deskripsi tiga
    And TCC.JC.081 User input judul empat
    And TCC.JC.081 User input deskripsi empat
    And TCC.JC.081 User input publish

    Then TCC.JC.081 User click button simpan

  Scenario: TCC.JC.082 Input judul tiga angka huruf
    When TCC.JC.082 User go to web Tambah Benefit
    And TCC.JC.082 User input judul satu
    And TCC.JC.082 User input deskripsi satu
    And TCC.JC.082 User input judul dua
    And TCC.JC.082 User input deskripsi dua
    And TCC.JC.082 User input judul tiga
    And TCC.JC.082 User input deskripsi tiga
    And TCC.JC.082 User input judul empat
    And TCC.JC.082 User input deskripsi empat
    And TCC.JC.082 User input publish

    Then TCC.JC.082 User click button simpan

  Scenario: TCC.JC.083 Input judul tiga simbol
    When TCC.JC.083 User go to web Tambah Benefit
    And TCC.JC.083 User input judul satu
    And TCC.JC.083 User input deskripsi satu
    And TCC.JC.083 User input judul dua
    And TCC.JC.083 User input deskripsi dua
    And TCC.JC.083 User input judul tiga
    And TCC.JC.083 User input deskripsi tiga
    And TCC.JC.083 User input judul empat
    And TCC.JC.083 User input deskripsi empat
    And TCC.JC.083 User input publish

    Then TCC.JC.083 User click button simpan

  Scenario: TCC.JC.084 Input deskripsi tiga kosong
    When TCC.JC.084 User go to web Tambah Benefit
    And TCC.JC.084 User input judul satu
    And TCC.JC.084 User input deskripsi satu
    And TCC.JC.084 User input judul dua
    And TCC.JC.084 User input deskripsi dua
    And TCC.JC.084 User input judul tiga
    And TCC.JC.084 User input deskripsi tiga
    And TCC.JC.084 User input judul empat
    And TCC.JC.084 User input deskripsi empat
    And TCC.JC.084 User input publish

    Then TCC.JC.084 User click button simpan

  Scenario: TCC.JC.085 Input deskripsi tiga angka huruf
    When TCC.JC.085 User go to web Tambah Benefit
    And TCC.JC.085 User input judul satu
    And TCC.JC.085 User input deskripsi satu
    And TCC.JC.085 User input judul dua
    And TCC.JC.085 User input deskripsi dua
    And TCC.JC.085 User input judul tiga
    And TCC.JC.085 User input deskripsi tiga
    And TCC.JC.085 User input judul empat
    And TCC.JC.085 User input deskripsi empat
    And TCC.JC.085 User input publish

    Then TCC.JC.085 User click button simpan

  Scenario: TCC.JC.086 Input deskripsi tiga simbol
    When TCC.JC.086 User go to web Tambah Benefit
    And TCC.JC.086 User input judul satu
    And TCC.JC.086 User input deskripsi satu
    And TCC.JC.086 User input judul dua
    And TCC.JC.086 User input deskripsi dua
    And TCC.JC.086 User input judul tiga
    And TCC.JC.086 User input deskripsi tiga
    And TCC.JC.086 User input judul empat
    And TCC.JC.086 User input deskripsi empat
    And TCC.JC.086 User input publish

    Then TCC.JC.086 User click button simpan

  Scenario: TCC.JC.087 Input judul empat kosong
    When TCC.JC.087 User go to web Tambah Benefit
    And TCC.JC.087 User input judul satu
    And TCC.JC.087 User input deskripsi satu
    And TCC.JC.087 User input judul dua
    And TCC.JC.087 User input deskripsi dua
    And TCC.JC.087 User input judul tiga
    And TCC.JC.087 User input deskripsi tiga
    And TCC.JC.087 User input judul empat
    And TCC.JC.087 User input deskripsi empat
    And TCC.JC.087 User input publish

    Then TCC.JC.087 User click button simpan

  Scenario: TCC.JC.088 Input judul empat angka huruf
    When TCC.JC.088 User go to web Tambah Benefit
    And TCC.JC.088 User input judul satu
    And TCC.JC.088 User input deskripsi satu
    And TCC.JC.088 User input judul dua
    And TCC.JC.088 User input deskripsi dua
    And TCC.JC.088 User input judul tiga
    And TCC.JC.088 User input deskripsi tiga
    And TCC.JC.088 User input judul empat
    And TCC.JC.088 User input deskripsi empat
    And TCC.JC.088 User input publish

    Then TCC.JC.088 User click button simpan

  Scenario: TCC.JC.089 Input judul empat simbol
    When TCC.JC.089 User go to web Tambah Benefit
    And TCC.JC.089 User input judul satu
    And TCC.JC.089 User input deskripsi satu
    And TCC.JC.089 User input judul dua
    And TCC.JC.089 User input deskripsi dua
    And TCC.JC.089 User input judul tiga
    And TCC.JC.089 User input deskripsi tiga
    And TCC.JC.089 User input judul empat
    And TCC.JC.089 User input deskripsi empat
    And TCC.JC.089 User input publish

    Then TCC.JC.089 User click button simpan

  Scenario: TCC.JC.090 Input deskripsi empat kosong
    When TCC.JC.090 User go to web Tambah Benefit
    And TCC.JC.090 User input judul satu
    And TCC.JC.090 User input deskripsi satu
    And TCC.JC.090 User input judul dua
    And TCC.JC.090 User input deskripsi dua
    And TCC.JC.090 User input judul tiga
    And TCC.JC.090 User input deskripsi tiga
    And TCC.JC.090 User input judul empat
    And TCC.JC.090 User input deskripsi empat
    And TCC.JC.090 User input publish

    Then TCC.JC.090 User click button simpan

  Scenario: TCC.JC.091 Input deskripsi empat angka huruf
    When TCC.JC.091 User go to web Tambah Benefit
    And TCC.JC.091 User input judul satu
    And TCC.JC.091 User input deskripsi satu
    And TCC.JC.091 User input judul dua
    And TCC.JC.091 User input deskripsi dua
    And TCC.JC.091 User input judul tiga
    And TCC.JC.091 User input deskripsi tiga
    And TCC.JC.091 User input judul empat
    And TCC.JC.091 User input deskripsi empat
    And TCC.JC.091 User input publish

    Then TCC.JC.091 User click button simpan

  Scenario: TCC.JC.092 Input deskripsi empat simbol
    When TCC.JC.092 User go to web Tambah Benefit
    And TCC.JC.092 User input judul satu
    And TCC.JC.092 User input deskripsi satu
    And TCC.JC.092 User input judul dua
    And TCC.JC.092 User input deskripsi dua
    And TCC.JC.092 User input judul tiga
    And TCC.JC.092 User input deskripsi tiga
    And TCC.JC.092 User input judul empat
    And TCC.JC.092 User input deskripsi empat
    And TCC.JC.092 User input publish

    Then TCC.JC.092 User click button simpan





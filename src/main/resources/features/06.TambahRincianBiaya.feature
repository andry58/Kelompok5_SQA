Feature: Tambah Rincian Biaya

  Scenario: TCC.JC.045 Menampilkan form Tambah Rincian Biaya
    When TCC.JC.045 Admin klik button tambah rincian biaya
    Then TCC.JC.045 Form tambah rincian biaya ditampilkan

  Scenario: TCC.JC.046 Input Data Lengkap
    When TCC.JC.046 Admin input data lengkap
    And TCC.JC.046 Admin select status publish lengkap
    And TCC.JC.046 Admin klik button simpan
    Then TCC.JC.046 Data Berhasil di Tambah

  Scenario: TCC.JC.047 Kosongkan Nama Program
    When TCC.JC.047 Admin input data kosongkan Nama Program
    And TCC.JC.047 Admin select status publish active atau inactive
    And TCC.JC.047 Admin klik button simpan
    Then TCC.JC.047 Data gagal disimpan

  Scenario: TCC.JC.048 Kosongkan Harga Normal
    When TCC.JC.048 Admin input data Kosongkan Harga Normal
    And TCC.JC.048 Admin select status publish active atau inactive
    And TCC.JC.048 Admin klik button simpan
    Then TCC.JC.048 Data gagal disimpan

  Scenario: TCC.JC.049 Input Harga Normal menggunakan (huruf)
    When TCC.JC.049 Admin input data Harga Normal menggunakan huruf
    And TCC.JC.049 Admin select status publish active atau inactive
    And TCC.JC.049 Admin klik button simpan
    Then TCC.JC.049 Data gagal disimpan

  Scenario: TCC.JC.050 Kosongkan Diskon
    When TCC.JC.050 Admin input data Kosongkan Diskon
    And TCC.JC.050 Admin select status publish active atau inactive
    And TCC.JC.050 Admin klik button simpan
    Then TCC.JC.050 Data Berhasil di Tambah

  Scenario: TCC.JC.051 Input Diskon menggunakan (huruf)
    When TCC.JC.051 Admin input data Diskon menggunakan huruf
    And TCC.JC.051 Admin select status publish active atau inactive
    And TCC.JC.051 Admin klik button simpan
    Then TCC.JC.051 Data gagal disimpan

  Scenario: TCC.JC.052 Harga Diskon terisi otomatis
    When TCC.JC.052 Admin input data harga normal dan diskon
    And TCC.JC.052 Admin select status publish active atau inactive
    And TCC.JC.052 Admin klik button simpan
    Then TCC.JC.052 Data Harga diskon terisi otomatis

  Scenario: TCC.JC.053 Kosongkan Keunggulan satu
    When TCC.JC.053 Admin input data Kosongkan keunggulan satu
    And TCC.JC.053 Admin select status publish active atau inactive
    And TCC.JC.053 Admin klik button simpan
    Then TCC.JC.053 Data gagal disimpan

  Scenario: TCC.JC.054 Kosongkan Keunggulan dua
    When TCC.JC.054 Admin input data Kosongkan keunggulan dua
    And TCC.JC.054 Admin select status publish active atau inactive
    And TCC.JC.054 Admin klik button simpan
    Then TCC.JC.054 Data berhasil ditambahkan

  Scenario: TCC.JC.055 Kosongkan Keunggulan tiga
    When TCC.JC.055 Admin input data Kosongkan keunggulan tiga
    And TCC.JC.055 Admin select status publish active atau inactive
    And TCC.JC.055 Admin klik button simpan
    Then TCC.JC.055 Data berhasil ditambahkan

  Scenario: TCC.JC.056 Kosongkan Keunggulan empat
    When TCC.JC.056 Admin input data Kosongkan keunggulan empat
    And TCC.JC.056 Admin select status publish active atau inactive
    And TCC.JC.056 Admin klik button simpan
    Then TCC.JC.056 Data berhasil ditambahkan

  Scenario: TCC.JC.057 Kosongkan Keunggulan lima
    When TCC.JC.057 Admin input data Kosongkan keunggulan lima
    And TCC.JC.057 Admin select status publish active atau inactive
    And TCC.JC.057 Admin klik button simpan
    Then TCC.JC.057 Data berhasil ditambahkan

  Scenario: TCC.JC.058 Select status publish Active
    When TCC.JC.058 Admin input data
    And TCC.JC.058 Admin select status publish Active
    And TCC.JC.058 Admin klik button simpan
    Then TCC.JC.058 Data berhasil disimpan
    And TCC.JC.058 Rincian biaya berhasil dipublish

  Scenario: TCC.JC.059 Select status publish InActive
    When TCC.JC.059 Admin input data
    And TCC.JC.059 Admin select status publish Active
    And TCC.JC.059 Admin klik button simpan
    Then TCC.JC.059 Data hanya disimpan







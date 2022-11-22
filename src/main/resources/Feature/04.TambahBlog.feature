Feature: Tambah Blog

  Scenario: TCC.JC.142 User Masuk Ke Menu Blog
    When TCC.JC.142 User Menuju Tambah Blog

    Then TCC.JC.142 User Tampil Tambah Blog

  Scenario: TCC.JC.148 User Input Judul Blog
    When TCC.JC.148 User go to web Tambah Blog
    And TCC.JC.148 User input foto
    And TCC.JC.148 User input judul blog
    And TCC.JC.148 User input publish
    And TCC.JC.148 User input set to home
    And TCC.JC.148 User input content priview
    And TCC.JC.148 User input content

    Then TCC.JC.148 User klik buton simpan

  Scenario: TCC.JC.149 Kosongkan Judul Blog
    When TCC.JC.149 User Menu Tambah Blog
    And TCC.JC.149 User go to web Tambah Blog
    And TCC.JC.149 User input foto
    And TCC.JC.149 User input judul blog
    And TCC.JC.149 User input publish
    And TCC.JC.149 User input set to home
    And TCC.JC.149 User input content priview
    And TCC.JC.149 User input content

    Then TCC.JC.149 User klik buton simpan

  Scenario: TCC.JC.150 User Publish Active Blog
    When TCC.JC.150 User menu Tambah Blog
    And TCC.JC.150 User go to web Tambah Blog
    And TCC.JC.150 User input foto
    And TCC.JC.150 User input judul blog
    And TCC.JC.150 User input publish
    And TCC.JC.150 User input set to home
    And TCC.JC.150 User input content priview
    And TCC.JC.150 User input content

    Then TCC.JC.150 User klik buton simpan


  Scenario: TCC.JC.151 User Publish Noactive Blog
    When TCC.JC.151 User Menu Tambah Blog
    And TCC.JC.151 User go to web Tambah Blog
    And TCC.JC.151 User input foto
    And TCC.JC.151 User input judul blog
    And TCC.JC.151 User input publish
    And TCC.JC.151 User input set to home
    And TCC.JC.151 User input content priview
    And TCC.JC.151 User input content

    Then TCC.JC.151 User klik buton simpan

  Scenario: TCC.JC.152 User Pilih Set To Home Yes Blog
    When TCC.JC.152 User Menu Tambah Blog
    And TCC.JC.152 User go to web Tambah Blog
    And TCC.JC.152 User input foto
    And TCC.JC.152 User input judul blog
    And TCC.JC.152 User input publish
    And TCC.JC.152 User input set to home
    And TCC.JC.152 User input content priview
    And TCC.JC.152 User input content

    Then TCC.JC.152 User klik buton simpan

  Scenario: TCC.JC.153 User Pilih Set To Home No Blog
    When TCC.JC.153 User Menu Tambah Blog
    And TCC.JC.153 User go to web Tambah Blog
    And TCC.JC.153 User input foto
    And TCC.JC.153 User input judul blog
    And TCC.JC.153 User input publish
    And TCC.JC.153 User input set to home
    And TCC.JC.153 User input content priview
    And TCC.JC.153 User input content

    Then TCC.JC.153 User klik buton simpan

  Scenario: TCC.JC.154 User Input Content Priview Blog
    When TCC.JC.154 User Menu Tambah Blog
    And TCC.JC.154 User go to web Tambah Blog
    And TCC.JC.154 User input foto
    And TCC.JC.154 User input judul blog
    And TCC.JC.154 User input publish
    And TCC.JC.154 User input set to home
    And TCC.JC.154 User input content priview
    And TCC.JC.154 User input content

    Then TCC.JC.154 User klik buton simpan

  Scenario: TCC.JC.155 kosongkan Content Priview Blog
    When TCC.JC.155 User Menu Tambah Blog
    And TCC.JC.155 User go to web Tambah Blog
    And TCC.JC.155 User input foto
    And TCC.JC.155 User input judul blog
    And TCC.JC.155 User input publish
    And TCC.JC.155 User input set to home
    And TCC.JC.155 User input content priview
    And TCC.JC.155 User input content

    Then TCC.JC.155 User klik buton simpan


  Scenario: TCC.JC.156 User Content Blog
    When TCC.JC.156 User Menu Tambah Blog
    And TCC.JC.156 User go to web Tambah Blog
    And TCC.JC.156 User input foto
    And TCC.JC.156 User input judul blog
    And TCC.JC.156 User input publish
    And TCC.JC.156 User input set to home
    And TCC.JC.156 User input content priview
    And TCC.JC.156 User input content

    Then TCC.JC.156 User klik buton simpan

  Scenario: TCC.JC.157 Kosongkan Content Blog
    When TCC.JC.157 User Menu Tambah Blog
    And TCC.JC.157 User go to web Tambah Blog
    And TCC.JC.157 User input foto
    And TCC.JC.157 User input judul blog
    And TCC.JC.157 User input publish
    And TCC.JC.157 User input set to home
    And TCC.JC.157 User input content priview
    And TCC.JC.157 User input content

    Then TCC.JC.157 User klik buton simpan
Feature: Login

  Scenario: TCC.JC.001 Invalid URL
    When TCC.JC.001 Admin enter invalid URL
    Then TCC.JC.001 Admin gagal mengakses web, 404 file not found

  Scenario: TCC.JC.002 Valid URL
    When TCC.JC.002 Admin enter valid URL
    Then TCC.JC.002 Admin berhasil mengakses web juara coding

  Scenario: TCC.JC.003 Admin Kosongkan Username dan password
    When TCC.JC.003 Admin klik button sign-in null
    Then TCC.JC.003 Admin gagal login username dan passwor kosong

  Scenario: TCC.JC.004 Admin input invalid Username dan password
    When TCC.JC.004 Admin input invalid username password
    And TCC.JC.004 Admin klik button sign-in invalid
    Then TCC.JC.004 Admin gagal login username Atau Password Salah

  Scenario: TCC.JC.005 Admin input Username menggunakan (uppercase)
    When TCC.JC.005 Admin input Uppercase username dan password
    And TCC.JC.005 Admin Klik button sign-in uppercase
    Then TCC.JC.005 Admin gagal login username atau password Salah

  Scenario: TCC.JC.006 Admin valid login
    When TCC.JC.006 Admin berada di halaman login
    And TCC.JC.006 Admin input username password valid
    And TCC.JC.006 Admin Klik button sign-in valid
    Then TCC.JC.006 Admin berhasil login

  Scenario: TCC.JC.007 Admin logout
    When TCC.JC.007 Admin klik button logout
    Then TCC.JC.007 Admin berhasil logout kembali ke halaman login





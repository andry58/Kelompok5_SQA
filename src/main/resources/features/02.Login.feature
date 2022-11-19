Feature: Login

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






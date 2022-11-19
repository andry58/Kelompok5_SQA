Feature: Search Rincian Biaya

  Scenario: TCC.JC.041 Search Data by Diskon
    When TCC.JC.041 Admin input Diskon yang ingin dicari
    And TCC.JC.041 Admin klik keyword Diskon
    Then TCC.JC.041 Berhasil menampilkan data sesuai Diskon yang dicari

  Scenario: TCC.JC.042 Search Data by Nama Program
    When TCC.JC.042 Admin input Nama Program yang ingin dicari
    And TCC.JC.042 Admin klik keyword Nama Program
    Then TCC.JC.042 Berhasil menampilkan data sesuai Nama Program yang dicari

  Scenario: TCC.JC.043 Search Data by Harga-Normal
    When TCC.JC.043 Admin input Harga-Normal yang ingin dicari
    And TCC.JC.043 Admin klik keyword Harga-Normal
    Then TCC.JC.043 Berhasil menampilkan data sesuai Harga-Normal yang dicari

  Scenario: TCC.JC.044 Search Data by Harga-Diskon
    When TCC.JC.044 Admin input Harga-Diskon yang ingin dicari
    And TCC.JC.044 Admin klik keyword Harga-Diskon
    Then TCC.JC.044 Berhasil menampilkan data sesuai Harga-Diskon





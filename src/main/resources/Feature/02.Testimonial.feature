Feature: Testimonial

  Scenario: TCC.JC.008 Testimonial user Menu
    When TCC.JC.008 User click menu Home
    Then TCC.JC.008 User on menu Testimonial

  Scenario: TCC.JC.009 Add  Testimonial file uploud foto
    When TCC.JC.009 User click button add
    And  TCC.JC.009 User upload foto
    And  TCC.JC.009 User enter Nama Peserta
    And  TCC.JC.009 User select publish
    And  TCC.JC.009 User enter isi Testimonial
    And  TCC.JC.009 User select rating
    Then  TCC.JC.009 User click button save


  Scenario: TCC.JC.010 Add Testimonial uploud foto size maksimal 1 MB
    When TCC.JC.010 User click button add
    And  TCC.JC.010 User upload foto size maksimal 1 MB
    And  TCC.JC.010 User enter Nama Peserta
    And  TCC.JC.010 User select publish
    And  TCC.JC.010 User enter isi Testimonial
    And  TCC.JC.010 User select rating
    Then  TCC.JC.010 User click button save

  Scenario: TCC.JC.011 Add Testimonial uploud foto format selain gambar
    When TCC.JC.011 User click button add
    And  TCC.JC.011 User upload foto format selain gambar
    And  TCC.JC.011 User enter Nama Peserta
    And  TCC.JC.011 User select publish
    And  TCC.JC.011 User enter isi Testimonial
    And  TCC.JC.011 User select rating
    Then TCC.JC.011 User click button save

  Scenario: TCC.JC.012 Add Testimonial Tidak Uploud Foto
    When TCC.JC.012 User click button add
    And  TCC.JC.012 User Tidak upload foto
    And  TCC.JC.012 User enter Nama Peserta
    And  TCC.JC.012 User select publish
    And  TCC.JC.012 User enter isi Testimonial
    And  TCC.JC.012 User select rating
    Then  TCC.JC.012 User click button save

  Scenario: TCC.JC.013 Add Testimonial Input nama lengkap menggunakan huruf
    When TCC.JC.013 User click button add
    And  TCC.JC.013 User upload foto
    And  TCC.JC.013 User enter Nama Peserta menggunakan huruf
    And  TCC.JC.013 User select publish
    And  TCC.JC.013 User enter isi Testimonial
    And  TCC.JC.013 User select rating
    Then  TCC.JC.013 User click button save

  Scenario: TCC.JC.014 Add Testimonial Input nama lengkap  menggunakan simbol
    When TCC.JC.014 User click button add
    And  TCC.JC.014 User upload foto
    And  TCC.JC.014 User enter Nama Peserta menggunakan simbol
    And  TCC.JC.014 User select publish
    And  TCC.JC.014 User enter isi Testimonial
    And  TCC.JC.014 User select rating
    Then  TCC.JC.014 User click button save

  Scenario: TCC.JC.015 Add Testimonial Tidak Input Nama Peserta
    When TCC.JC.015 User click button add
    And  TCC.JC.015 User upload foto
    And  TCC.JC.015 User enter Tidak Input Nama Peserta
    And  TCC.JC.015 User select publish
    And  TCC.JC.015 User enter isi Testimonial
    And  TCC.JC.015 User select rating
    Then  TCC.JC.015 User click button save

  Scenario: TCC.JC.016 Add Testimonial Select Publish berdasarkan pilihan (Active)
    When TCC.JC.016 User click button add
    And  TCC.JC.016 User upload foto
    And  TCC.JC.016 User enter Nama Peserta
    And  TCC.JC.016 User select publish active
    And  TCC.JC.016 User enter isi Testimonial
    And  TCC.JC.016 User select rating
    Then  TCC.JC.016 User click button save

  Scenario: TCC.JC.017 Add Testimonial Select Publish  berdasarkan pilihan (No Active )
    When TCC.JC.017 User click button add
    And  TCC.JC.017 User upload foto
    And  TCC.JC.017 User enter Nama Peserta
    And  TCC.JC.017 User select publish No Active
    And  TCC.JC.017 User enter isi Testimonial
    And  TCC.JC.017 User select rating
    Then  TCC.JC.017 User click button save

  Scenario: TCC.JC.018 Add Testimonial Input Isi Testimonial  menggunakan huruf
    When TCC.JC.018 User click button add
    And  TCC.JC.018 User upload foto
    And  TCC.JC.018 User enter Nama Peserta
    And  TCC.JC.018 User select publish Active
    And  TCC.JC.018 User enter isi Testimonial menggunakan huruf
    And  TCC.JC.018 User select rating
    Then  TCC.JC.018 User click button save

  Scenario: TCC.JC.019 Add Testimonial Input Isi Testimonial  menggunakan simbol
    When TCC.JC.019 User click button add
    And  TCC.JC.019 User upload foto
    And  TCC.JC.019 User enter Nama Peserta
    And  TCC.JC.019 User select publish Active
    And  TCC.JC.019 User enter isi Testimonial menggunakan simbol
    And  TCC.JC.019 User select rating
    Then  TCC.JC.019 User click button save

  Scenario: TCC.JC.020 Add Testimonial Tidak Isi Testimonial
    When TCC.JC.020 User click button add
    And  TCC.JC.020 User upload foto
    And  TCC.JC.020 User enter Nama Peserta
    And  TCC.JC.020 User select publish Active
    And  TCC.JC.020 User enter Tidak Isi Testimonial
    And  TCC.JC.020 User select rating
    Then  TCC.JC.020 User click button save

  Scenario: TCC.JC.021 Add Testimonial Select Rating   berdasarkan pilihan
    When TCC.JC.021 User click button add
    And  TCC.JC.021 User upload foto
    And  TCC.JC.021 User enter Nama Peserta
    And  TCC.JC.021 User select publish Active
    And  TCC.JC.021 User enter isi Testimonial
    And  TCC.JC.021 User select rating berdasarkan pilihan
    Then  TCC.JC.021 User click button save

  Scenario: TCC.JC.022 Add Testimonial Button Simpan
    When TCC.JC.022 User click button add
    And  TCC.JC.022 User upload foto
    And  TCC.JC.022 User enter Nama Peserta
    And  TCC.JC.022 User select publish Active
    And  TCC.JC.022 User enter isi Testimonial
    And  TCC.JC.022 User select rating berdasarkan pilihan
    Then  TCC.JC.022 User click button save

  Scenario: TCC.JC.023 Testimonial Search Nama Peserta
    When TCC.JC.023 Admin input Search nama peserta
    Then TCC.JC.023 Admin click nama peserta


  Scenario: TCC.JC.024 Edit Testimonial Foto yang dipilih memiliki size maksimal 1 MB
    When TCC.JC.024 Admin upload foto Ulang size maksimal 1 MB
    Then  TCC.JC.024 Admin click button Simpan Edit


  Scenario: TCC.JC.025 Edit Testimonial Tidak Edit Uploud Foto
    When TCC.JC.025 Admin input Search nama peserta
    And  TCC.JC.025 Admin click nama peserta
    And  TCC.JC.025 Admin Tidak Edit Uploud Foto
    Then  TCC.JC.025 Admin click button Simpan Edit

  Scenario: TCC.JC.026 Edit Testimonial Edit nama lengkap menggunakan huruf
    When   TCC.JC.026 Admin click nama peserta
      And  TCC.JC.026 Admin Edit nama lengkap menggunakan huruf
       Then  TCC.JC.026 Admin click button Simpan Edit

  Scenario: TCC.JC.027 Edit Testimonial Edit nama lengkap menggunakan simbol
    When TCC.JC.027 Admin input Search nama peserta
    And  TCC.JC.027 Admin click nama peserta
      And  TCC.JC.027 Admin Edit nama Peserta menggunakan simbol
       Then  TCC.JC.027 Admin click button Simpan Edit

  Scenario: TCC.JC.028 Edit Testimonial Tidak Edit Nama Peserta
    When TCC.JC.028 Admin input Search nama peserta
    And  TCC.JC.028 Admin click nama peserta
       And  TCC.JC.028 Admin Tidak Edit Nama Peserta
        Then  TCC.JC.028 Admin click button Simpan Edit

  Scenario: TCC.JC.029 Edit Testimonial Edit Select Publish   berdasarkan pilihan (Active )
    When TCC.JC.029 Admin input Search nama peserta
    And  TCC.JC.029 Admin click nama peserta
    And  TCC.JC.029 Admin Edit Select Publish berdasarkan pilihan Active
        Then  TCC.JC.029 Admin click button Simpan Edit

  Scenario: TCC.JC.030 Edit Testimonial Edit  Select Publish   berdasarkan pilihan (No Active )
    When TCC.JC.030 Admin input Search nama peserta
    And  TCC.JC.030 Admin click nama peserta
    And  TCC.JC.030 Admin Edit  Select Publish berdasarkan pilihan No Active
    Then  TCC.JC.030 Admin click button Simpan Edit

  Scenario: TCC.JC.031 Edit Testimonial Edit  Isi Testimonial  menggunakan huruf
    When TCC.JC.031 Admin input Search nama peserta
    And  TCC.JC.031 Admin click nama peserta
    And  TCC.JC.031 Admin Edit  Isi Testimonial  menggunakan huruf
    Then  TCC.JC.031 Admin click button Simpan Edit

  Scenario: TCC.JC.032 Edit Testimonial Edit  Isi Testimonial menggunakan simbol
    When TCC.JC.032 Admin input Search nama peserta
    And  TCC.JC.032 Admin click nama peserta
    And  TCC.JC.032 Admin Edit  Isi Testimonial menggunakan simbol
    Then  TCC.JC.032 Admin click button Simpan Edit

  Scenario: TCC.JC.033 Edit Testimonial Tidak Edit Isi Testimonial
    When TCC.JC.033 Admin input Search nama peserta
    And  TCC.JC.033 Admin click nama peserta
    And  TCC.JC.033 Admin Tidak Edit Isi Testimonial
    Then  TCC.JC.033 Admin click button Simpan Edit

  Scenario: TCC.JC.034 Edit Testimonial Edit  Select Rating   berdasarkan pilihan (0, 1, 2, 3,4,5)
      When  TCC.JC.034 Admin click nama peserta
    And  TCC.JC.034 Admin Edit  Select Rating berdasarkan pilihan
    Then  TCC.JC.034 Admin click button Simpan Edit

  Scenario: TCC.JC.035 Edit Testimonial Menyimpan Edit Testimonial
    When TCC.JC.035 Admin input Search nama peserta
    And  TCC.JC.035 Admin click nama peserta
    And  TCC.JC.035 Admin upload foto Ulang size maksimal 1 MB
    And  TCC.JC.035 Admin Edit nama lengkap menggunakan huruf
    And  TCC.JC.035 Admin Edit Select Publish berdasarkan pilihan Active
    And  TCC.JC.035 Admin Edit  Isi Testimonial  menggunakan huruf
    And  TCC.JC.035 Admin Edit nama lengkap menggunakan huruf
    Then  TCC.JC.035 Admin click button Simpan Edit

















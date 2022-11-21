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
    And  TCC.JC.009 User click button save
    Then TCC.JC.009 Data Testimonial berhasil disimpan



  Scenario: TCC.JC.010 Add Testimonial uploud foto size maksimal 1 MB
    When TCC.JC.010 User click button add
    And  TCC.JC.010 User upload foto size maksimal 1 MB
    And  TCC.JC.010 User enter Nama Peserta
    And  TCC.JC.010 User select publish
    And  TCC.JC.010 User enter isi Testimonial
    And  TCC.JC.010 User select rating
    And  TCC.JC.010 User click button save
    Then TCC.JC.010 Data Testimonial berhasil disimpan



  Scenario: TCC.JC.011 Add Testimonial uploud foto format selain gambar
    When TCC.JC.011 User click button add
    And  TCC.JC.011 User upload foto format selain gambar
    And  TCC.JC.011 User enter Nama Peserta
    And  TCC.JC.011 User select publish
    And  TCC.JC.011 User enter isi Testimonial
    And  TCC.JC.011 User select rating
    Then  TCC.JC.011 User click button save


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
    And  TCC.JC.013 User click button save
    Then TCC.JC.013 Data Testimonial berhasil disimpan


  Scenario: TCC.JC.014 Add Testimonial Input nama lengkap  menggunakan simbol
    When TCC.JC.014 User click button add
    And  TCC.JC.014 User upload foto
    And  TCC.JC.014 User enter Nama Peserta menggunakan simbol
    And  TCC.JC.014 User select publish
    And  TCC.JC.014 User enter isi Testimonial
    And  TCC.JC.014 User select rating
    And  TCC.JC.014 User click button save
    Then TCC.JC.014 Data Testimonial tidak berhasil disimpan


  Scenario: TCC.JC.015 Add Testimonial Tidak Input Nama Peserta
    When TCC.JC.015 User click button add
    And  TCC.JC.015 User upload foto
    And  TCC.JC.015 User enter Tidak Input Nama Peserta
    And  TCC.JC.015 User select publish
    And  TCC.JC.015 User enter isi Testimonial
    And  TCC.JC.015 User select rating
    And  TCC.JC.015 User click button save
    Then TCC.JC.015 Data Testimonial tidak berhasil disimpan

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
    And  TCC.JC.017 User click button save
    Then TCC.JC.017 Data Testimonial berhasil disimpan



  Scenario: TCC.JC.018 Add Testimonial Input Isi Testimonial  menggunakan huruf
    When TCC.JC.018 User click button add
    And  TCC.JC.018 User upload foto
    And  TCC.JC.018 User enter Nama Peserta
    And  TCC.JC.018 User select publish Active
    And  TCC.JC.018 User enter isi Testimonial menggunakan huruf
    And  TCC.JC.018 User select rating
    And  TCC.JC.018 User click button save
    Then TCC.JC.018 Data Testimonial berhasil disimpan


  Scenario: TCC.JC.019 Add Testimonial Input Isi Testimonial  menggunakan simbol
    When TCC.JC.019 User click button add
    And  TCC.JC.019 User upload foto
    And  TCC.JC.019 User enter Nama Peserta
    And  TCC.JC.019 User select publish Active
    And  TCC.JC.019 User enter isi Testimonial menggunakan simbol
    And  TCC.JC.019 User select rating
    And  TCC.JC.019 User click button save
    Then TCC.JC.019 Data Testimonial tidak berhasil disimpan

  Scenario: TCC.JC.020 Add Testimonial Tidak Isi Testimonial
    When TCC.JC.020 User click button add
    And  TCC.JC.020 User upload foto
    And  TCC.JC.020 User enter Nama Peserta
    And  TCC.JC.020 User select publish Active
    And  TCC.JC.020 User enter Tidak Isi Testimonial
    And  TCC.JC.020 User select rating
    Then  TCC.JC.020 User click button save
    Then TCC.JC.020 Data Testimonial tidak berhasil disimpan


  Scenario: TCC.JC.021 Add Testimonial Select Rating   berdasarkan pilihan
    When TCC.JC.021 User click button add
    And  TCC.JC.021 User upload foto
    And  TCC.JC.021 User enter Nama Peserta
    And  TCC.JC.021 User select publish Active
    And  TCC.JC.021 User enter isi Testimonial
    And  TCC.JC.021 User select rating berdasarkan pilihan
    And  TCC.JC.021 User click button save
    Then  TCC.JC.021 Data Testimonial berhasil disimpan


  Scenario: TCC.JC.022 Add Testimonial Button Simpan
    When TCC.JC.022 User click button add
    And  TCC.JC.022 User upload foto
    And  TCC.JC.022 User enter Nama Peserta
    And  TCC.JC.022 User select publish Active
    And  TCC.JC.022 User enter isi Testimonial
    And  TCC.JC.022 User select rating berdasarkan pilihan
    And  TCC.JC.022 User click button save
    Then TCC.JC.022 Data Testimonial berhasil disimpan

















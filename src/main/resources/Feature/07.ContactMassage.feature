Feature: ContactMassage

Scenario: TCC.JC.0169 Add Contact Massage Membuka Menu Contact Massage
When TCC.JC.0169 Display form Web Juara coding
Then TCC.JC.0169 clik menu Contact

  Scenario: TCC.JC.0170 Add Contact Massage Input Full Name menggunakan huruf
    When TCC.JC.0170 Input Full Name Menggunakan huruf
    And  TCC.JC.0170 Input Email
    And  TCC.JC.0170 Input Nomor Telepon
    And  TCC.JC.0170 Input Subjek
    And  TCC.JC.0170  Input Massage
    Then TCC.JC.0170 clik Sand Massage

  Scenario: TCC.JC.0171 Add Contact Massage Input Full Name menggunakan simbol
    When TCC.JC.0171 Input Full Name Menggunakan simbol
    And  TCC.JC.0171 Input Email
    And  TCC.JC.0171 Input Nomor Telepon
    And  TCC.JC.0171 Input Subjek
    And  TCC.JC.0171  Input Massage
    Then TCC.JC.0171 clik Sand Massage

  Scenario: TCC.JC.0172 Add Contact Massage Tidak Input Full Name
    When TCC.JC.0172 Tidak Input Full Name
    And  TCC.JC.0172 Input Email
    And  TCC.JC.0172 Input Nomor Telepon
    And  TCC.JC.0172 Input Subjek
    And  TCC.JC.0172  Input Massage
    Then TCC.JC.0172 clik Sand Massage

  Scenario: TCC.JC.0173 Add Contact Massage Input Alamat Email
    When TCC.JC.0173 Input Full Name
    And  TCC.JC.0173 Input Alamat Email
    And  TCC.JC.0173 Input Nomor Telepon
    And  TCC.JC.0173 Input Subjek
    And  TCC.JC.0173  Input Massage
    Then TCC.JC.0173 clik Sand Massage

  Scenario: TCC.JC.0174 Add Contact Massage Tidak Input Alamat Email
    When TCC.JC.0174 Input Full Name
    And  TCC.JC.0174 Tidak Input Alamat Email
    And  TCC.JC.0174 Input Nomor Telepon
    And  TCC.JC.0174 Input Subjek
    And  TCC.JC.0174 Input Massage
    Then TCC.JC.0174 clik Sand Massage

  Scenario: TCC.JC.0175 Add Contact Massage Input nomor Telepon
    When TCC.JC.0175 Input Full Name
    And  TCC.JC.0175 Input Alamat Email
    And  TCC.JC.0175 Input Nomor Telepon
    And  TCC.JC.0175 Input Subjek
    And  TCC.JC.0175 Input Massage
    Then TCC.JC.0175 clik Sand Massage

  Scenario: TCC.JC.0176 Add Contact Massage Input Nomor Telepon menggunakan huruf
    When TCC.JC.0176 Input Full Name
    And  TCC.JC.0176 Input Alamat Email
    And  TCC.JC.0176 Input Nomor Telepon menggunakan huruf
    And  TCC.JC.0176 Input Subjek
    And  TCC.JC.0176 Input Massage
    Then TCC.JC.0176 clik Sand Massage


  Scenario: TCC.JC.0177 Add Contact Massage Tidak Input Nomor Telepon
    When TCC.JC.0177 Input Full Name
    And  TCC.JC.0177 Input Alamat Email
    And  TCC.JC.0177 Tidak Input Nomor Telepon
    And  TCC.JC.0177 Input Subjek
    And  TCC.JC.0177 Input Massage
    Then TCC.JC.0177 clik Sand Massage

  Scenario: TCC.JC.0178 Add Contact Massage Input Subject
    When TCC.JC.0178 Input Full Name
    And  TCC.JC.0178 Input Alamat Email
    And  TCC.JC.0178 Input Nomor Telepon
    And  TCC.JC.0178 Input Subjek
    And  TCC.JC.0178 Input Massage
    Then TCC.JC.0178 clik Sand Massage


  Scenario: TCC.JC.0179 Add Contact Massage Input Subject menggunakan menggunakan simbol
    When TCC.JC.0179 Input Full Name
    And  TCC.JC.0179 Input Alamat Email
    And  TCC.JC.0179 Input Nomor Telepon
    And  TCC.JC.0179 Input Subject menggunakan menggunakan simbol
    And  TCC.JC.0179 Input Massage
    Then TCC.JC.0179 clik Sand Massage

  Scenario: TCC.JC.0180 Add Contact Massage Tidak Input Subject
    When TCC.JC.0180 Input Full Name
    And  TCC.JC.0180 Input Alamat Email
    And  TCC.JC.0180 Input Nomor Telepon
    And  TCC.JC.0180 Tidak Input Subject
    And  TCC.JC.0180 Input Massage
    Then TCC.JC.0180 clik Sand Massage

  Scenario: TCC.JC.0181 Add Contact Massage Input Massage
    When TCC.JC.0181 Input Full Name
    And  TCC.JC.0181 Input Alamat Email
    And  TCC.JC.0181 Input Nomor Telepon
    And  TCC.JC.0181 Input Subjek
    And  TCC.JC.0181 Input Massage
    Then TCC.JC.0181 clik Sand Massage

  Scenario: TCC.JC.0182 Add Contact Massage Input  Massage  menggunakan simbol
    When TCC.JC.0182 Input Full Name
    And  TCC.JC.0182 Input Alamat Email
    And  TCC.JC.0182 Input Nomor Telepon
    And  TCC.JC.0182 Input Subjek
    And  TCC.JC.0182 Input  Massage  menggunakan simbol
    Then TCC.JC.0182 clik Sand Massage

  Scenario: TCC.JC.0183 Add Contact Massage Tidak Input  Massage
    When TCC.JC.0183 Input Full Name
    And  TCC.JC.0183 Input Alamat Email
    And  TCC.JC.0183 Input Nomor Telepon
    And  TCC.JC.0183 Input Subjek
    And  TCC.JC.0183 Tidak Input  Massage
    Then TCC.JC.0183 clik Sand Massage

  Scenario: TCC.JC.0184 Add Contact Massage Clik button Sand Massege
    When TCC.JC.0184 Input Full Name
    And  TCC.JC.0184 Input Alamat Email
    And  TCC.JC.0184 Input Nomor Telepon
    And  TCC.JC.0184 Input Subjek
    And  TCC.JC.0184 Input Massage
    Then TCC.JC.0184 clik Sand Massage



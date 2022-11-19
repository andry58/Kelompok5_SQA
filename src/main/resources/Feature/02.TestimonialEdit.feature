Feature:EditTestimonial

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


Feature: URL

Scenario: TCC.JC.001 Invalid URL
When TCC.JC.001 Admin enter invalid URL
Then TCC.JC.001 Admin gagal mengakses web, 404 file not found

Scenario: TCC.JC.002 Valid URL
When TCC.JC.002 Admin enter valid URL
Then TCC.JC.002 Admin berhasil mengakses web juara coding
Feature: login

  @login @NormalPositive
  Scenario: user dapat login dengan username dan password yang benar
    Given user ada pada login page
    When user memasukan username dan password dengan benar
    And user masukan username benar
    And user masukan password benar
    And user memilih login
    Then user terotentikasi
    And user masuk
    Then user ada didalam homepage

  @login
  Scenario: user user dapat login dengan username salah dan password benar
    Given user ada pada login page
    And user masukan username
    And user masukan password
    And user memilih login
    Then user tidak masuk ke homepage

  @login
  Scenario: user user dapat login dengan username benar dan password salah
    Given user ada pada login page
    And user masukan username
    And user masukan password
    And user memilih login
    Then user tidak masuk ke homepage

  @login
  Scenario: user user dapat login dengan username dan password salah
    Given user ada pada login page
    And user masukan username
    And user masukan password
    And user memilih login
    Then user tidak masuk ke homepage

  @login
  Scenario: user user tidak dapat memasukan username dan password
    Given user ada pada login page
    And user tidak memasukan username
    And user tidak memasukan password
    And user memilih login
    Then user tidak masuk ke homepage

  Scenario: user ada dihome page kemudian memilih pulsa
    Given user ada di homepage
    And user memilih account -> pulsa
    Then user masuk pada halaman pulsa

  @homepage
  Scenario: user ada dihome page kemudian berinteraksi dihalaman pulsa
    Given user ada dihome page
    And user mengisi nomor telepon
    When user memilih user nomor telepon
    Then sepulsa mendeteksi nomor telepon target
    And user memasukan nominal pulsa
    Then user dapat memilih nominal pulsa

  @homepage
  Scenario: user ada dihome page kemudian memilih voucher game
    Given user ada pada homepage
    And user memilih menu voucher game
    Then user masuk pada halaman voucher game


  @homepage @NegativeCase
  Scenario: user ada dihome page kemudian memilih voucher game
    Given user ada pada voucher game
    And user memilih menu voucher game
    Then user masuk pada halaman voucher game
    And user memilih voucher game steam wallet
    Then user mendapat pesan "maaf lagi tidak tersedia"

  @homepage
  Scenario: user ada dihome page kemudian memilih menu uang elektronik
    Given user ada pada home page kemudian memilih menu uang elektronik
    And user masuk kedalam halaman uang elektronik
    Then user ada pada halaman yang elektronik
    And user memilih menu metode uang elektronik (gopay contohnya)
    Then user masuk kedalam halaman permintaan uang elektronik gopay

  @pembayaran
  Scenario: user ada pada metode pembayaran
    Given user telah masuk dari halaman uang elektronik - gopay
    And user telah memasukan nominal uang gopay
    Then Sepulsa memberikan rincian transaksi
    And Sepulsa meminta "Apakah kamu punya kode promosi?"
    Then user memasukan jika punya
    And user tidak punya
    Then user memilih metode pembayaran

  @pembayaran @PositiveCase
  Scenario: user ada pada halaman pembayaran
    Given user diminta membayar nominal tagihan sepulsa
    And user memasukan nominal pembayaran
    Then gopay terkirim

  @pembayaran @NegaitveCase
  Scenario: user ada pada halaman pembayaran
    Given user diminta memabayar nominal tagihan sepulsa
    And user tidak memasukan nominal pembayaran
    Then gopay gagal terkirim

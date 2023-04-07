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

  @homepage @CasePositive
  Feature: homepage -> account

  Scenario: user ada dihome page kemudian memilih account
    Given user ada di homepage
    And user memilih account -> manage post&activiy
    Then user masuk pada halaman activity

  @homepage
  Scenario: user ada dihome page kemudian memilih job posting account
    Given user ada dihome page
    And user memilih account -> manage job posting account
    When user memilih job posting account
    Then user diminta login
    And user telah login
    Then user masuk kedalam user posting account dan diminta membuat personalisasi account linkedin

    @homepage
    Scenario: user ada dihome page kemudian memilih mynetwork
      Given user pada homepage
      And user memilih tab mynetwork
      Then user masuk pada halaman mynetwork

      @homepage
      Scenario: user  ada dihomepage kemudian memilih Connection
        Given user pada homepage
        And user menuju mynetwork -> connection
        Then user ada pada halaman myconnection


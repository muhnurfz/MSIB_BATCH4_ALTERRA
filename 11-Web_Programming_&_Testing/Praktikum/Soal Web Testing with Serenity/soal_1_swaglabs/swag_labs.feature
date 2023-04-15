Feature: login

  @loginSwag
  Scenario: user input account one
    Given  user input correct username "standard_user" and password "secret_sauce"
    Then user can login

  Scenario: user input account two
    Given user input username "locked_out_user" and password "secret_sauce"
    Then user cannot login, username wrong

  Scenario: user input account three
    Given user input username "problem_user" and password "secret_sauce"
    Then user cannot login, user unindentified

  Scenario: user input account four
    Given user input username "performance_glitch_user" and password "secret_sauce"
    Then user cannot login, user unindentified

  @homepage @product
  Scenario: user choose product sauce lab backpack
    Given user choose add to chart
    Then product inside cart product

  @homepage @product
  Scenario: user choose basket product
    Given user choose cart product icon
    Then user can see product description

  @cart @product
  Scenario: user remove item
    Given user choose remove item button
    Then product is removed

  @cart @product
  Scenario: user choose checkout item
    Given user choose checkout
    Then product is checkout

  @checkout
  Scenario: user have to give information
    Given user input information
    Then user information is add
    Given user choose continue
    Then user is given shipping information page

  @checkout
  Scenario: user see information checkout
    Given information granted as user
    Then  user verified
    Given user choose finish
    Then user confirmation code


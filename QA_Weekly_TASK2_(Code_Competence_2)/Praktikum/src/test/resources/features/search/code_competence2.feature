Feature: Login fake store API
  @fakestoreAPI
  Scenario: User login with correct username and password
    Given User call an api "/auth/login" method "POST"
    Then User verify "token" exist

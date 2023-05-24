
Feature: Login

  @success_login @login-1
  Scenario: Success login
    Given I open Login page
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

    @locked_out_user @login-2
  Scenario Outline: Login with locked out user
    Given I open Login page
    When I input "<username>" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then Error message with text "<errorMessageText>" is displayed
      Examples:
        |username                    |errorMessageText                                     |
        |locked_out_user             |Sorry, this user has been locked out.                |


  @unexisting_user @login-3
  Scenario: Login with unexisting user
    Given I open Login page
    When I input "gjdshjcsdj" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then Error message with text "Username and password do not match any user in this service" is displayed



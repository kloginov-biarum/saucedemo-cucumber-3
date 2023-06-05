@login
Feature: Login

 # Background:
 #   Given I open Login page


  @success_login @login-1
  Scenario: Success login
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory



    @locked_out_user @login-2
  Scenario Outline: Login with invalid user
    When I input "<username>" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then Error message with text "<errorMessageText>" is displayed
      Examples:
        |username                    |errorMessageText                                            |
        |locked_out_user             |Epic sadface: Sorry, this user has been locked out.                       |
        |gjdshjcsdj                  |Epic sadface: Username and password do not match any user in this service |


      @login-3
  Scenario Outline: Empty username
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then Error message with text "<errorMessageText>" is displayed
     Examples:
       | username |password     |errorMessageText                   |
       |          |fschgdfcd    |Epic sadface: Username is required |
       |svdsdcdc  |             |Epic sadface: Password is required |


        @login-4
  Scenario: Success Logout
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    And I click on burger menu
    When I follow the Logout link
    Then I am on the page Login
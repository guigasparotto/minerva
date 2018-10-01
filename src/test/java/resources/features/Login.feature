Feature: Login
#  Background: Access the login page
#    Given: user is on login page

  Scenario Outline: Login with valid credentials
    Given user is on login page
    When user enters "<username>" in the username field
    And user enters "<password>" in the password field
    And user clicks in the signin button
    Then user accesses dashboard
    And welcome message is displayed

    Examples:
      | username           | password |
      | gdadald3@gmail.com | 123456   |
      | gdadald9@gmail.com | 123456   |

  Scenario Outline: Login with invalid credentials
    Given user is on login page
    When user enters "<username>" in the username field
    And user enters "<password>" in the password field
    And user clicks in the signin button
    Then invalid password message is displayed

    Examples:
      | username           | password |
      | gdadald3@gmail.com | 123455   |
      |                    |          |

  Scenario Outline: Login with empty email
    Given user is on login page
    When user enters "<password>" in the password field
    And user clicks in the signin button
    Then empty email message is displayed

    Examples:
      | password  |
      | 123456    |
      |           |

  Scenario Outline: Login with empty password
    Given user is on login page
    When user enters "<username>" in the username field
    And user clicks in the signin button
    Then empty password message is displayed

    Examples:
      | username            |
      | gdadald3@gmail.com  |
      | invalid@invalid.com |

  Scenario: Navigate to create account page
    Given user is on login page
    When user enters a new email in the email address field
    And user clicks in the create an account button
    Then create an account page is loaded



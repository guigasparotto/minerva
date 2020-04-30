Feature: Login

  Background: User is about to login into the system
    Given user is on login page

  @Login
  Scenario Outline: Login with valid credentials
    When user enters "<username>" in the username field
    And user enters "<password>" in the password field
    And user clicks in the signin button
    Then user accesses dashboard
    And welcome message is displayed

    Examples:
      | username           | password |
      | gdadald3@gmail.com | 123456   |
      | gdadald9@gmail.com | 123456   |

  @Login
  Scenario Outline: Login with invalid credentials
    When user enters "<username>" in the username field
    And user enters "<password>" in the password field
    And user clicks in the signin button
    Then invalid password message is displayed

    Examples:
      | username           | password |
      | gdadald3@gmail.com | 123455   |
      |                    |          |

  @Login
  Scenario Outline: Login with empty email
    When user enters "<password>" in the password field
    And user clicks in the signin button
    Then empty email message is displayed

    Examples:
      | password  |
      | 123456    |
      |           |

  @Login
  Scenario Outline: Login with empty password
    When user enters "<username>" in the username field
    And user clicks in the signin button
    Then empty password message is displayed

    Examples:
      | username            |
      | gdadald3@gmail.com  |
      | invalid@invalid.com |

  @Login
  Scenario: Navigate to create account page
    When user enters a new email in the email address field
    And user clicks in the create an account button
    Then create an account page is loaded



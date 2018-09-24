Feature: Login

Scenario Outline: Login with valid credentials

  Given user is on login page
  When user enters "<username>" in the username field
  And user enters "<password>" in the password field
  And user clicks in the signin button
  Then user accesses dashboard
  And welcome message is displayed

Examples:
  | username | password |
  | gdadald3@gmail.com | 123456 |
  | gdadald9@gmail.com | 123456 |

Scenario Outline: Login with invalid credentials

  Given user is on login page
  When user enters "<username>" in the username field
  And user enters "<password>" in the password field
  And user clicks in the signin button
  Then invalid password message is displayed

Examples:
  | username | password |
  | gdadald3@gmail.com | 1234 |
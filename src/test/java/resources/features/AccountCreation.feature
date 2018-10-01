Feature: Account Creation

  Scenario: Create an account
    Given create an account page is loaded
    When user enters their personal information
      | title | firstName | lastName  | password  | birthDay  | birthMonth  | birthYear | newsLetters | offers  |
      | Mr    | John      | Doe       | 123456    | 2         | 3           | 1990      | true        | true    |
    And user enters their address information
      | Fields      | Values        |
      | firstName   | John          |
      | lastName    | Doe           |
      | company     | Company       |
      | address     | 1 House       |
      | complement  | 27 Road A     |
      | city        | LA            |
      | state       | California    |
      | postal      | 00000         |
      | country     | United States |
      | addInfo     | N/A           |
      | homePhone   | 5552727       |
      | mobile      | 9992727       |
      | addrAlias   | Alias         |
    And user clicks in the register button
    Then registration is complete
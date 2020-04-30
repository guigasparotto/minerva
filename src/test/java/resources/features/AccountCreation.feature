Feature: Account Creation

  @AccountCreation
  Scenario Outline: Create an account
    Given user is on create an account page
    When user enters their personal information from "<row>"
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

    Examples:
      | row |
      | 1   |
      | 2   |

   @AccountCreation
   Scenario: Create an account with required fields only
     Given user is on create an account page
     When user enters the required personal information
       | John      | Doe       | 123456    |
     And user enters their address information
       | Fields      | Values        |
       | firstName   | John          |
       | lastName    | Doe           |
       | company     |               |
       | address     | 1 House       |
       | complement  |               |
       | city        | LA            |
       | state       | California    |
       | postal      | 00000         |
       | country     | United States |
       | addInfo     |               |
       | homePhone   |               |
       | mobile      | 9992727       |
       | addrAlias   | Alias         |
     And user clicks in the register button
     Then registration is complete

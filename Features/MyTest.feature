Feature: Reset functionality on login page of Application


  @NON-UI
  Scenario Outline: Check if String is Palindrome
    Given I entered word <wordToTest>
    When I test it for Palindrome
    Then the output should be <output>
    Examples:
      | wordToTest | output  |
      | "Refer"    | "true"  |
      | "Coin"     | "false" |
      | "Space"    | "false" |
      | "racecar"  | "true"  |

  @UI
  Scenario: Check valid login
    Given user is on Login Page
    When user has provided valid credentials
    Then user should be able to login
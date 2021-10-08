Feature: Reset functionality on login page of Application


  Scenario: Verification of Reset button
  Given Open the Firefox and launch the application
  When Enter the Username and Password
  Then Reset the credential


  Scenario Outline: Verification of Reset button with outline
  Given Open the Firefox and launch the application
  When Enter the Username <username> and Password <password>
  Then Reset the credential
  
  Examples:
  | username | password  |
  | User1    | password1 |
  | User2    | password2 |
  | User3    | password3 |

  @UpdateProfile
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
  


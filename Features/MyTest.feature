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


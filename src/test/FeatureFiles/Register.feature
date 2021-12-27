Feature: Register functionality

  Scenario Outline: Verify Bank Register feature is working successfully
    Given User opens Bank Registeration screen
    When user enter all mandatory details
    And clicks on Submit
    Then user will be registered successfully
    Examples:
      |  |
Feature: Login functionality

  Scenario Outline: Verify Bank Login is working successfully
    Given User opens Bank Login "<url>"
    When user enters "<username>" and "<password>"
    And clicks on Login button
    Then user should be logged in successfully
    And on clicking logout using user be successfully logged out
    And browser should be closed

    Examples:


      |url| username   | password |
      | http://demo.guru99.com/V1/index.php|mngr136913 | Omn@12   |
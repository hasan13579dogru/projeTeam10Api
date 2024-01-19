Feature: US07 Managementonschools Page Test
  Scenario:TC01 verification test

    Given  go to managementonschools.com
    Then Click the login button on the homepage
    And Log in as Dean
    And Click on the menu button
    And Click Contact Get All
    And Verify that the contact message is visible
    And Name Email Date Subject Message Verify visible
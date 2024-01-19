@smoke
Feature: US08 Managementonschools Page Test
  Scenario: TC01 Add lesson
    Given go to browser https:managementonschools.com
    Then Click the login button on the homepage
    And Log in as Vice Dean
    And Click on the menu button at homepage
    And Click Lesson Management
    And Click the Lessons text
    And Click the lesson name box
    And Enter Lesson Name
    And Click the Compulsory
    Then Verify that the compulsory box can be selected
    And Click the credit score
    And Enter the credit score(8)
    And Click the Submit button
    And  Sayfayi kapat
    #And Verify that Lessons has been created
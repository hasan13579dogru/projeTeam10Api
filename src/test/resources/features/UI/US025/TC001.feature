Feature: US25  Managementonschools Page Test
  @smoke
  Scenario: Create a student
    Given go to "https://managementonschools.com/"
    Then Click the Login button on the home page
    And Log in as admin
    And Click the Menu button
    And Verify that the Main Menu is visible
    And Student Management verify that it is visible
    Then Click the Student Management
    And Click Choose Advisor Teacher box
    And  Choose Advisor Teacher Confirm selectable
    And Enter name,surname,birth place,email,phone
    And Click Male
    And Enter date of birth,ssn,username, father name, mother name,password
    And Click the Submit buttonnn
    And Verify that "Student saved successfully" isdisplayed
    And Sayfayi kapat

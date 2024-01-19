@admin
Feature:Student was created by Admin

  Scenario: Student was created successfully
    Given Admin sends a request to find the student
    And Student information to be sent is prepared
    When Send a post request to add a student
    Then Admin verifies that the student credentials contains birthPlace, gender, fatherName, birthDay,advisorTeacherId, phoneNumber, surname, name, motherName, email, username, ssn, password














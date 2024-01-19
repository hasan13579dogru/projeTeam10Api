@US08Api @Api @US08E2E
Feature: Vice Dean should be able to create lesson

  Scenario Outline: US08 Validate the resulting Lesson (Api)

    Given get request with lessonName

    Then verify body with lesson: lessonId="<lessonId>", lessonName="<lessonName>", creditScore="<creditScore>",  compulsory="<compulsory>", message="<message>"
    Examples:
      | lessonId | lessonName | creditScore | compulsory | message                   |
      | 1252     | English4   | 5           | true       | Lesson successfully found |


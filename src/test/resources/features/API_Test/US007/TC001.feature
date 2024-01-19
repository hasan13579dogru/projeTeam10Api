@US07Api @Api @US07E2E
Feature: Dean, kullanıcıların gönderdiği mesajları görebilmelidir.


  Scenario Outline: US07 Mesajı doğrula (Api)

    Given Get request ile tum mesajlari al
    Then Verify body: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name   | email            | subject | message          | date       |
      | Team10 | team10@gmail.com | Proje   | Daha dikkatli ol | 2023-09-18 |


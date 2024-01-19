Feature: Vice Dean, teacher must be created.



  Scenario:01 ( Teacher Olusturma Pozitif Test) TC01
    Given Anasayfaya gider
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
    Then Kullanici Menu tiklar
    Then Kullanici Teacher Management yazisina tiklar
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then kullanici Add Teacher formu doldurur
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Teacher saved successfully" yazisinin gorunurlugunu dogrular

  Scenario Outline: Teacher olusturuldugunu database'e dogrulama
    Given Database bagla
    When username "<username>" ile teacheri getir
    Then  kullanici bodynin "<name>" "<Surname>" "<Birth Place>" "<email>" "<Phone>" "<Gender>" "<Date Of Birth>" "<Ssn>" "<User Name>" bilgilerini icerdigini dogrular
    Examples:
      | name             | Surname  | Birth Place | email                      | Phone        | Gender | Date Of Birth | Ssn         | User Name   |
      | Christy Anderson | Schinner | Mohrport    | marcus.greenholt@gmail.com | 497-241-0373 | 0      | 2015-06-15    | 855-19-5051 | jolyn.nolan |




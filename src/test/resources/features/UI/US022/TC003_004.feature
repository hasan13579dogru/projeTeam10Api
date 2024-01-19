@US22
Feature: US022 Admin Ekleme
  Background: Admin Login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Admin hesabiyla login ol
    Then Admin hesabi ile giris yapildigini dogrula
    Then Admin Management  yazısının gorunurlugunu dogrula
    Then Add Admin yazisinin gorundugunu dogrula

  Scenario: TC03 Gender ve Bos birakilma Negative Scenaio
    When Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    And Phone Number alanina on iki karakterden az "123 654" gir
    Then Minimum 12 character (XXX-XXX-XXXX) mesajının gorunurlugunu dogrula
    When SSN alanına  on bir charecterden az bir "144-26-" gir
    Then Minimum 11 character (XXX-XX-XXXX) mesajının gorunurlugunu dogrula
    And Phone Number alanina on iki karakterden az "123 654" gir
  #Phone alanina geceriz bır phone gir
    And Gender seceneklerinden "<MALE>"  sec
    Then Gender kutucugunun tiklanabildigini dogrula
    When Date Of Birth alaninda "12112089" girr
    When SSN alanına  on bir charecterden az bir "144-26-" gir
    And User Name alanina user name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    And "Phone number should be exact 12 characters" mesajının gorunurlugunu dogrula
    And "Please enter valid SSN number" mesajının gorunurlugunu dogrula
    And "gecmis tarih olmali" mesajının gorunurlugunu dogrula
    And Sayfayi kapat


  Scenario: TC04 Password Negative Scenaio
    When Password alanina sekiz karakterden az bir "teAm10" girer
    Then "At least 8 characters" password mesajinin gorundugunu dogrula
    When Sayfayi yenile
    And Password alanina sekiz karakterli buyuk harf icermeyen "team10**" gir
    Then "One uppercase character" passwordBir mesajinin gorundugunu dogrula
    When Sayfayi yenile
    And Password alanina sekiz karakterli rakam icermeyen "teamOn.." gir
    Then "One number" passwordIki mesajinin gorundugunu dogrula
    When Sayfayi yenile
    And Password alanina sekiz karakterli kucuk harf icermeyen "TEAM10**" gir
    Then "One lowercase character" passwordUc mesajinin gorundugunu dogrula
    And Sayfayi kapat
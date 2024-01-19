
Feature: US022 Admin Ekleme
  Background: Admin Login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Admin hesabiyla login ol
    Then Admin hesabi ile giris yapildigini dogrula
    Then Admin Management  yazısının gorunurlugunu dogrula
    Then Add Admin yazisinin gorundugunu dogrula
  @smoke
  Scenario:TC001 Admin Ekleme(BOS SENERYO VE Gender Negatıve Scenario)
    And Submit butonuna tiklaa
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda "28051999" gir
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "ssn" gir
    And User Name alanina user name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    #Then "Student saved Sccessfully" mesajini dogrulaa
    And Sayfayi kapat

  Scenario: TC02 Bos birakilma Negative Scenaio
    When Submit butonuna tiklaa
    Then Required yazisini dogrula (Name)
    And Required yazisini dogrula (Surname)
    And Required yazisini dogrula (Birth Place)
    And Required yazisini dogrula (Phone Number)
    And Required yazisini dogrula (Date Of Birth)
    And Required yazisini dogrula (Ssn )
    Then Required yazisini dogrula (UserName)
    Then Enter your password yazisini dogrula (Password)
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "<SSN>" gir
    And User Name alanina user name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "You have entered an invalid value. Valid values are: MALE, FEMALE" mesajinin gorundugunu dogrula
    And Sayfayi kapat


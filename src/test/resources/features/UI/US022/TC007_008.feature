@US22
Feature: US022 Admin Ekleme
  Background: Admin Login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Admin hesabiyla login ol
    Then Admin hesabi ile giris yapildigini dogrula
    Then Admin Management  yazısının gorunurlugunu dogrula
    Then Add Admin yazisinin gorundugunu dogrula

  Scenario:TC007 Negatif Seneryo (Phone)
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    When Phone alanına 3.  ve 5.  rakamadan  sonra bosluk bir bosluk bırakarak bır "<312 546 9836>" gır  (Kayitli phone )
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "ssn" gir
    And User Name alanina user name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "Error: User with phone number 312 546 9836  already register'" mesajinin gorundugunu dogrula
    Then Giris yapilamadigini dogrula
    And Sayfayi kapat


   Scenario: TC008 Negatif Seneryo (SSN)
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" içeren "562-84-9523" gir (Kayitli ssn )
    And User Name alanina user name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "Error: User with ssn 562-84-9523 already register'" mesajinin gorundugunu dogrula
    Then Giris yapilamadigini dogrula(ssn verify)
    And Sayfayi kapat
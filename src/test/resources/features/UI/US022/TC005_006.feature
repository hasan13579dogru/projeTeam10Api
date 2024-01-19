@US22
Feature: US022 Admin Ekleme
  Background: Admin Login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Admin hesabiyla login ol
    Then Admin hesabi ile giris yapildigini dogrula
    Then Admin Management  yazısının gorunurlugunu dogrula
    Then Add Admin yazisinin gorundugunu dogrula

  Scenario: TC005 Karakter Sayisi Negatif Seneryo
    And Name alanına tek karakter "a" gir
    And Surname alanına tek karakter "f" gir
    And BirthPlace alanına "a" gir(Dogum Yeri)
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    When Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "<SSN>" gir
    And User Name alanina tek karakter  "A" gir
    And  Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "Your name  should be at least 2 characters" mesajının  gorundugunu dogrula
    Then "Your surname should be at least 2 characters" mesajının  gorundugunu dogrula
    Then "Your birth place should be at least 2 characters" mesajının  gorundugunu dogrula
    Then "Your username  should be at least 4 characters" mesajının  gorundugunu dogrula
    And Sayfayi yenile
    And Name alanına tek karakter ve bosluk "g " gir
    And Surname alanına tek karakter ve bosluk "g " gir
    And Birth Place alanına tek karakter ve bosluk "g " gir(Dogum Yeri)
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "<SSN>" gir
    And User Name alanini sil
    And User Name alanina user name gir
    And  Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then Giris yapilamadigini dogrulaa
    And Sayfayi kapat

  Scenario: TC006 Negatif Seneryo (Username Defauld ve Spesifik Karakter)
    And Name alanına rakam "1263" gir
    When Surname alanına  spesifik karakter, rakam "//-+" gir
    And Birth Place alanına spesifik karakter, rakam "12_'+" gir(Dogum Yeri)
    When Phone alanına 3.  ve 5.  rakamadan  sonra bosluk bir bosluk bırakarak bır "<312 546 9852>" gır  (Kayitli phone )
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And  Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Ssn alanina 3. ve 5. rakamdan sonra "-" içeren "562-84-9523" gir (Kayitli ssn )
    And UserName alanina kayitli bir "ViceDeanTeam10" gir
    And Submit butonuna tiklaa
    Then Error: User with username ViceDeanTeam10 already register' mesajinin gorundugunu dogrula
    And User Name alanini sil
    When User Name alanina user name gir
    And Submit butonuna tiklaa
    Then "Error: User with ssn 562-84-9523 already register'" mesajinin gorundugunu dogrula
    And  Sayfayi kapat


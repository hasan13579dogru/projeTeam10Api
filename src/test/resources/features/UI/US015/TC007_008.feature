@deneme1
Feature:US015 Vice Dean, öğrenci oluşturabilmelidir.
  Background:Vice Dean login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Vice Dean hesabiyla login ol
    Then Vice Dean hesabi ile giris yapildigini dogrula
    When Menu butonuna tikla
    Then Main Menu pencerisinin acildigini dogrula
    And Acilan pencerede Student Managemen yazisinin gorundugunu dogrula
    When Acilan pencerede Student Management alanina tikla
    Then Acilan sayfada Student Management yazisini dogrula
    And Add Student yazisinin gorundugunu dogrula


  Scenario:TC007 Negatif Seneryo (Phone)
    And Choose Teacher yazisina tikla
    And Cikan seceneklerden "team10 Team10" sec
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    When Email alanına email gir
    When Phone alanına 3.  ve 5.  rakamadan  sonra bosluk bir bosluk bırakarak bır "<312 546 9852>" gır  (Kayitli phone )
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "ssn" gir
    And User Name alanina user name gir
    And Father Name alanina Father name gir
    And Mother Name alanina Mother name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "Error: User with phone number 312 546 9836  already register'" mesajinin gorundugunu dogrula
    And Sayfayi kapat



  Scenario:TC008 Negatif Seneryo (SSN)
    And Choose Teacher yazisina tikla
    And Cikan seceneklerden "team10 Team10" sec
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    When Email alanına email gir
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" içeren "562-84-9523" gir (Kayitli ssn )
    And User Name alanina user name gir
    And Father Name alanina Father name gir
    And Mother Name alanina Mother name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    Then "Error: User with ssn 562-84-9523 already register'" mesajinin gorundugunu dogrula
    And Sayfayi kapat





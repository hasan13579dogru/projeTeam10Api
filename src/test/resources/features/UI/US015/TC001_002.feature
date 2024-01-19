

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
@smoke
  Scenario: TC01 Pozitive Scenerio
    When Choose Teacher yazisina tikla
    And Cikan seceneklerden "<Teacher>" sec
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    When Email alanına email gir
    #gecerli email
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Gender seceneklerinden "<MALE>"  sec
    And Date Of Birth alaninda "28051999" gir
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "ssn" gir
    And User Name alanina user name gir
    And Father Name alanina Father name gir
    And Mother Name alanina Mother name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    And Submit butonuna tiklaa
    #Then "Student saved Sccessfully" mesajini dogrulaa
    And Sayfayi kapat


  @US15_TC002
  Scenario: TC02 Email Gender ve Bos birakilma Negative Scenaio
    When Submit butonuna tiklaa
    Then Required yazisini dogrula (Name)
    And Required yazisini dogrula (Surname)
    And Required yazisini dogrula (Birth Place)
    And Required yazisini dogrula (Email )
    And Required yazisini dogrula (Phone Number)
    And Required yazisini dogrula (Date Of Birth)
    And Required yazisini dogrula (Ssn )
    Then Required yazisini dogrula (UserName)
    And Required yazisini dogrula (Father Name)
    And Required yazisini dogrula (Mother Name)
    Then Enter your password yazisini dogrula (Password)
    And Cikan seceneklerden "team10 Team10" sec
    And Name alanina name gir
    And Surname alanina surname gir
    And Birth Place alanina "<Birth Place>" gir
    And Phone alanina 3.  ve 5.  rakamadan  sonra  bir "<bosluk>" birakarak bir "<Phonenumber>" gir
    And Date Of Birth alaninda date ikonuna tikla
    And Ssn alanina 3. ve 5. rakamdan sonra "-" iceren "<SSN>" gir
    And User Name alanina user name gir
    And Father Name alanina Father name gir
    And Mother Name alanina Mother name gir
    And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
    When Email email alanina email gir
    And Submit butonuna tiklaa
    Then "You have entered an invalid value. Valid values are: MALE, FEMALE" mesajinin gorundugunu dogrula
    And Gender seceneklerinden "<MALE>"  sec
    Then Gender kutucugunun tiklanabildigini dogrula
    When Email email alanina email gir
    And Submit butonuna tikla
    And Email alaninin uzerinde mause ile bekle
    When Email alanina "@" gir
    And Submit butonuna tikla
    And Email alaninin uzerinde mause ile bekle
    When Email alanina "gmail" gir
    And Submit butonuna tikla
    Then Giris yapilamadigini dogrulaa
    And Sayfayi kapat

@all
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


   Scenario: TC03 Gender ve Bos birakilma Negative Scenaio
   When Name alanina name gir
   And Surname alanina surname gir
   And Birth Place alanina "<Birth Place>" gir
   When Email alanına email gir
   And Phone Number alanina on iki karakterden az "123 654" gir
   Then Minimum 12 character (XXX-XXX-XXXX) mesajının gorunurlugunu dogrula
   When SSN alanına  on bir charecterden az bir "144-26-" gir
   Then Minimum 11 character (XXX-XX-XXXX) mesajının gorunurlugunu dogrula
   And Phone Number alanina on iki karakterden az "123 654" gir
   And Gender seceneklerinden "<MALE>"  sec
   Then Gender kutucugunun tiklanabildigini dogrula
   When Date Of Birth alaninda "12112089" girr
   When SSN alanına  on bir charecterden az bir "144-26-" gir
   And User Name alanina user name gir
   And Father Name alanina Father name gir
   And Mother Name alanina Mother name gir
   And Password alanina en az 8 karakterli buyuk harf, kucuk harf ve bir rakam iceren "<Password>" "gir
   And Submit butonuna tiklaa
   Then "Please select advisor teacher" mesajının gorunurlugunu dogrula
   Then "Phone number should be exact 12 characters" mesajının gorunurlugunu dogrula
   Then "Please enter valid SSN number" mesajının gorunurlugunu dogrula
   Then "gecmis tarih olmali" mesajının gorunurlugunu dogrula
   And Sayfayi kapat



  Scenario: TC04 Password Negative Scenaio
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
    When Password alanina sekiz karakterden az bir "teAm10" girer
    #Password alanina 8 karakterden az password gir
    Then "At least 8 characters" password mesajinin gorundugunu dogrula
    #At least 8 characters
    When Sayfayi yenile
    And Password alanina sekiz karakterli buyuk harf icermeyen "team10**" gir
    #Password alanina 8 karakterli buyuk harf icermeyen password gir
    Then "One uppercase character" password mesajinin gorundugunu dogrula
    #One uppercase character
    When Sayfayi yenile
    And Password alanina sekiz karakterli rakam icermeyen "teamOn.." gir
    #Password alanina 8 karakterli rakam icermeyen password gir
    Then "One number" password mesajinin gorundugunu dogrula
    #One number
    When Sayfayi yenile
    And Password alanina sekiz karakterli kucuk harf icermeyen "TEAM10**" gir
    #Password alanina 8 karakterli kucuk harf icermeyen password gir
    Then "One lowercase character" password mesajinin gorundugunu dogrula
    And Sayfayi kapat

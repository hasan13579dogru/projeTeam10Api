Feature: Vice Dean, teacher must be created.
  Background:
    Given Anasayfaya gider
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
    Then Kullanici Menu tiklar
    Then Kullanici Teacher Management yazisina tiklar


  Scenario:01 ( Teacher Olusturma Pozitif Test) TC01
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then kullanici Add Teacher formu doldurur
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Teacher saved successfully" yazisinin gorunurlugunu dogrular
     And Sayfayi kapat


  Scenario:02 (Zorunlu Alnaların Boş Bırakılması Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici submit butonu tiklar
    Then kullanici  bos birakilan name alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan Surname alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan Birth Place alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan Email alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan Phone Number alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan Date Of Birth alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan SSN alaninda Required uyari yazisi geldigini dogrular
    Then kullanici  bos birakilan username alaninda Required uyari yazisi geldigini dogrular
    Then kullanici Enter your password yazisini dogrular


  @Negatif
  Scenario:03  (Cinsiyet Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Cinsiyet secilmez.
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "You have entered an invalid value. Valid values are: MALE, FEMALE" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir

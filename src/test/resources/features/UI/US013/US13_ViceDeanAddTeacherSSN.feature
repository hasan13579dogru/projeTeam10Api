Feature: Vice Dean, teacher must be created.
  Background:
    Given Anasayfaya gider
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
    Then Kullanici Menu tiklar
    Then Kullanici Teacher Management yazisina tiklar

  Scenario:01  (SSN Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Kullanici SSN alanina harf iceren bir SSN degeri girer
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Please enter valid SSN number" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:02 (SSN Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Kullanici SSN alanina ucuncu rakamdan sonra '-' icermeyen bir SSN degeri girer
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Minimum 11 character (XXX-XX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:03 (SSN Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Kullanici SSN alanina besinci rakamdan sonra '-' icermeyen bir SSN degeri girer
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Minimum 11 character (XXX-XX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir



  Scenario:04 (SSN Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Kullanici SSN alanina ucuncu ve besinci rakamdan sonra '-' icermeyen bir SSN degeri girer
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "Minimum 11 character (XXX-XX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


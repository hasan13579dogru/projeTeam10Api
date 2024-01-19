Feature: Vice Dean, teacher must be created.

  Background:
    Given Anasayfaya gider
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
    Then Kullanici Menu tiklar
    Then Kullanici Teacher Management yazisina tiklar


  Scenario:01  (Phone Number Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina 'XXX-XXX-XXX' seklinde "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "Minimum 12 character (XXX-XXX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:02  (Phone Number Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina XXXXXX-XXXX  seklinde "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "Minimum 12 character (XXX-XXX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:03  (Phone Number Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina XXX-XXXYXXX  seklinde "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "Minimum 12 character (XXX-XXX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:04  (Phone Number Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina XXYXXXYXXX  seklinde "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "Minimum 12 character (XXX-XXX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:05  (Phone Number Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina XXY-XX-XYXYX  seklinde "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "05/05/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici gecerli password "password" girer.
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici "Minimum 12 character (XXX-XXX-XXXX)" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir
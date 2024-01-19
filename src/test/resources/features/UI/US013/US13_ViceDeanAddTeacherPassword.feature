Feature: Vice Dean, teacher must be created.

  Background:
    Given Anasayfaya git
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
    Then Kullanici Menu tiklar
    Then Kullanici Teacher Management yazisina tiklar


  Scenario:01 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli kucuk harf icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One lowercase character" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:02 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli buyuk harf icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One uppercase character" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:03 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli rakam icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One number" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:04 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli kucuk ve buyuk harf icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One lowercase  and uppercase character" yazisinin gorulmedigini dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:05 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli kucuk harf ve rakam icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One lowercase  and number character" yazisinin gorulmedigini dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:06 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici En az sekiz karakterli buyuk harf ve rakam icermeyen "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "One uppercase  and number character" yazisinin gorulmedigini dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


  Scenario:07 ( Password Negatif Test)
    Then Kullanici Choose Lessons'dan herhangi bir ders secer
    Then Kullanici Name alanina "name" girer.
    Then Kullanici Surname alanina "surname" girer.
    Then Kullanici Birth place alanina "birth place" girer.
    Then Kullanici e-mail alanina "email" girer.
    Then Kullanici phone alanina "phonenumber" girer.
    Then ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.
    Then Kullanici cinsiyet girer
    Then Dogum tarihi "06/06/2000" girilir.
    Then Gecerli SSN "ssn" girilir.
    Then Kullanici Username  alanina "username" girer.
    Then Kullanici sekiz karakterden az buyuk ,kucuk harf ve rakam iceren "password" girer
    Then Kullanici 2 saniye bekler
    Then Kullanici submit butonu tiklar
    Then Kullanici 1 saniye bekler
    Then Kullanici "At least 8 characters" yazisinin gorunurlugunu dogrular
    Then Kullanici hata mesajinin ekran goruntusunu alir


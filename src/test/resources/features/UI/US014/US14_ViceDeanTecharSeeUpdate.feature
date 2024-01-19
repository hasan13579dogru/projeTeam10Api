Feature: US014 Vice Dean Ogretmen Gorme Testi


   Background:
     Given Anasayfaya gider
     Then Kullanici Login yazisina tiklar
     Then Kullanici User Name alanina "username" password alanina "password" degerini girip giris yapar
     Then Kullanici Menu tiklar
     Then Kullanici Teacher Management yazisina tiklar
     Then Kullanici Choose Lessons'dan herhangi bir ders secer
     Then kullanici Add Teacher formu doldurur
     Then Kullanici submit butonu tiklar
     Then Kullanici 1 saniye bekler
     Then Kullanici "Teacher saved successfully" yazisinin gorunurlugunu dogrular
     Then Vice Dean listenin sag alt kosesindeki "»" butonuna tiklar


  Scenario: TC01 Vice Dean ogretmenleri gorebilmelidir
    And Olusturulan ogretmenin Name bilgisinin goruldugunu dogrular
    And 1 saniye bekle
    And Olusturulan ogretmenin Phone Number bilgisinin goruldugunu dogrular
    And 1 saniye bekle
    And Olusturulan ogretmenin Ssn bilgisinin goruldugunu dogrular
    And 1 saniye bekle
    And Olusturulan ogretmenin User Name bilgisinin goruldugunu dogrular


  Scenario: TC02 Vice Dean ogretmenleri guncelleyebilmelidir
    And Olusturulan ogretmen satirinda Edit butonuna tıklar
    And Ogretmen bilgilerini yeniden secerek gunceller
    And Kullanici "Teacher saved successfully" yazisinin gorunurlugunu dogrular








@update
Feature: US20 ManagementOnSchools Sayfasi Testi

  Background: Kullanici ManagementOnSchools Sayfasina Gider
    Given kullanici "managementOnSchoolsUrl" sayfasina gider
    Given anasayfaya gidildigi dogrulanir
    Given kullanici login butonuna tiklar
    Given kullanici Teacher olarak giris yapar
    Given Teacher olarak giris yapildigi dogrulanir
    Given kullanici Menu butonuna tiklar
    Given sol bölümde Main Menu'nun acildigi dogrulanir
    Given kullanici Meet Management sekmesine tiklar
    Given Meet Management sekmesinin acildigi dogrulanir

  @update01
  Scenario: TC01 Toplantılarin bilgilerini güncelle
    And kullanici Edit butonuna tiklar
    And kullanici 5 saniye bekler
    And kullanici ögrenci secimini kaldirir
    And kullanici 2 saniye bekler
    Then kullanici submit butonuna tiklar
    Then kullanici "Meet Updated Successfully" yazisinin gorunurlugunu dogrular
    And kullanici 5 saniye bekler
    And kullanici sayfayi kapatir

  @update02
  Scenario: TC02 Toplantinin baslangic saati ile bitis saatini güncelle
    And kullanici Edit butonuna tiklar
    And kullanici 5 saniye bekler
    And kullanici ögrenci secimi yapar
    And kullanici 2 saniye bekler
    And kullanici toplanti baslangic saatini günceller
    And kullanici 2 saniye bekler
    And kullanici toplanti bitis saati günceller
    And kullanici 2 saniye bekler
    Then kullanici submit butonuna tiklar
    Then kullanici "Meet Updated Successfully" yazisinin gorunurlugunu dogrular
    And kullanici 5 saniye bekler
    And kullanici sayfayi kapatir

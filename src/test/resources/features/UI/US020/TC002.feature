
Feature: US20 ManagementOnSchools Sayfasi Testi

  Background: Kullanici ManagementOnSchools Sayfasina Gider
    * kullanici "managementOnSchoolsUrl" sayfasina gider
    Given anasayfaya gidildigi dogrulanir
    * kullanici login butonuna tiklar
    Given kullanici Teacher olarak giris yapar
    * Teacher olarak giris yapildigi dogrulanir
    Given kullanici Menu butonuna tiklar
    * sol bölümde Main Menu'nun acildigi dogrulanir
    Given kullanici Meet Management sekmesine tiklar
    * Meet Management sekmesinin acildigi dogrulanir

 @smoke
  Scenario: TC03 Olusturulan toplantiyi sistemden sil
    When kullanici olusturulan toplantiyi siler

   # * kullanici 3 saniye bekler
   # And kullanici toplantinin silindigini dogrular
   #Then kullanici 2 saniye bekler
  ##And kullanici Menu butonuna tiklar
  ##Then kullanici 2 saniye bekler
  ##And kullanici Logout sekmesine tiklar
  ##* kullanici 2 saniye bekler
  ###* Logout olmak icin cikan mesajin görünürlügü dogrulanir
  ##* kullanici Yes butonuna tiklar
  ##* kullanici 2 saniye bekler
  ##* Logout yapildigi dogrulanir
    * kullanici sayfayi kapatir
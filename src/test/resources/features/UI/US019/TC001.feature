@create @End2End_TeacherAddMeet
Feature: US19 ManagementOnSchools Sayfasi Testi

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

  @smoke
  Scenario: TC01 Teacher olarak ögrenciler ile toplanti düzenle
    And kullanici ögrenci secimi yapar
    And kullanici 3 saniye bekler
    And kullanici toplanti tarihi secer
    And kullanici 2 saniye bekler
    And kullanici toplanti baslangic saati secer
    And kullanici 2 saniye bekler
    And kullanici toplanti bitis saati secer
    And kullanici 2 saniye bekler
    And kullanici Description bölümünde toplanti hakkinda bilgi yazar
    And kullanici 2 saniye bekler
    And kullanici Submit butonuna tiklar
    And kullanici 2 saniye bekler
    And Meet List bölümünün görünürlügü dogrulanir
    Then Meet List altinda toplantinin olustugu dogrulanir
    And kullanici Menu butonuna tiklar
    And kullanici Logout sekmesine tiklar
    And kullanici 2 saniye bekler
    And Logout olmak icin cikan mesajin görünürlügü dogrulanir
    And kullanici Yes butonuna tiklar
    And kullanici 2 saniye bekler
    Then Logout yapildigi dogrulanir
    And kullanici sayfayi kapatir
@negative @End2End_TeacherAddMeet
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

  @negative01
  Scenario: TC02 Toplanti tarihini gecmis bir zaman ile belirle
    And kullanici ögrenci secimi yapar
    And kullanici 2 saniye bekler
    * kullanici toplanti tarihi secer
    And kullanici 2 saniye bekler
    And kullanici toplanti baslangic saati secer
    And kullanici 2 saniye bekler
    And kullanici toplanti bitis saati secer
    And kullanici 2 saniye bekler
    And kullanici Description bölümünde toplanti hakkinda bilgi yazar
    And kullanici 2 saniye bekler
    And kullanici Submit butonuna tiklar
    Then kullanici hata mesaji gorur ve toplanti olusturamaz
    And kullanici 2 saniye bekler
    Then kullanici sayfayi kapatir

  @negative02
  Scenario: TC03_Start_Time_ve_Stop_Time_girilmeli
    And kullanici ögrenci secimi yapar
    * kullanici 2 saniye bekler
    And kullanici toplanti tarihi secer
    * kullanici 2 saniye bekler
    And kullanici Start Time alanini bos birakir
    * kullanici 2 saniye bekler
    And kullanici Stop Time alanini bos birakir
    * kullanici 2 saniye bekler
    And kullanici Description bölümünde toplanti hakkinda bilgi yazar
    * kullanici 2 saniye bekler
    And kullanici Submit butonuna tiklar
    * kullanici 2 saniye bekler
    Then kullanici toplantinin olusturulamadigini dogrular
    * kullanici 2 saniye bekler
    And kullanici sayfayi kapatir

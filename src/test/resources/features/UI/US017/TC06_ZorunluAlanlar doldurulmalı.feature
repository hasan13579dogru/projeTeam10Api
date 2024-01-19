
Feature: US017 TC06 Teacher, öğrencilere not verebilmelidir
  @negatif5
  Scenario: TC06 Negatif Senaryo Ogrenci not verme Zorunlu alanlar bos birakilamaz
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    And Submit butonuna tikla
    And Absentee kutusunun altindaki Required yazisini dogrula
    And Midtern kutusu altindaki Required yazisini dogrula
    And Final Exam kutusu altindaki Required yazisini dogrula
    And Info Note kutusu altindaki Required yazisini dogrula
    And Choose Student alanina bir ogrenci gir
    And Choose Education Term alanina bir donem sec
    And Absentee alanina bir devamsizlik gir
    And Midtern alanina bir ara sinav notu gir
    And Final Exam alanina bir final notu gir
    And Info Note alanina bir basari durumu gir
    And Submit butonuna tikla
    And Ekranda cikan Please select lesson mesajini dogrula
    And sayfayi kapat

  @negatif6
  Scenario: TC07 Negatif Senaryo Ogrenci not verme Zorunlu alanlar bos birakilamaz
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    And Choose Lesson alanina bir ders gir
    And Choose Education Term alanina bir donem sec
    And Absentee alanina bir devamsizlik gir
    And Midtern alanina bir ara sinav notu gir
    And Final Exam alanina bir final notu gir
    And Info Note alanina bir basari durumu gir
    And Submit butonuna tikla
    And Ekranda cikan Please select student mesajini dogrula
    And sayfayi kapat

  @negatif7
  Scenario: TC08 Negatif Senaryo Ogrenci not verme Zorunlu alanlar bos birakilamaz
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    And Choose Lesson alanina bir ders gir
    And Choose Student alanina bir ogrenci gir
    And Absentee alanina bir devamsizlik gir
    And Midtern alanina bir ara sinav notu gir
    And Final Exam alanina bir final notu gir
    And Info Note alanina bir basari durumu gir
    And Submit butonuna tikla
    And Ekranda cikan Please select education term mesajini dogrula
    And sayfayi kapat
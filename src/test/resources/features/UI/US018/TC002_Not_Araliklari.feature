Feature: US18 TC01 Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.

  Background:
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    And Add Student Info alanindaki Choose Lesson alanindan "Team10Cucumber" sec
    And Add Student Info alanindaki Choose Student alanindan "Team10Student Team10" sec
    And Add Student Info alanindaki Choose Education Term alanindan "FALL_SEMESTER" sec
    And Absentee alanina "4" gir
    And Midtern Exam alanina "75" gir
    And Final Exam alanina "75" gir
    And info Note alanina "Aferin+10+" gir
    And Submit butonu tikla
    And Basariyla giris yapildigini dogrula
    Then Student Info List basligini dogrula
    And Student Info alanindaki Edit butonuna tikla
    And Acilan ekranda Choose Lesson alanindan "Team10Cucumber" sec
    And Choose Education Term alanindan "FALL_SEMESTER" sec
    And Absentee alanina "5" devamsizlik gir


  @test03
  Scenario: Teacher, not güncellemesinde öğrenciye verdiği not, aralıklar dışında
    And Midterm Exam alanina "101" ara sinav notunu gir
    And Final Exam alanina "95" final sinav notunu gir
    And Info Note alanina "süper**10**"  notunu gir
    And Edit alanindaki Submit butonuna tikla
    And "'100.0' değerinden büyük yada eşit olmalı" mesaji dogrula
    And Edit Student Info Alanindaki X butonuna tikla
    And Student Info List alaninda ki silme butonunu tikla
    And Ogrencinin silindigini dogrula
    And sayfayi kapat


  @test03
  Scenario: Teacher, not güncellemesinde öğrenciye verdiği not, aralıklar dışında
    And Midterm Exam alanina "75" ara sinav notunu gir
    And Final Exam alanina "-1" final sinav notunu gir
    And Info Note alanina "süper**10**"  notunu gir
    And Edit alanindaki Submit butonuna tikla
    And "'0.0' değerinden büyük yada eşit olmalı" mesaji dogrulanmali
    And Edit Student Info Alanindaki X butonuna tikla
    And Student Info List alaninda ki silme butonunu tikla
    And Ogrencinin silindigini dogrula
    And sayfayi kapat
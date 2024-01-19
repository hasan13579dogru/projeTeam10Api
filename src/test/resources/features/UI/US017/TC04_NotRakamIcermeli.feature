@negatif3
Feature: US017 TC04 Teacher, öğrencilere not verebilmelidir

  Scenario Outline: TC04 Negatif Seneryo: Ogrenci not verme senaryosu Not harf olarak girilemez
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    And Add Student Info alanindaki "<Choose Lesson>" bir ders sec, "<Choose Student>" bir ogrenci sec, "<Choose Education Term>" bir donem sec,"<Absentee>" devamsizlik gir, "<Midtern Exam>" notunu gir,"<Final Exam>" notunu gir,"<Info Note>" basari durumunu gir
    And "<Choose Lesson>" Choose Lesson girildigini dogrular
    And "<Choose Student>" Choose Student girildigini dogrular
    And "<Choose Education Term>" Educatinon Term girildigini dogrular
    And "<Absentee>" Absentee girildigini dogrular
    And "<Midtern Exam>" Midtern Exam girildigini dogrular
    And "<Final Exam>" Final Exam girildigini dogrular
    And "<Info Note>" Info Note girildigini dogrular
    And Submit butonuna tikla
    And Rakam disinda bir karakterle girilemez mesajini dogrular
    And 1 saniye bekle
    And sayfayi kapat
    Examples:
      | Choose Lesson  | Choose Student        | Choose Education Term | Absentee | Midtern Exam | Final Exam | Info Note          |
      | Team10Cucumber | Team10Student Team10  | FALL_SEMESTER         | 3        | yetmiş       | 90         | Dönem Başarılı*10* |
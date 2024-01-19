@negatif2
Feature: US017 TC03 Teacher, öğrencilere not verebilmelidir

  Scenario Outline: TC03 Negatif Senaryo: Not aralık doğrulaması
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
    And "'0.0' değerinden büyük yada eşit olmalı" mesaji dogrulanmali
    And 1 saniye bekle
    And sayfayi kapat
    Examples:
      | Choose Lesson  | Choose Student        | Choose Education Term | Absentee | Midtern Exam | Final Exam | Info Note          |
      | Team10Cucumber | Team10Student Team10  | FALL_SEMESTER         | 3        | 70           | -1         | Dönem Başarılı*10* |
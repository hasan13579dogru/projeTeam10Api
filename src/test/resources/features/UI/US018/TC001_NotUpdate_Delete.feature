
Feature: US18 TC01 Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.
  @smoke
  Scenario: Teacher, öğrenciye verdiği notları güncelleyebilmeli ve silebilmelidir
    Given Anasayfaya git
    Then 1 saniye bekle
    Then Teacher olarak login ol
    When Student Info Management sayfasinda oldugunu dogrula
    Then Student Info List basligini dogrula
    And Student Info alanindaki Edit butonunun gorundugunu dogrula
    And Student Info alanindaki Edit butonuna tikla
    And Acilan ekranda Choose Lesson alanindan "Team10Cucumber" sec
    And Choose Education Term alanindan "FALL_SEMESTER" sec
    And Absentee alanina "5" devamsizlik gir
    And Midterm Exam alanina "60" ara sinav notunu gir
    And Final Exam alanina "65" final sinav notunu gir
    And Info Note alanina "Daha fazla calismalisin"  notunu gir
    And Edit alanindaki Submit butonuna tikla
    And Notun editlendigine dair basari mesajini dogrula
    And Edit Student Info Alanindaki X butonuna tikla
    And Student Info List alaninda Choose Lessona girilen "Team10Cucumber" dogrula
    And Absentee alanina girilen "5" dogrula
    And Midterm Exam alanina girilen "60" dogrula
    And Final Exam alanina girilen "65" dogrula
    And Info Note alanina girilen "Daha fazla calismalisin" dogrula
    And Student Info List alaninda ki silme butonunu dogrula
    And Student Info List alaninda ki silme butonunu tikla
    And Ogrencinin silindigini dogrula
    And sayfayi kapat


    @smok
    Scenario: Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.
      Given Anasayfaya git
      Then 1 saniye bekle
      Then Teacher olarak login ol
      When Student Info Management sayfasinda oldugunu dogrula
      And Add Student Info alanindaki Choose Lesson alanindan "Team10Cucumber" sec
      And Add Student Info alanindaki Choose Student alanindan "Team10Student Team10" sec
      And Add Student Info alanindaki Choose Education Term alanindan "FALL_SEMESTER" sec
      And Absentee alanina "7" gir
      And Midtern Exam alanina "80" gir
      And Final Exam alanina "100" gir
      And info Note alanina "Harikasın**10**" gir
      And Submit butonu tikla
      And Basariyla giris yapildigini dogrula
      And Student Info List alaninda Name "Team10Student Team10" oldugunu dogrula
      And Student Info List alaninda Choose Lessona girilen "Team10Cucumber" dogrula
      And Absentee alanina girilen "7" dogrula
      And Midterm Exam alanina girilen "80" dogrula
      And Final Exam alanina girilen "100" dogrula
      And Note alanindaki verinin gorunur oldugunu dogrula
      And Info Note alanina girilen "Harikasın**10**" dogrula
      And Average alanindaki verinin gorunur oldugunu dogrula
      And Student Info List alaninda ki silme butonunu dogrula
      And Student Info List alaninda ki silme butonunu tikla
      And Ogrencinin silindigini dogrula
      And sayfayi kapat














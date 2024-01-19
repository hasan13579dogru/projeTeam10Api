
Feature:US010 Vice Dean ders programı oluşturabilmelidir.

  Background:Vice Dean login olur
    Given Kullanici "https://managementonschools.com/" gider
    Then Anasayfaya gidildigini dogrula
    When Vice Dean hesabiyla login ol
    Then Vice Dean hesabi ile giris yapildigini dogrula
    Then Education Term Management yazısının gorunurlugunu dogrular

  Scenario: Vice Dean ders secebilmelidir
    When Lesson Program yazisi tikla
    And Lesson Program Management yazili alanin acildigi goruntulenmelidir
    And Select lesson yazisi tikla
    And Cikan derslerden biri secilebilmeli
    When Vice Dean egitim donemi secebilmeli
    When  Choose Education Term alanindan egitim donemi secilir.
    And Choose Education Term kutucugu tiklanip secim yapilabilmelidir
    When Ders icin gun secebilmelidir.
    When Lesson Program yazisi tikla
    And Lesson Program Management yazili alanin acildigi goruntulenmelidir
    And Choose Day kutucugundan gun secilir.
    And Choose Day kutucugu tiklanip gunlerden biri secilebilir olmalidir
    When Ders için başlama ve bitiş saati seçebilmelidir.
    When Lesson Program yazisi tikla
    And Start Time kutucuguna baslama saati yazilir
    And Start Time kutucugu edit edilebilir olmalidir
    And Stop Time kutucuguna bitis saati yazilir.
    And Stop Time kutucugu edit edilebilir olmalidir
    And Submit butonuna tikla
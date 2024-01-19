Feature: US006 Dean, Vice Dean hesabı oluşturabilmelidir.

  Background: kullanici ManagementOnSchools sayfasina gider
    Given "managementonschoolsUrl" sayfasina gidilir
    Given login butonuna tiklanir
    Given kullanici Dean olarak giris yapar
    Given kullanici Menu butonuna tiklar
    Given sol bölümde Main Menu'nun acildigi dogrulanir
    Given kullanici Vice Dean Management sekmesine tiklar


  Scenario: TC01 Vice Dean hesabı oluşturabilmelidir

    And Name alanina name girilir
    And Surname alanina surname girilir
    And Dogum yeri gir
    And dogum tarihi gir
    And Gender sec
    And Phone number gir
    And Ssn no gir
    And UserName gir
    And Parola gir
    And Submit butonuna tik
    Then "Vice Dean saved" mesaji gor


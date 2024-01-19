Feature: US05 Admin, Dean'leri görebilmeli ve silebilmeli

  Background: kullanici ManagementOnSchools sayfasina gider
    Given "managementonschoolsUrl" sayfasina gidilir
    Given login butonuna tiklanir
    Given kullanici Admin olarak giris yapar
    Given kullanici Menu butonuna tiklar
    Given sol bölümde Main Menu'nun acildigi dogrulanir
    Given kullanici Dean Management sekmesine tiklar

  Scenario: TC01 Admin, Dean'leri guncelleyebilir ve silebilir
    And Name,Gender, Phone Number, SSN, User Name bilgilerinin goruldugunu dogurlanir
    And En son olusturulan dean'e gidip edit tusuna bas
    And Name alanina yeni ismi gir
    And Male butonuna tikla
    And Password alinina parolayi gir ve submit tusuna bas
    And Dean updated Successful yazisinin gorunurlugunu dogrula

Feature: US24 Admin Teacher olusturabilmeli

  Background:
    Given kullanici "https://managementonschools.com/" girer



  @teacherAdd
  Scenario: TC 00 Kullanıcı  bütün kısımları doldurur.
    And And Kullanıcı Choose Lessons bölümünden "java" seçer.
    And Kullanıcı name alanına veri girer.
    And Kullanıcı surname alanına veri girer.
    And Kullanıcı birth place alanına veri girer.
    And  Kullanıcı email alanına veri girer.
    Then kullanici PhoneNumber Girer addteacher
    Then  Kullanıcı  Gender kısmını doldurur addteacher
    Then  Kullanıcı  Date Of Birth kısmını doldurur addteacher
    And Kullanıcı  Ssn kısmını doldurur addteacher
    Then   Kullanıcı  User Name kısmına veri girer addteacher
    Then  Kullanıcı  Password kısmına geçerli  veri girer addteacher
    And Kullanıcı submit butonuna tıklar addteacher
    And Kullanici Vice dean saved alertini goruntuler addteacher



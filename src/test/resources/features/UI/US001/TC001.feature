@register

Feature:

   Background:
    Given kullanici "https://managementonschools.com/" girer
    Then aday ogrenci Register ikonunu tiklar

  Scenario: TC01 Name boş birakilamamalidir
    Given Kullanici name alaninda tab tusuna basar
    Then Kullanici name icin required uyarisini goruntuler


  Scenario Outline: TC02 Kullanici iki karakter iceren "name" girer
    Given Kullanici name alanina "<name>" girer
    Then Kullanici at least iki karakter uyarisini goruntulemez

    Examples:
      | name |
      | sd   |

  Scenario Outline: TC02 Kullanici bir karakter iceren "name" girer
    Given Kullanici name alanina "<name>" girer
    Then Kullanici at least iki karakter uyarisini goruntulemez

    Examples:
      | name |
      | s    |
    @name_eksik
    Scenario: TC02 Kullanici name alani disindaki tum alanlara gecerli deger girer
      Given Kullanici name alani disindaki tum alanlara gecerli deger girer
      Then Kullanici at least iki character uyarisini alir

    @surname
    Scenario: TC03  Herhangi bir karakter içeren ve bos birakilamayan Surname olmalıdır
      Given  KullaniciSurname kutusunu bos birakmali
      Then Bos birakilan surname kutusu icin required uyarisi goruntulenir olmali

  @surnameUyari
  Scenario:TC04 Kullanici Surname kismina en aziki karakter girmeli
    Given Kullanici Surname kismina iki karakter girer
    Then Kullanici at least iki karakter uyarisiyla karsilasmaz
    @surnameuyarigorulur
    Scenario:  TC05 Kullanici Surname kismina tek karakter iceren deger girer
      Given Kullanici Surname alanina tek karakterli deger girer

      Then  Diger tum alanlara valid deger girer
      Then  Kullanici Register butonunu tiklar
      Then Kullanici at least two charakter uyarisini gorur


      Scenario: TC06 Birth place bos birakilmamali
        Given Kullanici Birth place alanini bos birakir
        Then Kullanici Birth place icin required uyarisini goruntuler



  Scenario Outline: TC07 Herhangi bir karakter içeren "Birth place" olmalıdır (Positive- en az 2 karakter)
    Given Kullanici Birth place kutusuna "<birthplace>" girer
    Then Kullanici at least iki character uyarisini goruntulemez
    Examples:
      | birthplace |
      | Sd         |
      | Sre        |

  Scenario:TC08 Kullanici  Birthplace bir karakter testi
    Given Kullanici BirthPlace alanina bir karakter girer
    Then  Kullanici at least iki character uyarisini gorur Birthplace icin


  @smoke
  Scenario: TC00 Aday öğrenciler sisteme kayiy olustura bilmeli
    Given Kullanici Name kutusuna name girer
    Then  Kullanici Surname kutusuna surname girer
    Then  Kullanici Birth place kutusuna birthplacegirer
    Then  Kullanici Phone Number kutusuna phone girer
    Then  Kullanici Gender radio butonlarindan gender secer
    Then  Kullanici Date Of Birth kutusuna dateofbirth girer
    Then  Kullanici SSN kutusuna ssn girer
    Then  Kullanici User Name kutusuna username girer
    Then  Kullanici Password kutusuna password girer
    Then  Kullanici register butonuna tiklar
    Then  Kullanici guest user registered mesajini gorerek basarili kayit yapabildigini dogrular
    And Sayfayi kapat








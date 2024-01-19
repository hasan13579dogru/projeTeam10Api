Feature:US016 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  Scenario: Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Given Kullanici "https://managementonschools.com" gider
    Then Anasayfaya gidildigini dogrula
    When Vice Dean hesabiyla login ol
    Then Vice Dean hesabi ile giris yapildigini dogrula
    When Menu butonuna tikla
    Then Main Menu pencerisinin acildigini dogrula
    Given Kullanici "https://managementonschools.com/contact-getAll" gider
    And Vice Dean Name basligini dogrular
    And Vice Dean Email basligini dogrular
    And Vice Dean Date basligini dogrular
    And Vice Dean Subject basligini dogrular
    And Vice Dean Message basligini dogrular
    And "Contact Message bolumunde Name bilgisinin" gorundugunu dogrular
    And "Contact Message bolumunde  maillerin" gorundugunu dogrular
    And "Contact Message bolumunde Date bilgisinin" gorundugunu dogrular
    And "Contact Message Subject bilgisinin" gorundugunu dogrular
    And "Contact Message bolumunde Message bilgisinin" gorundugunu dogrular
    And "Contact Message bolumunde delet butonunun" gorundugunu dogrular
    Then Contact Message bolumunde delet ikonuna tiklar
    And Vice Dean messajin silindigini dogrular
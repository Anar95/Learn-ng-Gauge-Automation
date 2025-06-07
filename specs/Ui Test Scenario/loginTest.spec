# Bazar Store Login Test


## BazarStore Login Scenario Pozitive

* Open browser and go to "https://bazarstore.az/"
* Wait for element Xpath  "//a[@href='/account']" to be visible
* Click element with XPath "//a[@href='/account']"
* Type "anarabbas458@gmail.com" into input with XPath "//input[@id='CustomerEmail']" and  press Tab
* Type "Test1234Test" into input with XPath "//input[@id='CustomerPassword']" and  press Enter
* Wait for element Xpath  "//p[contains(text(), 'Anar Abbas')]" to be visible
* Verify element with Xpath "//p[contains(text(), 'Anar Abbas')]" contains text "Anar Abbas"


## BazarStore Login Scenario with Json

* Brazueri aç və keçid et "https://bazarstore.az/"
* "Account link" gorsensin deye maksimum "10" saniye gozle
* JSON faylındakı "Account link" elementine klik et
* "Email text" elementine "anarabbas458@gmail.com" yaz ve Tab duymesine bas
* "Password text" elementine "Test1234Test" yaz ve Enter duymesine bas
* "User name label" gorsensin deye maksimum "10" saniye gozle
* Element "User name label" icinde "Anar Abbas" yazisi var
* Brauze bagla
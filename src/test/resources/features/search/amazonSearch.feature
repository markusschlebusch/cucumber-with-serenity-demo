Feature: Suchfunktion auf Amazon

Scenario: Suche nach einem Suchbegriff mit Prüfung ob ein Produkt im Ergebnis enthalten ist
   Given Ich öffne die Amazon-Webseite
   When Suche ich nach 'Powerbank'
   Then Soll auf der Seite 'Anker' zu sehen sein

Scenario: Suche nach einem Suchbegriff (Fehlerfall)
   Given Ich öffne die Amazon-Webseite
   When Suche ich nach 'Dell'
   Then Soll auf der Seite 'Asus' zu sehen sein
   
Scenario: Suche nach einem Suchbegriff und im Ergebnis soll ein Produkt nicht enthalten sein
   Given Ich öffne die Amazon-Webseite
   When Suche ich nach 'Dell'
   Then Soll auf der Seite 'Asus' nicht zu sehen sein
# ProgTech

Alkalmazás ötlet:


Egy olyan grafikus java alkalmazás készítése, melyben lehetőségük van egyedileg összerakott, vagy előre össze állított számítógépet rendelni.
A program logolja a bizonyos információkat, a logolásra a Singleton pattern-t használom fel.
Az alap számítógép mellé köthetünk különböző biztosításokat, vagy esetleg extrákat rendelhetünk bele, ezt a Díszítő pattern felhasználásával valósítom meg. HA van szükség extrára, úgy a becsomagolást, egy factory methodal szeretném megvalósítani. Rendeléskor, a user eldöntheti, hogy szeretne-e rá garanciát, ezt egy observer segítségévle kivánom megvalósítani.

Unit test ötletek:
A felhasználó nem rakhat össze olyan számítógépet, amiben nincs minden előre definiált mező (alaktérsz) használva.
A számítógépek ára nem lehet negatív.
A számítógépek attribútumai előre megadott értékekeket vehetnek fel.
A program a megrendeléskor összeállított részekből egy számítógép példányt adjon vissza, a díszítés csak ez után jöjjön.
Kétszer ne lehessen ugyanabba becsomagolni, azaz két ugyanaz az extrát ne lehessen rendelni (Pl: RGB led szalag a számítógépben).

Exceptiont váró tesztek:
Negatív ár esetén.

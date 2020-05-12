# ProgTech

Alkalmazás ötlet:


Egy olyan grafikus java alkalmazás készítése, melyben lehetőségük van egyedileg összerakott, vagy előre össze állított számítógépet rendelni.
A program logolja a bizonyos információkat, a logolásra a Singleton pattern-t használom fel.
Az alap számítógép mellé köthetünk különböző biztosításokat, vagy esetleg extrákat rendelhetünk bele, ezt a Díszítő pattern felhasználásával valósítom meg. Ha van szükség extrára, úgy a becsomagolást, egy factory methodal szeretném megvalósítani. Rendeléskor, a user eldöntheti, hogy szeretne-e rá garanciát, ezt egy observer segítségévle kivánom megvalósítani.

Felhasznált patternek:
1. Singleton ~ csak egy logger példányosítás engedélyezett a programban
2. Decorator ~ az összerakott példányokat lehet különböző extrákkal díszíteni
3. Factory method ~ a becsomagolást ezzel valósítjuk meg
4. Observer ~ a user rendelés véglegesítésekor eldöntheti, hogy szeretne-e plussz biztosítást, erre megfigyelőt alkalmazok

Betartott alapelvek:
 1. Egy felelősség elve - SRP: Minden osztálynak egyetlen felelősséget kell lefednie!!!
 2. Nyita zárt elv - OCP: A program forráskódja legyen nyitott a bővítésre, de zárt a módosításra.
 3. Függőség megfordításának elve - DIP: A magas szintű modulok ne függjenek az alacsonyabb szintű moduloktól.Mindkettő függjön az abszrakciótól.
 

Unit test ötletek:


A felhasználó nem rakhat össze olyan számítógépet, amiben nincs minden előre definiált mező (alaktérsz) használva.
A számítógépek ára nem lehet negatív.
A számítógépek attribútumai előre megadott értékekeket vehetnek fel.
A program a megrendeléskor összeállított részekből egy számítógép példányt adjon vissza, a díszítés csak ez után jöjjön.
Kétszer ne lehessen ugyanabba becsomagolni, azaz két ugyanaz az extrát ne lehessen rendelni (Pl: RGB led szalag a számítógépben).

Exceptiont váró tesztek:


Negatív számok esetén.

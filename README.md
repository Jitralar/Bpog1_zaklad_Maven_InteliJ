# Bpog1_zaklad_Maven_InteliJ
Zakladní šablona pro předmět Bpog1. Připraveno pro vývoj v Maven na platformě InteliJ, funkční pro testování v NetBeans

> [!WARNING]  
> Aktuálně není tato šablona schválena Ing. Petrem Veselým na zkouškách v LS 2026. Jakmile bude dostupné vyjádření, bude tento Readme upraven

## Popis šablony
Tato šablona vychází z několika tutoriálů a šablony pro JavaFX od InteliJ. V tomto repositáři je i postup jak dojít k tomuto výsledku i bez samotné šablony, tak aby mohlo být případně zreplikováno.

Oproti „officiální“ šabloně obsahuje navíc
 - javaFX_Run.xml -> scrip pro zapnutí JavaFX na platformě InteliJ
 - nbactions.xml -> script pro zapnutí JavaFX na platformě NetBeans
 - šablona JavaFX bez FXML
 - šablona JavaFX aplikace s FXML
 - FXML controler pro šablonu s FXML v \resources

## Jak tuto šablonu vytvořit

 1. V InteliJ Idea vyberte "New Project"
 2. V nabídce na levé straně pod "Genearators" najděte "JavaFX"
 3. Zadejte své jméno, umístění etc. a po té klikněte na "Next"
 4. Máte nyní možnost doinstalovat další knihovny, pro zkoušku a projekty v rámci KST/BPOG1 však nejsou potřeba.
 5. Ať vyberete či ne knihovny v bodě 4, klikněte na generate
 6. V pravo dole by měl být popup, který vás vyzívá na načtení maven. Odklikněte ho a načtěte ho.
> [!WARNING]  
> Pozor! Samotný projekt je v InteliJ IDEA již spustitelný, aby fungoval i v IDE NetBeans, je potřeba ještě pár kroků

7. Nyní klikněte na "File" - je to v toolbaru vedle ikony InteliJ a vyhledejte "Project Structure"
8. V Platforms //FIXME


TODO



## Ověřena funkčnost mezi InteliJ a NetBeans
Pokud tuto šablonu budete zkoušet, prosím rožšiřte tuto tabulku o funční verze (pokud zde již nejsou)
| InteliJ     | NetBeans    | Funguje?    |
| ----------- | ----------- | ----------- |
| 2024.3      | 27          | ✔️          |
| 2024.3      | 12.6        | ✖️          |






WIP

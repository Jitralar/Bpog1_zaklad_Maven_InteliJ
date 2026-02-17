# Bpog1_zaklad_Maven_InteliJ
Zakladní šablona pro předmět ![Bpog1](https://portal.upce.cz/StagPortletsJSR168/CleanUrl?urlid=prohlizeni-predmet-sylabus&predmetZkrPrac=KST&predmetZkrPred=BPOG1&predmetRok=2025), určený pro Fakultu Elektrotechniky a Informatiky Univerzity Pardubice. Připraveno pro vývoj v Maven na platformě InteliJ, funkční pro testování v NetBeans

> [!WARNING]  
> Aktuálně není tato šablona schválena Ing. Petrem Veselým na zkouškách v LS 2026. Jakmile bude dostupné vyjádření, bude tento Readme upraven

> [!NOTE]  
> Před prvním zpuštěním v Netbeans, bude celý program "svítit" červeně. Jakmile bude program spuštěň, již by neměl býti označován kód chybně

## Popis šablony
Tato šablona vychází z několika tutoriálů a šablony pro JavaFX od InteliJ. V tomto repositáři je i postup jak dojít k tomuto výsledku i bez samotné šablony, tak aby mohlo být případně zreplikováno.

Oproti „officiální“ šabloně obsahuje navíc
 - javaFX_Run.xml -> scrip pro zapnutí JavaFX na platformě InteliJ
 - nbactions.xml -> script pro zapnutí JavaFX na platformě NetBeans
 - šablona JavaFX bez FXML
 - šablona JavaFX aplikace s FXML
 - FXML controler pro šablonu s FXML v \resources

## Jak tuto šablonu vytvořit

 1. V InteliJ Idea vyberte `New Project`
 2. V nabídce na levé straně pod `Genearators` najděte `JavaFX`
 3. Zadejte své jméno, umístění etc. a po té klikněte na `Next`
 4. Máte nyní možnost doinstalovat další knihovny, pro zkoušku a projekty v rámci KST/BPOG1 však nejsou potřeba.
 5. Ať vyberete či ne knihovny v bodě 4, klikněte na `generate`
 6. V pravo dole by měl být popup, který vás vyzívá na načtení maven. Odklikněte ho a načtěte ho.
> [!WARNING]  
> Pozor! Samotný projekt je v InteliJ IDEA již spustitelný, aby fungoval i v IDE NetBeans, je potřeba ještě pár kroků

7. Nyní klikněte na `File` - je to v toolbaru vedle ikony InteliJ a vyhledejte `Project Structure`
8. V `Platform setting` klikňete na `Modules` a zde v `Dependecies` klikněte na tlačítko `+`
9. Jakmile kliknete na tlačítko `+`, vyberte možnost `JARs or Directories` a vyberte vaše ![SDK s JavaFX](https://gluonhq.com/products/javafx/) (případně již staženo na disku U), ideálně v .ZIP
10. Nezapomeňte po kroku 9 kliknout na přidanou knihovnu a kliknout `apply` a následně `OK`
11. Nyní na opět na toolbaru najdeme kategorii `Run` a zde vybereme možnost `Edit Configucations`
12. V tomto menu klikneme na `Add new`, případně na `+` a vybereme `Maven`
13. V možnostech nyní je důležité odkliknout `Store as project file` vedle názvu konfigurace a do kolonky `Run` napsat tento příkaz `javafx:run` a zakliknout Aplly a Run
14. Poslední krok je vytvořit podobnou konfiguraci i pro NetBeans. Proto je potřeba vytvořit file `nbactions.xml` v hlavní větvy programu (na stejné úrovni jako například pom.xml a složka src) a vložit do něj následující xml kód
```xml
<?xml version="1.0" encoding="UTF-8"?>
<actions>
  <action>
    <actionName>run</actionName>
    <goals>
      <goal>javafx:run</goal>
    </goals>
  </action>
  <action>
    <actionName>debug</actionName>
    <goals>
      <goal>javafx:run</goal>
    </goals>
  </action>
</actions>
```
15. To je vše, glhf u zkoušky a dalších JavaFX projektech

## Ověřena funkčnost mezi InteliJ IDEA a Apache NetBeans
Pokud tuto šablonu budete zkoušet, prosím rožšiřte tuto tabulku o funční verze (pokud zde již nejsou). Testováno metodou pokus omyl, může se lišit 
| InteliJ     | NetBeans    | Funguje?    |
| ----------- | ----------- | ----------- |
| 2024.3      | 27          | ✔️          |
| 2024.3      | 12.6        | ✖️          |






WIP

# Bpog1_zaklad_Maven_InteliJ
Zakladní šablona pro předmět [Bpog1](https://portal.upce.cz/StagPortletsJSR168/CleanUrl?urlid=prohlizeni-predmet-sylabus&predmetZkrPrac=KST&predmetZkrPred=BPOG1&predmetRok=2025), určený pro Fakultu Elektrotechniky a Informatiky Univerzity Pardubice. Připraveno pro vývoj v Maven na platformě InteliJ, funkční pro testování v NetBeans

> [!WARNING]  
> Na zkouškách v LS 2026 tato šablona není stále schválena, nicméně je příslib revize před zkouškovým obdobím (tzn. zhruba kolem 10 týdne bude nejspíš známé vyjádření).

> [!NOTE]  
> Před prvním zpuštěním v Netbeans, bude celý program "svítit" červeně. Jakmile bude program spuštěň, již by neměl býti označován kód chybně

## Popis šablony
Tato šablona vychází z několika tutoriálů a šablony pro JavaFX od InteliJ. V tomto repositáři je i postup jak dojít k tomuto výsledku i bez samotné šablony, tak aby mohlo být případně zreplikováno. Přidávám i postupně body, myšlenky a pokusy postupně - jak objevuji limitace InteliJ, Netbeans a nebo JavaFX osobně. Doporučuji sledovat pomocí "hvězdy". Zároveň ocením udpdaty a postřehy.

Oproti „officiální“ šabloně obsahuje navíc
 - javaFX_Run.xml -> scrip pro zapnutí JavaFX na platformě InteliJ
 - nbactions.xml -> script pro zapnutí JavaFX na platformě NetBeans
 - šablona JavaFX bez FXML
 - šablona JavaFX aplikace s FXML*
 - FXML controler pro šablonu s FXML v \resources*

   *_prosím přečtěte kapitolu o [FXML](https://github.com/Jitralar/Bpog1_zaklad_Maven_InteliJ?tab=readme-ov-file#pr%C3%A1ce-s-fxml)_

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
9. Jakmile kliknete na tlačítko `+`, vyberte možnost `JARs or Directories` a vyberte vaše [SDK s JavaFX](https://gluonhq.com/products/javafx/) (případně již staženo na disku U), ideálně v .ZIP
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
| 2024.3      | 8.2         | ✖️          |
| 2025.2      | 27          | ✔️          |

## Práce s FXML
Aktuálně jsem zjistil že InteliJ nemá žádný přirozený způsob pro práci s controllerem o FXML. 
Kolem toho jsem nainstaloval plugin [FXMLManager](https://plugins.jetbrains.com/plugin/14854-fxmlmanager), který umožňuje nejen generovat, ale přepisovat Controler z FXML souboru. Jak to má zhruba vypadat lze najít na [StackOverFlow](https://stackoverflow.com/questions/71320117/update-controller-from-fxml-in-intellij-for-javafx-project)
Ještě plánuji nějaké testování, nicméně zde jsou některé notes co jsem zjistil
 - Scene Builder soubor dává poslední dostupnou verzi JAVA, takže aktuálně 25, pokud používáte starší JDK - což na 99% používáte, tak nezapomeňte tuto hodnotu změnit (v InteliJ pouze warning - _"Loading FXML document with JavaFX API of version 25 by JavaFX runtime of version 17"_)
 - FXML soubor neobsahuje cestu, například
   ```fxml
          <GridPane maxHeight="400.0" maxWidth="800.0" minHeight="400.0" minWidth="800.0"
          prefHeight="400.0" prefWidth="800.0"
          xmlns="http://javafx.com/javafx/17"
          xmlns:fx="http://javafx.com/fxml/1"
          fx:controller="upce.st67053.knihy2026.HelloController">
   ```
   je potřeba ji dodat (chybí `fx:controller="etc"`)
 - Je lepší používat `Gluon Scene Builder`, protože JavaFX Scene Builder 2.0 od Oracle neobsahuje některé komponenty, jako například spinner (textBox s počítadlem). V InteliJ se nastavuje úplně stejně - jen se dá jiná cesta k .exe souboru (po prvé stačí přes levé tlačítko kliknout `open with SceneBuilder` a zde vás InteliJ vyzve k vyplnění cesty k .exe souboru. Pokud jste již vyplnili - tak v nastavení pod `Languages & Frameworks > JavaFX` lze cesta změnit (stačí vyhledat SceneBuilder a zde by na to měl být textBox)
 








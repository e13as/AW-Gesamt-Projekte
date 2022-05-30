# Aufgabe Vorbereitung Checkpoint

Die folgenden Fragen sollen mit Hilfe der Klassen unterhalb des Packages `vorbereitung_checkpoint` beantwortet werden. In der Klasse `Academy` sind zwei Code-Stellen markiert, auf die in den Fragen Bezug genommen werden. Im Checkpoint werdet ihr ähnliche Fragen beantworten müssen.

## Fragen

1. Markiere die richtigen Aussagen
- [ ] Der Constructor von Trainer nimmt einen Namen und eine eMail-Adresse entgegen
- [ ] Ich kann mit `Trainer t1 = new Person();` einen neuen Trainer anlegen.
- [ ] Die Klasse `Trainer` implementiert `Person`
- [ ] Die Klasse `Kurs` erweitert `DevOpsTraining`
- [ ] Die Klasse `JavaTraining` erweitert `Kurs`
- [ ] Die Klasse `JavaScriptTraining` erbt von `Kurs`
- [ ] Die Klasse `ProgramManager` implementiert `Administrator`
- [ ] Jede `Person` hat ein Feld `eMail`



2. Welche der folgenden Anweisungen würde(n) an `/* CODE_STELLE 1 */` in `Academy.java` eine Exception werfen?
- [ ] `devOps.begruessung()`
- [ ] `new JavaTraining().begruessung()`
- [ ] `js.begruessung()`
- [ ] `java.hasTrainer()`
- [ ] `System.out.println(java.getName())`
- [ ] `java.setEndDate(LocalDate.of(2000, 1, 1));`
- [ ] `java.setEndDate(LocalDate.of(2022, 5, 24));`



3. Welche der folgenden Anweisungen werden an `/* CODE_STELLE 1 */` vom Java-Compiler erlaubt?
- [ ] `Kurs itSecurity = new Kurs(2022, 1);`
- [ ] `JavaTraining java = new JavaScriptTraining(2022, 3)`
- [ ] `ProgramManager p1 = new ProgramManager("Lucas")`
- [ ] `Administrator a1 = p1`
- [ ] `List<Person> persons = List.of(t1, p1, consultant1, consultant2)`
- [ ] `List<Trainer> trainer = List.of(t1, t2, p2)`
- [ ] `consultant1.beendeTraining()`
- [ ] `consultant1.starteTraining()`



4. Was wird direkt nach `/* CODE_STELLE 2 */` auf der Konsole ausgegeben?
- [ ] Gar nichts, weil die Methode `vorstellung()` im Interface `Administrator` fehlt
- [ ] `Hallo, ich bin Georg`
- [ ] `Hallo, ich bin Alex`
- [ ] `hallo, ich bin georg`
- [ ] `Moin DevOps-Leute! Sind die Docker-Images schon geschlüpft und die CI/CD-Pipelines frisch geölt?`

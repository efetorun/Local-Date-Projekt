import java.time.LocalDate;

public class Benutzer {
   /* Diese Anwendung fügt Benutzern zufällig ein ArrayList-Registrierungsdatum hinzu.
    und dann ist es eine Anwendung, die diejenigen druckt, die sich in den ersten 10 Tagen
    eines jeden Monats als glückliche Benutzer registrieren.
    Zufallszahl für Jahresvariable von 2013 bis 2022 generieren Sie Zufallszahlen von 1 bis 12 für die Monatsvariable
    Generieren Sie eine Zufallszahl von 1 bis 28 für die Tagesvariable
    Übergeben Sie diese drei Variablen mithilfe der LocalDate-Klasse an eine Methode
    und generieren Sie ein zufälliges Datum
    dafür;
  1-Erstellen Sie eine Benutzerklasse Felder: name , registerDate (in LocalDate)
  2-Erstellen Sie eine Klasse namens Registration und eine Methode namens register
    Fügen Sie es der ArrayList hinzu, indem Sie den Benutzernamen von User.
  3-Erstellen Sie eine Klasse namens Listing und fügen Sie eine Methode namens printHappyUsers hinzu
    Erstellen Sie eine Methode, die die Benutzer in der ArrayList druckt, die in den ersten 10 Tagen
    jedes Monats registriert sind.
*/
   String name;
    LocalDate registerDatum;

    public Benutzer(String name, LocalDate registerDatum) {
        this.name = name;
        this.registerDatum = registerDatum;
    }


    public Benutzer() {

    }
}

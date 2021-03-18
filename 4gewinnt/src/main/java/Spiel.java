import java.util.Scanner;

public class Spiel {

    Scanner sc = new Scanner(System.in);
    Konsole k1;
    Spielfeld sf;
    Spieler spieler1;
    Spieler spieler2;
    EingabeÜberprüfung eingabeÜberprüfung;

    public Spiel(Konsole k1) {
        this.sf = new Spielfeld();
        this.spieler1 = new Spieler('x');
        this.spieler2 = new Spieler('o');
        this.eingabeÜberprüfung = new EingabeÜberprüfung();
        this.k1 = k1;

    }


    public Spieler wechsleSpieler(Spieler aktuellerSpieler) {
        if (aktuellerSpieler.getZeichen() == 'x') {
            return spieler2;
        } else {
            return spieler1;
        }
    }


    public void spielStarten() {
        k1.willkommen();
        Spieler aktuellerSpieler = spieler1;
        do {
            System.out.println("Spieler " + aktuellerSpieler.getZeichen() + " bitte gib die Spalte und Zeile an, wo du dein Zeichen setzen willst: ");
            System.out.println("Zeile: ");
            int zeile = sc.nextInt();
            System.out.println("Spalte: ");
            int spalte = sc.nextInt();

            while (zeile < 0 || zeile >= 6 || spalte < 0 || spalte >= 7 || sf.getSpielfeld()[zeile][spalte] != 0) {
                System.out.println("Du hast eine ungültige Zeile oder Spalte eingegeben, bitte neu angeben");
                System.out.println("Zeile: ");
                zeile = sc.nextInt();
                System.out.println("Spalte");
                spalte = sc.nextInt();
            }
            sf.getSpielfeld()[zeile][spalte] = aktuellerSpieler.getZeichen();
            sf.zeichneSpielfeld();


            if (sf.isBoardFull()) {
                System.out.println("das Spiel ist vorbei, es endet unentschieden");

            } else {
                aktuellerSpieler = wechsleSpieler(aktuellerSpieler);

            }
        }
        while (!sf.isBoardFull() && !eingabeÜberprüfung.checkZeilen(aktuellerSpieler, sf) && ! eingabeÜberprüfung.checkSpalten(sf));

        if (!sf.isBoardFull()) {
            aktuellerSpieler = wechsleSpieler(aktuellerSpieler);
            System.out.println("Das Spiel ist vorbei, gewonnen hat Spieler " + aktuellerSpieler.getZeichen());
        }
    }
}



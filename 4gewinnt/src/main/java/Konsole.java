import java.util.Scanner;

public class Konsole {

    private Spiel spiel;
    private  Spielfeld sf;
    private Scanner sc = new Scanner(System.in);
    public Konsole() {

    }

    public void willkommen(){
        System.out.println("Herzlich Willkommen zum Spiel 4 Gewinnt");
        System.out.println("Soblad ein Spieler 4 Steine hintereinander in einer senkrechten, diagonalen oder horizontalen Linie hat, hat er das Spiel gewonnen");
        System.out.println("Jeder Spieler hat 21 Spielsteine zur Verfügung");
    }

}

public class Main {


    public static void main(String[] args) {
        Spielfeld sf = new Spielfeld();
        Konsole k1 = new Konsole();
        Spiel spiel = new Spiel(k1);
        sf.zeichneSpielfeld();
        spiel.spielStarten();

    }
}

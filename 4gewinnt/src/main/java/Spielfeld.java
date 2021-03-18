public class Spielfeld {

    public char[][] Spielfeld = new char[6][7];

    public void zeichneSpielfeld() {

        for (int zeile = 0; zeile < 6; zeile++) {
            System.out.print("| ");

            for (int spalte = 0; spalte < 7; spalte++) {
                if (getSpielfeld()[zeile][spalte] == 0) {
                    System.out.print('-');
                } else {
                    System.out.print(Spielfeld[zeile][spalte]);
                }
                System.out.print(" | ");
            }

            System.out.println();
        }

    }


    public char[][] getSpielfeld() {
        return Spielfeld;
    }

    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (Spielfeld[i][j] == 0) {
                    isFull = false;
                }
            }
        }

        return isFull;
    }
}



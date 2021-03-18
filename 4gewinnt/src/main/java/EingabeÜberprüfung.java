public class EingabeÜberprüfung {


    /*public boolean checkEingabe(Spielfeld sf) {
        if (checkZeilen(sf) || checkSpalten(sf)) {
            return true;
        }
        return false;
    }*/

    private boolean checkZeilenSpalten(char c1, char c2, char c3, char c4) {
        if ((c1 != 0) && (c1 == c2) && (c2 == c3) && (c3 == c4)) {
            return true;
        }
        return false;
    }


   public boolean checkSpalten(Spielfeld sf) {
        for (int spalte = 0; spalte < 7; spalte++) {

            if (checkZeilenSpalten(sf.getSpielfeld()[0][spalte], sf.getSpielfeld()[1][spalte], sf.getSpielfeld()[2][spalte], sf.getSpielfeld()[3][spalte])) {
                return true;
            }
        }

        return false;
    }


    public boolean checkZeilen(Spieler spieler, Spielfeld sf){
        for( int i =0; i <4; i++){
            for(int j = 0; j <7; j++)
            if(sf.getSpielfeld()[i][j] == spieler.getZeichen()
                    && sf.getSpielfeld()[i+1][j] == spieler.getZeichen()
                    && sf.getSpielfeld()[i+2][j] == spieler.getZeichen()
                    && sf.getSpielfeld()[i+3][j] == spieler.getZeichen()){
                return true;
            }
        }
        return false;
    }

   /*private boolean checkZeilen(Spielfeld sf) {
        for (int zeile = 0; zeile < 6; zeile++)
            if (checkZeilenSpalten(sf.getSpielfeld()[zeile][0], sf.getSpielfeld()[zeile][1], sf.getSpielfeld()[zeile][2], sf.getSpielfeld()[zeile][3])) {
                return true;

            }
        return false;
    }*/

}




import java.util.ArrayList;

public class Noten {

    //Methode welche alle Noten zurückgibt, welche nicht ausreichend (<40) sind
    public int[] durchgefallen(int[] noten) {
        ArrayList<Integer> kleinenoten = new ArrayList<>();
        for (int i : noten) {
            if (i < 40) kleinenoten.add(i);
        }
        return kleinenoten.stream().mapToInt(Integer::intValue).toArray();
    }

    //Methode welche den Durchschnittswert aller Noten zurückgibt
    public double durchschnitt(int[] noten) {
        double summe = 0;
        for (int i : noten) {
            summe += i;
        }
        //Double runden auf 2 Dezimalstellen
        return Math.round(summe/noten.length * 100.0)/100.0;
    }

    //Methode welche die nach gegebenen Regeln gerundeten Noten zurückgibt
    public int[] gerundet(int[] noten) {
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] > 37 && noten[i] % 5 >= 3) {
                noten[i] += 5 - (noten[i] % 5);
            }
        }
        return noten;
    }

    //Methode welche die beste Note nach durchgeführter Rundung zurückgibt
    public int maxgerundet(int[] noten) {
        int[] gerundet = gerundet(noten);
        int max = 0;
        for (int i : gerundet) {
            if (i > max) max = i;
        }
        return max;
    }

}

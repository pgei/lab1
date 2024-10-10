import java.util.ArrayList;

public class Noten {

    public int[] durchgefallen(int[] noten) {
        ArrayList<Integer> kleinenoten = new ArrayList<>();
        for (int i : noten) {
            if (i < 40) kleinenoten.add(i);
        }
        return kleinenoten.stream().mapToInt(Integer::intValue).toArray();
    }

    public double durchschnitt(int[] noten) {
        double summe = 0;
        for (int i : noten) {
            summe += i;
        }
        //Double abrunden auf 2 Dezimalstellen
        return Math.round(summe/noten.length * 100.0)/100.0;
    }





}

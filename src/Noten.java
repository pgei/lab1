import java.util.ArrayList;

public class Noten {

    public int[] durchgefallen(int[] noten) {
        ArrayList<Integer> kleinenoten = new ArrayList<>();
        for (int i : noten) {
            if (i < 40) kleinenoten.add(i);
        }
        return kleinenoten.stream().mapToInt(Integer::intValue).toArray();
    }





}

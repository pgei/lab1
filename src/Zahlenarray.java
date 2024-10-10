public class Zahlenarray {

    public int maxnumber(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public int minnumber(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }



}

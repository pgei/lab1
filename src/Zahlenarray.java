public class Zahlenarray {

    public int maxnumber(int[] zahlen) {
        int max = 0;
        for (int i : zahlen) {
            if (i > max) max = i;
        }
        return max;
    }

    public int minnumber(int[] zahlen) {
        int min = Integer.MAX_VALUE;
        for (int i : zahlen) {
            if (i < min) min = i;
        }
        return min;
    }

    public int maxsum(int[] zahlen) {
        int min = minnumber(zahlen);
        int sum = 0;
        int count = 0;
        for (int i : zahlen) {
            if (i != min) {
                sum += i;
                count++;
            }
        }
        //Minimale Zahl dazuaddieren falls diese mehr als einmal im Array vorkommt
        if (count != zahlen.length-1) {
            sum += min * (zahlen.length-1-count);
        }
        return sum;
    }

}

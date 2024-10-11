public class Arrayrechnen {

    public int[] summe(int[] erstezahl, int[] zweitezahl) {
        StringBuilder ersterstring = new StringBuilder();
        StringBuilder zweiterstring = new StringBuilder();
        for (int i : erstezahl) {
            ersterstring.append(i);
        }
        for (int j : zweitezahl) {
            zweiterstring.append(j);
        }
        String summe = Integer.toString(Integer.parseInt(ersterstring.toString())+Integer.parseInt(zweiterstring.toString()));
        int[] output = new int[summe.length()];
        for (int k = 0; k < summe.length(); k++) {
            output[k] = Integer.parseInt(String.valueOf(summe.charAt(k)));
        }
        return output;
    }

}

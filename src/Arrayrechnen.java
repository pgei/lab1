public class Arrayrechnen {

    //Methode welche die Summe zweier ganzer Zahlen dargestellt als Array bestimmt
    public int[] summe(int[] arrayeins, int[] arrayzwei) {
        int erstezahl = array2int(arrayeins);
        int zweitezahl = array2int(arrayzwei);
        int summe = erstezahl+zweitezahl;
        return int2array(summe);
    }

    //Methode welche die absolute Differenz zweier ganzer Zahlen dargestellt als Array bestimmt
    public int[] differenz(int[] arrayeins, int[] arrayzwei) {
        int erstezahl = array2int(arrayeins);
        int zweitezahl = array2int(arrayzwei);
        int differenz = Math.abs(erstezahl - zweitezahl);
        return int2array(differenz);
    }

    //Methode welche die Multiplikation einer ganzen Zahl dargestellt als Array mit einer Ziffer bestimmt
    public int[] multiplikation(int[] array, int zweitezahl) {
        int erstezahl = array2int(array);
        int multiplikation = erstezahl * zweitezahl;
        return int2array(multiplikation);
    }

    //Methode welche die ganzzahlige Division einer ganzen Zahl dargestellt als Array mit einer Ziffer bestimmt
    public int[] division(int[] array, int zweitezahl) {
        int erstezahl = array2int(array);
        int division = erstezahl / zweitezahl;
        return int2array(division);
    }

    //Hilfsmethode, die Array in Zahl umwandelt
    private int array2int(int[] array) {
        StringBuilder zahl = new StringBuilder();
        for (int i : array) {
            zahl.append(i);
        }
        return Integer.parseInt(zahl.toString());
    }

    //Hilfsmethode, die Zahl in Array umwandelt
    private int[] int2array(int zahl) {
        String zahlstring = Integer.toString(zahl);
        int[] array = new int[zahlstring.length()];
        for (int k = 0; k < zahlstring.length(); k++) {
            array[k] = Integer.parseInt(String.valueOf(zahlstring.charAt(k)));
        }
        return array;
    }
}
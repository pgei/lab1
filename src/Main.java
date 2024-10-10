public class Main {

    public static void main(String[]  args) {

        //todo: Tests für Aufgaben durchführen + Kommentare

        int[] noten = {29, 37, 38, 41, 84, 67};
        Noten notenanalyse = new Noten();

        //Aufgabe 1.1
        int[] durchgefallen = notenanalyse.durchgefallen(noten);
        printArray(durchgefallen);

        //Aufgabe 1.2
        System.out.println(notenanalyse.durchschnitt(noten));

        //Aufgabe 1.3
        int[] gerundet = notenanalyse.gerundet(noten);
        printArray(gerundet);

        //Aufgabe 1.4
        System.out.println(notenanalyse.maxgerundet(noten));

        int[] zahlen = {4, 8, 3, 10, 17};
        Zahlenarray zahlenanalyse = new Zahlenarray();

        //Aufgabe 2.1
        System.out.println(zahlenanalyse.maxnumber(zahlen));

        //Aufgabe 2.2
        System.out.println(zahlenanalyse.minnumber(zahlen));

        //Aufgabe 2.3
        System.out.println(zahlenanalyse.maxsum(zahlen));

        //Aufgabe 2.4
        System.out.println(zahlenanalyse.minsum(zahlen));

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

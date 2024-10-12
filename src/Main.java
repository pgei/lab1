public class Main {

    public static void main(String[] args) {

        //todo: Tests für Aufgaben durchführen
        //todo: Aufgabe 3 fragen ob Differenz als Absolutwert okay
        //todo: Aufgabe 3 fragen ob int-Array Rückgabewert sein soll
        //todo: Aufgabe 3 "Die Zahlen haben die gleiche Anzahl an Ziffern", Konsequenz?
        //todo: Aufgabe 4 soll Fehlerbehandlung eingebaut sein (z.B. min von Int-Array leer)?

        System.out.println("##################");

        int[] noten = {29, 37, 38, 41, 84, 67};
        Noten notenanalyse = new Noten();

        //Aufgabe 1.1
        int[] durchgefallen = notenanalyse.durchgefallen(noten);
        System.out.print("Aufgabe 1.1: ");
        printArray(durchgefallen);

        //Aufgabe 1.2
        System.out.println("Aufgabe 1.2: "+notenanalyse.durchschnitt(noten));

        //Aufgabe 1.3
        int[] gerundet = notenanalyse.gerundet(noten);
        System.out.print("Aufgabe 1.3: ");
        printArray(gerundet);

        //Aufgabe 1.4
        System.out.println("Aufgabe 1.4: "+notenanalyse.maxgerundet(noten));

        System.out.println("##################");

        int[] zahlen = {4, 8, 3, 10, 17};
        Zahlenarray zahlenanalyse = new Zahlenarray();

        //Aufgabe 2.1
        System.out.println("Aufgabe 2.1: "+zahlenanalyse.maxnumber(zahlen));

        //Aufgabe 2.2
        System.out.println("Aufgabe 2.2: "+zahlenanalyse.minnumber(zahlen));

        //Aufgabe 2.3
        System.out.println("Aufgabe 2.3: "+zahlenanalyse.maxsum(zahlen));

        //Aufgabe 2.4
        System.out.println("Aufgabe 2.4: "+zahlenanalyse.minsum(zahlen));

        System.out.println("##################");

        int[] erstezahl = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zweitezahl = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] drittezahl = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] viertezahl = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] funftezahl = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        Arrayrechnen rechnen = new Arrayrechnen();

        //Aufgabe 3.1
        int[] summe = rechnen.summe(erstezahl, zweitezahl);
        System.out.print("Aufgabe 3.1: ");
        printArray(summe);

        //Aufgabe 3.2
        int[] differenz = rechnen.differenz(drittezahl, viertezahl);
        System.out.print("Aufgabe 3.2: ");
        printArray(differenz);

        //Aufgabe 3.3
        int[] multiplikation = rechnen.multiplikation(funftezahl, 2);
        System.out.print("Aufgabe 3.3: ");
        printArray(multiplikation);

        //Aufgabe 3.4
        int[] division = rechnen.division(funftezahl, 2);
        System.out.print("Aufgabe 3.4: ");
        printArray(division);

        System.out.println("##################");

        int[] tastaturen = {40, 39, 70, 15, 45};
        int[] usb = {20, 15, 40, 15};
        ElektronikShop shop = new ElektronikShop(tastaturen, usb);

        //Aufgabe 4.1
        System.out.println("Aufgabe 4.1: "+shop.billigsteTastatur());

        //Aufgabe 4.2
        System.out.println("Aufgabe 4.2: "+shop.teuersterGegenstand());

        //Aufgabe 4.3
        System.out.println("Aufgabe 4.3: "+shop.maxbudgetLaufwerk(30));

        //Aufgabe 4.4
        System.out.println("Aufgabe 4.4: "+shop.maxGeldbetrag(58));
    }

    //Methode um Arrayinhalt im Terminal zu printen
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
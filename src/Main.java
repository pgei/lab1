public class Main {

    public static void main(String[]  args) {

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

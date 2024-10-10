public class Main {

    public static void main(String[]  args) {
        int[] noten = {29, 37, 38, 41, 84, 67};
        Noten notenanalyse = new Noten();

        //Aufgabe 1.1
        int[] durchgefallen = notenanalyse.durchgefallen(noten);
        printArray(durchgefallen);

        //Aufgabe 1.2
        System.out.println(notenanalyse.durchschnitt(noten));

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

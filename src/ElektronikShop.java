public class ElektronikShop {

    int[] tastaturen;
    int[] usb_laufwerke;

    public ElektronikShop(int[] tastatur, int[] usb_laufwerk) {
        this.tastaturen = tastatur;
        this.usb_laufwerke = usb_laufwerk;
    }

    public int billigsteTastatur() {
        int min = Integer.MAX_VALUE;
        for (int i : this.tastaturen) {
            if (i < min) min = i;
        }
        return min;
    }

}

import java.util.Arrays;

public class ElektronikShop {

    int[] tastaturen;
    int[] usb_laufwerke;

    public ElektronikShop(int[] tastatur, int[] usb_laufwerk) {
        this.tastaturen = tastatur;
        this.usb_laufwerke = usb_laufwerk;
    }

    public int billigsteTastatur() {
        return Arrays.stream(this.tastaturen).min().getAsInt();
    }

    public int teuersterGegenstand() {
        int max_tastaturen = Arrays.stream(this.tastaturen).max().getAsInt();
        int max_usb = Arrays.stream(this.usb_laufwerke).max().getAsInt();
        return Math.max(max_tastaturen, max_usb);
    }


}

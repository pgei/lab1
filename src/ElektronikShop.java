import java.util.Arrays;

public class ElektronikShop {

    int[] preise_tastaturen;
    int[] preise_usb_laufwerke;

    public ElektronikShop(int[] tastatur, int[] usb_laufwerk) {
        this.preise_tastaturen = tastatur;
        this.preise_usb_laufwerke = usb_laufwerk;
    }

    public int billigsteTastatur() {
        return Arrays.stream(this.preise_tastaturen).min().getAsInt();
    }

    public int teuersterGegenstand() {
        int max_tastaturen = Arrays.stream(this.preise_tastaturen).max().getAsInt();
        int max_usb = Arrays.stream(this.preise_usb_laufwerke).max().getAsInt();
        return Math.max(max_tastaturen, max_usb);
    }

    public int maxbudgetLaufwerk(int budget) {
        int max = -1;
        for (int i : this.preise_usb_laufwerke) {
            if (i <= budget && i > max) max = i;
        }
        return max;
    }


}

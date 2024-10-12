import java.util.Arrays;

public class ElektronikShop {

    int[] preise_tastaturen;
    int[] preise_usb_laufwerke;

    public ElektronikShop(int[] tastatur, int[] usb_laufwerk) {
        this.preise_tastaturen = Arrays.stream(tastatur).sorted().toArray();
        this.preise_usb_laufwerke = Arrays.stream(usb_laufwerk).sorted().toArray();
    }

    public int billigsteTastatur() {
        return this.preise_tastaturen[0];
    }

    public int teuersterGegenstand() {
        return Math.max(this.preise_tastaturen[this.preise_tastaturen.length-1], this.preise_usb_laufwerke[this.preise_usb_laufwerke.length-1]);
    }

    public int maxbudgetLaufwerk(int budget) {
        int max = -1;
        for (int i : this.preise_usb_laufwerke) {
            if (i <= budget && i > max) max = i;
        }
        return max;
    }

    public int maxGeldbetrag(int budget) {
        int index_t = this.preise_tastaturen.length-1;
        int preis_t = this.preise_tastaturen[index_t];
        int maxsumme = -1;
        for (int preis_u : this.preise_usb_laufwerke) {
            if (preis_u < budget) {
                while (index_t > 0 && preis_t + preis_u > budget) {
                    index_t--;
                    preis_t = this.preise_tastaturen[index_t];
                }
                if (preis_t + preis_u <= budget && preis_t + preis_u > maxsumme) maxsumme = preis_t + preis_u;
                index_t = this.preise_tastaturen.length - 1;
            }
        }
        return maxsumme;
    }
}

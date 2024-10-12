import java.util.Arrays;

public class ElektronikShop {

    //Objektattribute die eine sortierte Liste mit den jeweiligen Preisen speichern
    int[] preise_tastaturen;
    int[] preise_usb_laufwerke;

    //Konstruktor sortiert und speichert die Preise
    public ElektronikShop(int[] tastatur, int[] usb_laufwerk) {
        this.preise_tastaturen = Arrays.stream(tastatur).sorted().toArray();
        this.preise_usb_laufwerke = Arrays.stream(usb_laufwerk).sorted().toArray();
    }

    //Methode welche die billigste Tastatur zurückgibt
    public int billigsteTastatur() {
        return this.preise_tastaturen[0];
    }

    //Methode welche den teuersten von allen Gegenständen zurückgibt
    public int teuersterGegenstand() {
        return Math.max(this.preise_tastaturen[this.preise_tastaturen.length-1], this.preise_usb_laufwerke[this.preise_usb_laufwerke.length-1]);
    }

    //Methode welche das teuerste Laufwerk zurückgibt, welches mit dem gegebenen Budget gekauft werden kann
    public int maxbudgetLaufwerk(int budget) {
        int max = -1;
        for (int i : this.preise_usb_laufwerke) {
            if (i <= budget && i > max) max = i;
        }
        return max;
    }

    //Methode welche den maximalen Geldbetrag findet, der mit dem gegebenen Budget für eine Tastatur und ein Laufwerk zusammen ausgegeben werden kann
    public int maxGeldbetrag(int budget) {
        int index_t = this.preise_tastaturen.length-1;
        int preis_t = this.preise_tastaturen[index_t];
        int maxsumme = -1;
        //Preise der Laufwerke durchiteriert und Summe gebildet mit der teuersten Tastatur, sodass die Summe noch im Budget ist
        for (int preis_u : this.preise_usb_laufwerke) {
            if (preis_u < budget) {
                while (index_t > 0 && preis_t + preis_u > budget) {
                    index_t--;
                    preis_t = this.preise_tastaturen[index_t];
                }
                //Falls eine Summe gefunden wurde, die ins Budget passt, wird kontrolliert, ob diese Summe größer ist als der bisherige maximale Geldbetrag
                if (preis_t + preis_u <= budget && preis_t + preis_u > maxsumme) maxsumme = preis_t + preis_u;
                index_t = this.preise_tastaturen.length - 1;
            }
        }
        return maxsumme;
    }
}


package butorgyar;

public class Butor {
    
    public int lapokSzama;
    public Butorlap[] lapok;

    public Butor() {
        this.lapokSzama = 0;
        this.lapok = new Butorlap[100];
    }
    
    
    
    public void lapHozzaad(Butorlap lap){
        if (lapokSzama < 100){
            this.lapok[lapokSzama] = lap;
            lapokSzama++;
        }
    }
    
    public double arSzamol(){
        double ar = 0;
        for (int i = 0; i < lapokSzama; i++) {
            ar += this.lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Bútorlapok száma: " + lapokSzama + " db\n\t      ár: " + arSzamol() + "Ft";
    }
    
}

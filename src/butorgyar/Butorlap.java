
package butorgyar;

public class Butorlap {
    private double hossz;//cm
    private double szelesseg;//cm
    private String lap;//tartólap vagy hátlap lehet
    private static final int TARTOLAPAR = 5000;//m2 ár
    private static final int HATLAPAR = 500;//m2 ár

    public Butorlap(double hossz, double szelesseg, String lap) {
        this.hossz = hossz/100;//méterbe átszámolva
        this.szelesseg = szelesseg/100;//méterbe átszámolva
        this.lap = lap;
    }
    
    public double arSzamol(){
        if (lap == "tartólap")
            return hossz * szelesseg * TARTOLAPAR;
        else return hossz * szelesseg * HATLAPAR;
    }

    public double getHossz() {
        return hossz;
    }

    public void setHossz(double hossz) {
        this.hossz = hossz;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    public void setSzelesseg(double szelesseg) {
        this.szelesseg = szelesseg;
    }

    public String getLap() {
        return lap;
    }

    public void setLap(String lap) {
        this.lap = lap;
    }

    public static int getTARTOLAPAR() {
        return TARTOLAPAR;
    }

    public static int getHATLAPAR() {
        return HATLAPAR;
    }

    
    
    
    
}

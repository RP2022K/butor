
package futtat;

import butorgyar.Butor;
import butorgyar.Butorlap;

public class ButorMain {
    
    public static void main(String[] args) {
        
        Butor komod = new Butor();
        
        Butorlap b1 = new Butorlap(100, 120, "h�tlap");
        Butorlap b2 = new Butorlap(108, 40, "tart�lap");
        Butorlap b3 = new Butorlap(40, 112, "tart�lap");
        
        komod.lapHozzaad(b1);
        komod.lapHozzaad(b2);
        komod.lapHozzaad(b3);
        
        System.out.println(komod.toString());
    }
    
}

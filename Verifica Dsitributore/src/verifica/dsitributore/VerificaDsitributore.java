/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica.dsitributore;
import java.util.Scanner;
/**
 *
 * @author 72873486
 */
public class VerificaDsitributore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double costo1=0.55;
        double costo2=0.70;
        int botttiglie1=20;
        int bottiglie2=20;
        double importo = 0;
        
        Distributore D = new Distributore( costo1, costo2, botttiglie1, bottiglie2, importo );
        D.inserrisciMonete(0.50);
        D.inserrisciMonete(0.20);
        D.ricaricaDistributore(5, 4);
        D.scegliBevanda(1);
        D.ritiraResto();
        D.visualizzaStato();
    }
    
}

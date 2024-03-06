
package tobbdimenziostombok;

import java.util.Random;

public class MelyikKockaval {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int SOR_DB= 6; //dobas_db
        final int OSZL_DB= 6; //KOcka_oldal
        
        int[][] dobasok = new int [SOR_DB+1][OSZL_DB+1];
        
        /*feltöltés*/
        for (int i = 0; i < SOR_DB; i++) {
            int dobas1 = (int) (Math.random()*OSZL_DB)+1;
            int dobas2 = (int) (Math.random()*OSZL_DB)+1;
            
            dobasok[dobas1][dobas2]++;
        }
        
        /*megjelenítés*/
        for (int i = 0; i < OSZL_DB; i++) {
            for (int j = 0; j < OSZL_DB; j++) {
                System.out.printf("%3d", dobasok[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
       
    }
}

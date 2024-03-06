package tobbdimenziostombok;

public class TobbdimenziosTombok {

    public static void main(String[] args) {
        final int SOR_DB= 3;
        final int OSZL_DB= 5;
        
        int[][] negyzetes = new int [SOR_DB][OSZL_DB];
        
        /*közvetlen elérés*/
        negyzetes [1][2]=1;
        
        /*megjeenítés*/
        System.out.println("négyzetes: ");
        for (int sor = 0; sor < SOR_DB; sor++) {
            /*aott sorban lévő tömb memóriacíme*/
            //System.out.println(negyzetes[i]);
            for (int oszl = 0; oszl < OSZL_DB; oszl++) {
                System.out.print(negyzetes[sor][oszl]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        /*létrehzás*/
        int[][] fureszes = new int [5][];
        
        /*feltöltés*/
        for (int sor = 0; sor < 5; sor++) {
            /*aott sorban nincs semmi, null*/
            System.out.println(fureszes[sor]);
            for (int oszl = 0; oszl < 3; oszl++) {
                /*NUllpointException*/
                //System.out.println(fureszes[i][j]);
                //fureszes[sor]=new int[3]; // 3 oszlop minden sor
                fureszes[sor]=new int[3+sor];
            }
        }
        
        /*közvetlenelérés*/
        fureszes [1][2]=1;
        fureszes [2][1]=1;
        
        /*megjeenítés*/
        /*System.out.println("fűrészes: ");
        int sorDb = fureszes.length;
        for (int sor = 0; sor < sorDb.length; sor++) {
            for (int oszl = 0; oszl < 3; oszl++) {
                System.out.print(fureszes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");*/
    }
    
}

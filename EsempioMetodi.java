import java.util.Scanner; // Import the Scanner class
public class EsempioMetodi {
    String[] listaAllievi;
    int[] voti;
    float[] tasse;
    int n = 0;  
    public static void main(String[] args) {
              
        String nomeVotoMax = "";        
        int votoMax = 0;
        
        float sommaTasse = 0;
        float sommaVoti = 0;
        float numPromossi = 0;
        
        Scanner lettoreNome = new Scanner(System.in);
        Scanner lettoreV = new Scanner(System.in);
        Scanner lettoreT = new Scanner(System.in);

        System.out.println("Quanti sono gli allievi?"); 
        n = lettoreV.nextInt();

        listaAllievi = new String[n];
        voti = new int[n];
        tasse = new float[n];

        caricoDatiAllievi();
        assegnoVoti();
        stampaVoti();
        calcoliVari(); 
        stampaRisultati();        

        lettoreV.close();
        lettoreNome.close();
        lettoreT.close();
    }  
    
    // Metodi

    static void caricoDatiAllievi(){
        for(int i=0; i<n; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Nome del allievo " + (i+1));
            listaAllievi[i] = lettoreNome.nextLine();
            System.out.println("Allievo " + listaAllievi[i] + " deve versare la tassa. Quanto ci da?");
            tasse[i] = lettoreT.nextFloat();
        }
    }
    static void assegnoVoti() {
        for(int i=0; i<listaAllievi.length; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Allievo " + listaAllievi[i] + " ha pagato " + tasse[i]);
            System.out.println("Che voto diamo a " + listaAllievi[i] + "? (da 1 a 10)");
            voti[i] = lettoreV.nextInt();
        }
    }   
    static void stampaVoti() {
        for(int i=0; i<listaAllievi.length; i++) {
            System.out.println("----------------------------------------");
            System.out.println(listaAllievi[i] + " si è beccato " + voti[i]);
        }  
    }
    static void calcoliVari() {
        for(int i=0; i<tasse.length; i++) {  
            if(voti[i]>votoMax) {
                votoMax = voti[i];
                nomeVotoMax = listaAllievi[i];
            }
            sommaTasse = sommaTasse + tasse[i];
            sommaVoti = sommaVoti + voti[i];
            if(voti[i]>5) {
                numPromossi = numPromossi + 1;
            }
        }  

    }
    static void stampaRisultati() {
        System.out.println("----------------------------------------");
        System.out.println("Le nostre entrate sono " + sommaTasse);  
        System.out.println("La media dei voti è di " + sommaVoti/(voti.length));
        System.out.println("Abbiamo " + numPromossi + " di promossi per il totale di " + listaAllievi.length);  
        System.out.println("L'allievo più bravo è " + nomeVotoMax + " con il voto " + votoMax); 
    }

    static void alteraVoti(int valore, int votoMax) {
        for(i=0; i<voti.length; i++) {
            voti[i]=voti[i] + valore;
            if((voti[i]>votoMax) {
                voti[i]=votoMax;
            } 
            else
            if(voti[i]<0){
                    voti[i]=0;
            } 
                 
        }   
    } 
    static void stampaNumeroEsami(){
        System.out.println("Oggi sono stati eseguiti " + esamiDelGiorno.length);
    }   
}

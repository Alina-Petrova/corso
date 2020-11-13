import java.util.Scanner; // Import the Scanner class

public class prova3 {
    public static void main(String[] args) {
        float conto = 0;
        float operazione = 0;
        int tipo = 0;
        Scanner tipoOperazione = new Scanner(System.in);
        Scanner inserire = new Scanner(System.in);
        do {
            conto = conto + operazione;
            System.out.println("Hai sul conto " + conto); 
            System.out.println("Per fare il prelievo, digita 0, per il versamento 1 oppure 2 per uscire");
            tipo = tipoOperazione.nextInt();
            
            if (tipo !=1 & tipo !=0) {
                System.out.println("Non ho capito, cosa vuoi fare");
            }
            else {
                if (tipo != 2) {
                    System.out.println("Digita l'importo dell'operazione");
                    operazione = inserire.nextFloat(); 
                }
            if (tipo == 0) {
                    operazione = -operazione;   
                }  
            }
                               
        } 
        while (tipo != 2);
        System.out.println("Hai sul conto " + conto + " Ciao!");
               
    }
}

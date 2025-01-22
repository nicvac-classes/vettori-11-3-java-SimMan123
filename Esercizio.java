
import java.util.Scanner;
public static char controllo(char o) {
    Scanner input = new Scanner (System.in);
    while (o!='a' && o!='s' && o!='r' && o!='e' && o!='v' && o!='x') {
        System.out.println("Inserire un elemento in una posizione specificata >> a" + "Eliminare un elemento da una posizione specificata >> s" + "Ricerca di un valore >> r" + "Eliminare tutti i duplicati dal vettore >> e" + "Visualizzare il vettore >> v" + "Uscire dal programma >> x ");
        o = input.next().charAt(0);
    }
    return o;
}

class esercizio {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, c, d;
        char o;

        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        do {
            System.out.println("Inserire un elemento in una posizione specificata >> a" + "Eliminare un elemento da una posizione specificata >> s" + "Ricerca di un valore >> r" + "Eliminare tutti i duplicati dal vettore >> e" + "Visualizzare il vettore >> v" + "Uscire dal programma >> x ");
            o = input.next().charAt(0);         
            o=Character.toLowerCase(o);
            o = controllo(o);
            if (o=='a') {
            } else {
                if (o=='s') {
                } else {
                    if (o=='r') {
                    }
                }
            }
        } while (o!='x');
    }
    
   
}

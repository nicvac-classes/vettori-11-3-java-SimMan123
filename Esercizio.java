import java.util.*;
import java.lang.Math;

class Program {
    public static void azzeraVettore(int[] v, int n) {
        int i;

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
    }
    
    public static int eliminaDaVettore(int[] v, int n) {
        int i, e;
        int[] w = new int[n];

        do {
            System.out.println("Quale cella del vettore eliminare? (indice)");
            e = input.nextInt();
        } while (i < 0 || i >= n);
        for (i = 0; i <= e - 1; i++) {
            w[i] = v[i];
        }
        for (i = e + 1; i <= n - 1; i++) {
            w[i] = v[i];
        }
        
        return w;
    }
    
    public static int inserisciInVettore(int[] v, int n, int e, int i) {
        int p, i, a;
        int[] w = new int[n + 1];

        do {
            System.out.println("inserire posizione elemento da aggiungere");
            p = input.nextInt();
        } while (i < 0 || i >= n);
        for (i = 0; i <= p - 2; i++) {
            w[i] = v[i];
        }
        w[p + 1] = e;
        for (i = 0; i <= n; i++) {
            w[i] = v[i + 1];
        }
        
        return w;
    }
    
    public static String leggiComando() {
        String c;

        do {
            System.out.println("1. [I]nserisci elemento " + (char) 10 + "2. [E]limina elemento " + (char) 10 + "3. [R]icerca valore " + (char) 10 + "4. [D] Elimina Duplicati " + (char) 10 + "5. [V]isualizza vettore " + (char) 10 + "6. [X] Esci");
            c = input.nextLine();
        } while (!c.equals("I") && !c.equals("E") && !c.equals("R") && !c.equals("D") && !c.equals("V") && !c.equals("X"));
        
        return c;
    }
    
    public static int ricercaNelVettore(int[] v, int n, int valore) {
        int i, t;
        boolean r;

        r = true;
        System.out.println("inserire l'elemento da cercare");
        t = input.nextInt();
        for (i = 0; i <= n - 1; i++) {
            if (v[i] == t) {
                System.out.println(Integer.toString(t) + " si trova nella posizione " + (i + 1));
            } else {
                r = false;
            }
        }
        
        return r;
    }
    
    public static int rimuoviDuplicati(int[] v, int n) {
        int n2;

        n2 = n;
        
        return n2;
    }
    
    public static void visualizzaVettore(int[] v, int n) {
        int i;

        i = 0;
        while (i < n) {
            System.out.println(v[i]);
            i = i + 1;
        }
    }
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String c;
        int n, i, e;
        boolean r;

        System.out.println("Inserisci la dimensione del vettore: ");
        n = input.nextInt();
        int[] v = new int[n];

        azzeraVettore(v, n);
        do {
            c = leggiComando();
            if (c.equals("I")) {
                System.out.println("Valore da inserire");
                e = input.nextInt();
                v = inserisciInVettore(v, n, e);
            }
            if (c.equals("E")) {
                v = eliminaDaVettore(v, n);
            }
            if (c.equals("R")) {
                System.out.println("Valore da cercare");
                e = input.nextInt();
                r = ricercaNelVettore(v, n, e);
                if (r == true) {
                    System.out.println("elemento " + e + " trovato in posizione " + i);
                } else {
                    System.out.println("Elemento " + e + " non trovato.");
                }
            }
            if (c.equals("D")) {
                System.out.println("Rimozione dei duplicati");
                n = rimuoviDuplicati(v, n);
            }
            if (c.equals("V")) {
                visualizzaVettore(v, n);
            }
        } while (!c.equals("X"));
    }
    
    
}


package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoJatekProgram {
        private static final int MEZO_SZAM=7;
        private static final int HAJO_HOSSZ=3;

        private static int[] mezok;
        private static int[] hajok;
        private static int tipp;
        
        
        private static int gepTipp;
        private static int jatekosTipp;
        
        private static int min = 1;
        private static int max = 7;
        static int range = max - min + 1;
    public static void main(String[] args) {
        mezokFeltolt();
        mezokMegjelenit();
        hajokElhelyez();
        
        
        tippTorpedoJatekos();
        tippHajokEll(jatekosTipp);
        tippTorpedoGep();
        tippHajokEll(gepTipp);
    }

    private static void mezokFeltolt() {
        mezok = new int[MEZO_SZAM];
        for (int i = 0; i < MEZO_SZAM; i++) {
            mezok[i]=i+1;
        }
    }

    private static void hajokElhelyez() {
        hajok = new int[HAJO_HOSSZ];
        
        int hajoElsoResz;
        Random rnd = new Random();
        hajoElsoResz=rnd.nextInt(7)+1;
        hajok[0]=hajoElsoResz;
        
        switch (hajoElsoResz) {
            case 1:
                for (int i = 1; i < HAJO_HOSSZ; i++) {
                    hajok[i]=hajoElsoResz+(i+1);
                }   break;
            case 7:
                for (int i = 1; i < HAJO_HOSSZ; i++) {
                    hajok[i]=hajoElsoResz-(i+1);
                }   break;
            default:
                hajok[1]=hajoElsoResz-1;
                hajok[2]=hajoElsoResz+1;
                break;
        }
    }

    private static void tippTorpedoGep() {
        Random rnd = new Random();
        gepTipp = rnd.nextInt(7)+1;
    }

    private static void tippTorpedoJatekos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy tippet! ");
        jatekosTipp=sc.nextInt();
    }

    private static void tippHajokEll(int tipp) {
        int i = 0;
        while (i<HAJO_HOSSZ && !(hajok[i]==tipp)) {
            i++;
        }
        if (i<HAJO_HOSSZ) {
            System.out.println("Gratulálok! Lett egy találat!");
        } else {
            System.out.println("Sajnos nem talált!");
        }
    }

    private static void mezokMegjelenit() {
        for (int i = 0; i < MEZO_SZAM; i++) {
            System.out.print(mezok[i]+" ");
        }
        System.out.println("");
    }
}

package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoJatek {

    private final int MEZO_SZAM=7;
    private final int HAJO_HOSSZ=3;
    
    private int[] mezok;
    private int[] hajok;
    private int tipp;
    private int gepTipp;
    private int min = 1;
    private int max = 7;
    int range = max - min + 1;
    boolean talalat = false;

    public TorpedoJatek(int tipp) {
        mezokFeltolt();
        hajokElhelyez();
        this.tipp = tipp;
    }
    
    private void mezokFeltolt(){
        mezok = new int[MEZO_SZAM];
        for (int i = 0; i < MEZO_SZAM; i++) {
            mezok[i]=i+1;
        }
    }
    
    private void hajokElhelyez(){
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
    

    
     public void tippTorpedoGep() {

        int gepTipp = (int) (Math.random() * range) + min;

        for (int i = 0; i < mezok.length; i++) {
            if (gepTipp == hajok[i]) {

                System.out.println("A gépnek lett egy találata!");
            } else {

                System.out.println("A gép nem talált!");
            }
        }
    }
    
    public boolean tippHajokEll(){
        
         Scanner tipp = new Scanner(System.in);
         System.out.println("Add meg a tipped!");
         
         for (int i = 0; i < mezok.length; i++) {
            if (gepTipp == hajok[i]) {

                System.out.println("Gratulálok! Lett egy találat!");
            } else {

                System.out.println("Sajnos nem talált!");
            }
            
        }
 
        
        
        return true;
    }
    
    public void jatek(){
        
    }
}

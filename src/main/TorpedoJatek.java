package main;

import java.util.Random;

public class TorpedoJatek {

    private final int MEZO_SZAM=7;
    private final int HAJO_HOSSZ=3;    
    
    private int[] mezok;
    private int[] hajok;
    private int tipp;

    public TorpedoJatek(int tipp) {
        mezokFeltolt();
        hajokElhelyez();
        this.tipp = tipp;
    }
    
    public void mezokFeltolt(){
        mezok = new int[MEZO_SZAM];
        for (int i = 0; i < MEZO_SZAM; i++) {
            mezok[i]=i+1;
        }
    }
    
    public void hajokElhelyez(){
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
    
    public void tippTorpedo(){
        
    }
    
    public boolean tippHajokEll(){
        return true;
    }
}

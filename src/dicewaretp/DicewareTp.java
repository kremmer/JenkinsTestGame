/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicewaretp;


import static dicewaretp.readFile.readFile;
import java.util.Hashtable;
import java.util.Random;

/**
 * /Users/Eric/Desktop/diceware.txt
 * @author Eric
 */
public class DicewareTp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        String mdp ="";
        Hashtable Tab = new Hashtable();
        
        
        readFile("/Users/Eric/Desktop/diceware.txt", Tab);
        
        
        for(int t =0; t < 5;){
        int valeurMin = 1;
        int valeurMax = 6;
        String ValeurF = "";
        
        for(int i=0;i<5;i++){
            int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);
            ValeurF = ValeurF + Integer.toString(valeur);
        }
            if(Tab.get(ValeurF) != null){
               mdp = mdp + " " + Tab.get(ValeurF);
               t++;
            }        
        }
        System.out.println(mdp);
    }
    
    
    }
    


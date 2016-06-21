/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicewaretp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;

/**
 *
 * @author Eric
 */
public class readFile {
    public static void readFile(String pathToFile, Hashtable tab){
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile)));
            String ligne;
            while((ligne = reader.readLine()) != null){
                
                String[] split = ligne.split(" ");
                tab.put(split[0], split[1]);
                
            }
        } catch (Exception ex){
            System.err.println("Error. "+ex.getMessage());
        }
        
    }
}
//if(ligne.startsWith(valeur)){
//                    System.out.println(ligne);
  //              }
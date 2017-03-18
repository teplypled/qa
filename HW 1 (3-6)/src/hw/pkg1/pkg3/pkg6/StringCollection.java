/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg1.pkg3.pkg6;
import java.util.ArrayList;
/**
 *
 * @author Maryna
 */
public class StringCollection {
    
    ArrayList<String> strCollection = new ArrayList<>();
    
    public void addToStrCollection(String rndString){
    strCollection.add(rndString);
    }
    
    public ArrayList<String> getAllRndStrings(){
        return strCollection;
    }
    
}

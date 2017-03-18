/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rudenko;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maryna
 */
public class Polindrom {

    /**
     * @param args the command line arguments
     */
    private static Logger logger = Logger.getLogger(Polindrom.class.getName());//замість System.out.Println пишемо перед main, 
                                                                                //а потім а кожному класі пишемо logger.log(Level.INFO, "result is " + multiplyResult);
    
    public static void main(String[] args) {

        //int multiplyResult = multiplyResult(658, 867);
        int maxNumber = 0;
        for (int i = 999; i >= 100; i--){
            for (int j = 999; j >=100; j--){
                int multiplyResult = multiplyResult(i,j);
                if ((maxNumber <= multiplyResult)&&isItPolindromic(multiplyResult)){
                    maxNumber = multiplyResult;
                                    }
            }
        }
        logger.log(Level.INFO, "Maximal polindromic number is " + maxNumber);
        
        
        //logger.log(Level.INFO, "result is " + multiplyResult);
    }
    
    public static boolean isItPolindromic(int someNumber){
        
        boolean isItPolindromic = false;
        char[]numberElements = Integer.toString(someNumber).toCharArray();
        int lenghtCharhArray = numberElements.length / 2;
        int index = numberElements.length - 1;

        for( int i = 0; i < lenghtCharhArray; i++){
            if (numberElements[i]==numberElements[index]){
                index--;
                isItPolindromic = true;
                } else {
                    return false;
            }
        }
        
        return isItPolindromic;
    }
    
    public static int multiplyResult(int numberOne, int numberTwo){
        
        int result = 0;
        result = numberOne * numberTwo;
                
        
        return result;
    }
    
}

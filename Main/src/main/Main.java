package main;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());//замість System.out.Println пишемо перед main, 
                                                                                //а потім а кожному класі пишемо logger.log(Level.INFO, "result is " + multiplyResult);
    
    public static void main(String[] args) {
        long maxNumber = 0;
        for (int i = 100; i <= 999; i++){
            for (int j = 100; j <=999; j++){
                if (isItPalindromic(i*j) & maxNumber < i*j)
                {
                    maxNumber = i*j;
                }
            }
        }
        
        logger.log(Level.INFO, "Maximum palindrom is " + maxNumber);
    }
    
    public static boolean isItPalindromic(long someMaxNumber){
        char[]numberElements = Long.toString(someMaxNumber).toCharArray();
        
        for( int i = 0; i < numberElements.length / 2; i++)
        {
            if (numberElements[(0)+i]!=numberElements[(numberElements.length-1)-i])
            {
                return false;
            }
        }
        
        return true;
    }    
}

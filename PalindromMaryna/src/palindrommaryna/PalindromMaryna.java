/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrommaryna;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maryna
 */
public class PalindromMaryna {

/*private static final Logger logger = Logger.getLogger(PalindromMaryna.class.getName());//замість System.out.Println пишемо перед main, 
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
*/
private static Logger logger = Logger.getLogger(PalindromMaryna.class.getName());//замість System.out.Println пишемо перед main, 
                                                                                //а потім а кожному класі пишемо logger.log(Level.INFO, "result is " + multiplyResult);
    
    public static void main(String[] args) {
        long maxNumber = 0;
        int x = 0;
        int y = 0;
        for (int i = 100; i <= 999; i++){
            for (int j = 100; j <=999; j++){
                if (isItPalindromic(i*j) & maxNumber < i*j)
                {
                    maxNumber = i*j;
                    x = i;
                    y = j;
                }
            }
        }
        
        logger.log(Level.INFO, "Maximum palindrom is " + maxNumber);
        logger.log(Level.INFO, "x = " + x);
        logger.log(Level.INFO, "y = " + y);

        
        int someNumber = 47830;
        //intToChar(someNumber);
        logger.log(Level.INFO, " " + intToChar(someNumber));//!!!!!!!!!!!!!!
        System.out.print("Result of intToChar method = " + intToChar(someNumber));// !!!!!!!!!!!!!


    }
    
    public static boolean isItPalindromic(long someResultOfMultiplying){ // someResultOfMultiplying - результат множення двох 3-значних чисел
        char[]numberElements = Long.toString(someResultOfMultiplying).toCharArray(); // numberElements - масив цифр з яких складається число someResultOfMultiplying
        for( int i = 0; i < numberElements.length / 2; i++)
        {
            if (numberElements[(0)+i]!=numberElements[(numberElements.length-1)-i])// (numberElements.length-1) - тому що в масиві з 6 елементів, останній має індекс 5
            {
                return false;
            }
        }
        
        return true;
    }    
    
    public static String intToChar(int someNumber){
        char[]arrayChars = Integer.toString(someNumber).toCharArray();
        String res = "";
        for (int i = 0; i <arrayChars.length; i++){
            res += Character.getNumericValue(arrayChars[i]);
        }
        return res;
                
       }
    }
    
    /*public static void intToCharTwo(int someNumber){
        char[]arrayChars = new char[];
        for (int i = 0; i <arrayChars.length; i++){
            System.out.print(arrayChars[i] + ", ");
        }
    }*/
    
    

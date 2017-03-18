/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Maryna
 */
public class MyArraysClass {
    public static int countZero (int[] array){  
        int j = 0;
        for (int i = 0; i < array.length; i++){
        if (array[i] == 0)
        j = j+1;
        }
        return j;
    }
    
    public static int countMinus (int[] array){
        int x=0;
        for (int i = 0; i < array.length; i++){
        if (array[i] < 0)
        x = x+1;
        }
         return x;
    }
    
    public static int[] summArrays (int[] arr1, int[] arr2){
        int i, len;
            if (arr1.length > arr2.length)
                len = arr1.length;
            else
                len = arr2.length;
        int[] sum = new int[len];
        for (i = 0; i < len; ++i){
            if (arr1.length > i && arr2.length > i)
                sum[i] = arr1[i] + arr2[i];
            else if (arr1.length > i)
                sum[i] = arr1[i];
            else
                sum[i] = arr2[i];
        }
        return sum;
    }
    
    public static int[] difarr4fromarr3 (int[] arr3, int[] arr4){
        int i, len;
            if (arr3.length > arr4.length)
                len = arr3.length;
            else
                len = arr4.length;
            int[] dif = new int[len];
            for (i = 0; i < len; i++){
                if (arr3.length > i && arr4.length >i)
                    dif [i] = arr3[i] - arr4[i];
                else
                    if (arr3.length > i)
                        dif [i] = arr3 [i];
                else
                        dif [i] = -arr4 [i];
            }
            return dif;
    }
    
    public static int[] addlengtharrays (int[] arr3, int[] arr4){
        int i, len;
        len = arr3.length + arr4.length;
        int [] result = new int [len];
        return result;
    }
    
    
    public static int[] addarrays (int[] arr3, int[] arr4){
        int i, j, leng, leng3;
        leng3 = arr3.length +1;
        leng = arr3.length + arr4.length;
        int [] result = new int [leng];
        for (i  = 0; i < arr3.length; i++){
        result[i] = arr3[i];
        }
        for (i = leng3; i < arr4.length; i++){
        result [i] = arr4[i];    
        }
        return result;
                
    }
    
    public static int[] joinArrays(int[] first, int[] second) {
    if (first == null) {
        return second;
    }
    if (second == null) {
        return first;
    }
    int[] res = new int[first.length + second.length];
    System.arraycopy(first, 0, res, 0, first.length);
    System.arraycopy(second, 0, res, first.length, second.length);
    return res;
}
       
        
}
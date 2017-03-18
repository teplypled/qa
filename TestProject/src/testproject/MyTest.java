/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author Maryna
 */
public class MyTest {

    /*public static int calculate(int a, int b) { // варіант1

        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException exception) {
        }
        System.err.println("we have exception");

        return res;
    }
    */
     public static int calculate(int a, int b) throws ArithmeticException {// варіант 2

        int res = 0;
        res = a / b;
        System.err.println("we have exception");

        return res;
    }

    public static int getMax(int[] arr) {
        int max = 0;
        try {
            max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        } catch (NullPointerException exception) {
            System.err.println("we have exception"); //Alt+Shift+F - форматування кода для читабельного виду
        }

        return max;
    }
}

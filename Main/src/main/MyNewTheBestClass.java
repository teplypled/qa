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
public class MyNewTheBestClass {
		public static int array (int[] array) { // якщо прибрати static МІЖ PUbLIC TA INT тоді дивись в main 45 46
		int sum = array[0]; // якщо int sum = array[0]; тоді в циклі починаємо з for (int i = 1; Якщо int sum = 0; тоді for (int i = 0;...
		for (int i = 1; i < array.length; ++i){
			sum=array[i]+sum;
		}
		return sum;
	}
		
}
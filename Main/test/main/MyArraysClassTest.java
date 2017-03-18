/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArraysClassTest {
    
    @Test
    public void test1CountZero() {
        int[] array = {5, 4, 0};
        assertEquals(1, MyArraysClass.countZero(array));
        
    }
    
    @Test
    public void test1CountMinus() {
        int[] array = {5, -4, 0, -3, 33, 12};
        assertEquals(2, MyArraysClass.countMinus(array));
    }
        
    @Test
    public void test1SummArrays() {
        int[] arr1 = {5, -6, 12, 4, 0, -1, 4, 7};
        int[] arr2 = {25, -1, 1, 10, 3, 31};
        int[] expected = {30, -7, 13, 14, 3, 30, 4, 7};
        assertArrayEquals(expected, MyArraysClass.summArrays(arr1, arr2));
        
    }    
}

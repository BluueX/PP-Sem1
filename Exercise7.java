/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import java.util.Arrays;
/**
 *
 * @author SAN
 */
public class Exercise7 {


    public static void main(String[] args) {
        
        int[] arr = new int []{5,34,1,4};//array declaration
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");//printing existing array
        }
        
        bubblesort(arr); //using bubblesort method for array "arr"
        
        System.out.println("^^^^^^^^^^^^^^^^");
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " "); //printing array after sort
        }
        
        System.out.println("Bubble sorted elements of array" + Arrays.toString(arr));
        
        
    }   
   
    public static void bubblesort(int[] arr){ 
        
        int sort = 0; //temporary int for saving the number
        
        for(int i=0; i<arr.length; i++){ //loop goes for every element of array
            
            for (int j=1; j<arr.length; j++){ //this loop is sorting elements starts from 1 element
                
                if(arr[j-1] > arr[j]){ //if first element is higher than next
                    
                    System.out.println("arr[j-1] = " + arr[j-1]);
                    
                    System.out.println("arr[j] = " + arr[j]);
                    //if the element is higher than next, they're swapping
                    sort = arr[j-1]; //
                    arr[j-1] = arr[j];
                    arr[j] = sort;
                }
            }
        }
    }
        
}
    

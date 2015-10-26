/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;
import java.util.Scanner;
/**
 *
 * @author Leonid
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = 0;
      System.out.println("Input number of integers to sort");
      n = in.nextInt();
 
      int arr[] = new int[n];
 
      System.out.println("Enter " + n + " integers");
      for (int i = 0; i < n; i++) 
        arr[i] = in.nextInt();

      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {                                       
                  if (arr[i] > arr[i + 1]) {                          
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
      for (int i = 0; i < arr.length; i++)
          System.out.println(arr[i]);
    }
    
}

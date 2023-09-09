package Java8;

import java.util.Scanner;
import java.util.*;

public class Main
{ 
   static int secSmallest(int arr[], int n)
   {
      // assigning first element as smallest temporarily
      int smallest = arr[0];

      // we find the smallest element here
      for (int i=0; i < n; i++){
         if(arr[i] < smallest)
            smallest = arr[i];
      }

     // temporarily assinging largest max value
     int sec_smallest = Integer.MAX_VALUE;
     System.out.println(sec_smallest);

     // finding second smallest here
     for (int i=0; i < n; i++){
         if(arr[i] != smallest && arr[i] < sec_smallest) {
        	 System.out.println(arr[i]+ " true "+i);
        	 sec_smallest  = arr[i];
        	 System.out.println("Second smallest: "+sec_smallest);
        	 System.out.println("================================");
         }
     }

    return sec_smallest;

  }
  public static void main(String args[])
  {

      int arr[] = {23, 45, 32, 22, 20, 96};
      int n = arr.length;
      System.out.print(secSmallest(arr, n));
  }
}
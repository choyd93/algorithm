package Array;

import java.util.Arrays;
import java.util.Scanner;

public class remainder_0352 {
    static int result = 1;

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] arr = new int[10];
   
      for(int i = 0; i < arr.length; i++) {
          arr[i] = scan.nextInt();
      }

      for(int i = 0; i < arr.length; i++) {
          arr[i] = arr[i] % 42;
      }

      for(int i = 0; i < arr.length - 1; i++) {
          for(int j = i+1; j < arr.length; j++) {
              
              if(arr[i] > arr[j]) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
    }
      int compareNum = arr[0];
      
      for(int i = 1; i < arr.length; i++) {
          if(arr[i] == compareNum) {
              compareNum = arr[i];
          } else {
              compareNum = arr[i];
              result++;
          }
      }
      System.out.println(result);
    }
}
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax_10818_01 {

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        
        int max = 0;
        int min = 0;
        int newMax = -1000000;
        int newMin = 1000000;

        int num = scan.nextInt();
        
        while(!(num <= 1000000 && num >= 1)) {
            num = scan.nextInt();
        }
 
        int[] arr = new int[num];
                
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();            
        }         
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    max = arr[i];
                    min = arr[j];
                    newMax = Integer.max(newMax, max);
                    newMin = Integer.min(newMin, min);
                } else {
                    max = arr[j];
                    min = arr[i];
                    newMax = Integer.max(newMax, max);
                    newMin = Integer.min(newMin, min);
                }                
                max = newMax;
                min = newMin;
            }
        }        
        System.out.printf("%d %d", min, max); 
    }
}
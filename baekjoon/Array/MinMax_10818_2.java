package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax_10818_2 {

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        
        int num1 = 0;
        int max = 0;
        int newMax = 0;
        int min = 0;
        int newMin = 100;

        int num = scan.nextInt();
        
        while(!(num <= 1000000 && num >= 1)) {
            num = scan.nextInt();
        }
 
        int[] arr = new int[num];
                
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            
            while(!(arr[i] <= 1000000 && arr[i] >= -1000000)) {
                arr[i] = scan.nextInt();
            }
        } 
        
        System.out.println(Arrays.toString(arr));
        System.out.println("arr.length : " + arr.length);
        
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    max = arr[i];
                    newMax = Integer.max(newMax, max);
                } else {
                    max = arr[j];
                    newMax = Integer.max(newMax, max);
                }
                if(arr[i] < arr[j]) {
                    min = arr[i];
                    newMin = Integer.min(newMin, min);
                } else {
                    min = arr[j];
                    newMin = Integer.min(newMin, min);
                }
                max = newMax;
                min = newMin;

                System.out.printf("i번 : %d, j번 : %d min : %d newMin : %d max : %d newMax : %d\n",i, j, min, newMin, max, newMax);

            }
        }
        
        System.out.printf("%d %d", min, max);
        
    }

}

package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfNumbers_2777_03 {

    static int circle;
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num4;
        
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();       

        num4 = num1 * num2 * num3;
        
        String s_num = String.valueOf(num4);

        int[] arr = new int[s_num.length()];

        for(int i = 0; i < s_num.length(); i++) {
            arr[i] = s_num.charAt(i) - 48;
        }
        
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j <= arr.length - 1; j++) {
            if (arr2[i] == arr[j]){
                circle++;
                } 
            }
            arr2[i] = circle;
            circle = 0;
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
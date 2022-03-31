package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    static int cicle;
    static int maxNum = 0;
    static int maxI = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[9];
        
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = scan.nextInt();
        }
                
        for(int i = 0; i < arr.length; i++) {
                if(maxNum < arr[i]) {
                    maxNum = arr[i];
                    maxI = i+1;
                } 
            }
            System.out.println(maxNum + "\n" + maxI);
        }        
    }

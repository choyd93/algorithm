package whileStatement;

import java.util.Scanner;

public class APlusB_10951 {
    static int num1;
    static int num2;
    static int num3;

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       while(true) {
       num1 = scan.nextInt();
       num2 = scan.nextInt();
       
       if(num1 == 0 && num2 == 0) {
           break;
       }
       
       while(!(num1 > 0 && num2 < 10)) {
           num1 = scan.nextInt();
           num2 = scan.nextInt();
           int num3 = num1 + num2;
       }
       
       int num3 = num1 + num2;

       System.out.println(num3);
       
       }
    }
}

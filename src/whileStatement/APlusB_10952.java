package whileStatement;

import java.util.Scanner;

public class APlusB_10952 {
    static int num1;
    static int num2;
    static int num3;
    static int cicle;

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       while(scan.hasNextInt()) {
       num1 = scan.nextInt();
       num2 = scan.nextInt();
       
       while(!(num1 > 0 && num2 < 10)) {
           num1 = scan.nextInt();
           num2 = scan.nextInt();
           int num3 = num1 + num2;
       }
       
       int num3 = num1 + num2;

       System.out.println(num3);
       cicle++;
       
       }
    }
}

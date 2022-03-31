package whileStatement;

import java.util.Scanner;

public class plusCycle3 {
    static int cicle;
    static int firstNum;
    static int newten;
    static int newone;
    static String renewNum;

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        while(!(num >= 0 && num <= 99)) {
            num = scanner.nextInt();
        }
        firstNum = num;
        while(true) {
        int ten = num/10;
        int one = num%10;
        
        int newNum = ten + one;
        String newOne = String.valueOf(one);   
        
        if(newNum >= 0 & newNum < 10) { 
            renewNum = String.valueOf(newNum);
        } else {
            newten = newNum/10;
            newone = newNum%10;
            renewNum = String.valueOf(newone);
        }
        String cicleNum = newOne + renewNum;

        cicle++;

        int cicleNewNum = Integer.parseInt(cicleNum);
                
        num = cicleNewNum;
        if(cicleNewNum == firstNum) {
            break;
        }
        }       
            System.out.println(cicle);          
    }
}

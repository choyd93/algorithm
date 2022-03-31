package whileStatement;

import java.util.Scanner;

public class plusCycle2 {
    
    static int cicle;
    
    public static void main(String[] args) {
        
        int firstNumber = 0;
       
        Scanner scan = new Scanner(System.in);
        int i_num = scan.nextInt();
        
        while(!(i_num >= 0 && i_num <= 99)) {
            i_num = scan.nextInt();
        }

        firstNumber = i_num;
                
        while(true) {
        String s_num;
        int Num1;
        int Num2;
        s_num = String.valueOf(i_num);
        
        if(i_num < 10 && i_num >= 0) {
            Num1 = 0;
            Num2 = s_num.charAt(0) - 48;
        } else {
            Num1 = s_num.charAt(0) - 48; 
            Num2 = s_num.charAt(1) - 48; 
        }

        int Num3 = Num1 + Num2;

        String new_s_num1 = String.valueOf(Num2);        
        cicle++;

        if(Num3 < 10 && Num3 >= 0) {
            s_num = String.valueOf(Num3);
            int Num4 = s_num.charAt(0) - 48;

            String new_s_num2 = String.valueOf(Num4);
            String new_s_num3 = new_s_num1 + new_s_num2;
                       
            i_num = Integer.parseInt(new_s_num3);
            
            if(i_num == firstNumber) {
                break;
            } else {
            }
            
        } else {
            s_num = String.valueOf(Num3);
            int Num4 = s_num.charAt(0) - 48;
            int Num5 = s_num.charAt(1) - 48;

            String new_s_num2 = String.valueOf(Num5);
            String new_s_num3 = new_s_num1 + new_s_num2;
            
            i_num = Integer.parseInt(new_s_num3);
            
            if(i_num == firstNumber) {
                break;
            } else {
            }
        }

    }
        System.out.println(cicle);
        
        
    }

}

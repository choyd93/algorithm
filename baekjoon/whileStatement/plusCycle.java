package whileStatement;

import java.util.Scanner;

public class plusCycle {
    
    // 사이클 선언
    static int cicle;
    
    public static void main(String[] args) {
        
        // 처음값 선언
        int firstNumber = 0;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("0~99 사이의 정수를 입력해주세요.");
        int i_num = scan.nextInt();
        
        while(!(i_num >= 0 && i_num <= 99)) {
            System.out.println("0~99 사이의 정수를 입력해주세요.");
            i_num = scan.nextInt();
        }
        
        System.out.println("---");
        
        
        firstNumber = i_num;
        
        
        while(true) {
            System.out.println("====== 시작 =======");
        // 숫자를 String 타입으로 변환
        String s_num;
        int Num1;
        int Num2;
        s_num = String.valueOf(i_num);
        
        System.out.println(s_num);

        // 1의자리수만 나오면 char타입으로 변환하여 0번째 숫자만 
        if(i_num < 10 && i_num >= 0) {
            Num1 = 0;
            Num2 = s_num.charAt(0) - 48;
        } else {
         // char타입으로 변환하여 1-2자리 숫자로 나누기
            Num1 = s_num.charAt(0) - 48; //아스키코드로 int에 저장됨. (-48 하면 정상값)
            Num2 = s_num.charAt(1) - 48; 
            System.out.println("====== 자리수 확인 ========");
            System.out.println("첫째자리(s_num.charAt(0)) : " + s_num.charAt(0));
            System.out.println("둘째자리(s_num.charAt(1)) : " + s_num.charAt(1));
            
        }
        
        
        System.out.println("첫째자리(Num1) : " + Num1);
        System.out.println("둘째자리(Num2) : " + Num2);
        System.out.println("====== 자리수 확인 끝 ========");

       
        int Num3 = Num1 + Num2;
        
        // 첫째 - Num2 값 String 형변환 
        
        String new_s_num1 = String.valueOf(Num2);
        System.out.println("Num2 값 String 형변환(new_s_num1) : " + new_s_num1);
        
        System.out.println("새로운 수 ::: Num1 + Num2 = Num3 : " + Num3);
        cicle++;
        
        // Num3 String 형변환
//        String s_num1;
//        s_num1 = String.valueOf(Num3);
        
        if(Num3 < 10 && Num3 >= 0) {
            s_num = String.valueOf(Num3);
            System.out.println("Num3 String 형변환 -> s_num: " + s_num);
            int Num4 = s_num.charAt(0) - 48;
            System.out.println("1의 자리일 경우");
            System.out.println("int Num4 : " + Num4);
            
            // 둘째 - Num4 String 형변환 (다른 값)
            String new_s_num2 = String.valueOf(Num4);
            String new_s_num3 = new_s_num1 + new_s_num2;
            
            System.out.println("Num4 - String 형변환 (new_s_num3) : " + new_s_num3);
            
            // int 타입 i_num으로 형변환해서 값 넘기기
            i_num = Integer.parseInt(new_s_num3);
            
            if(i_num == firstNumber) {
                System.out.println("사이클 : " + cicle);
                break;
            } else {
                System.out.println("원래 수로 돌아가지 못했습니다.");
            }
            
        } else {
            s_num = String.valueOf(Num3);
            System.out.println("Num3 String 형변환 -> s_num: " + s_num);
            int Num4 = s_num.charAt(0) - 48;
            int Num5 = s_num.charAt(1) - 48;
            System.out.println("10의 자리일 경우");
            System.out.println("int Num4 : " + Num4);
            System.out.println("int Num5 : " + Num5);
            
            System.out.println("Num5 : " + Num5);
            
            // 둘째 - Num4 String 형변환 (다른 값)
            String new_s_num2 = String.valueOf(Num5);
            String new_s_num3 = new_s_num1 + new_s_num2;
            
            System.out.println("Num4 - String 형변환 (new_s_num3) : " + new_s_num3);
            // int 타입 i_num으로 형변환해서 값 넘기기
            i_num = Integer.parseInt(new_s_num3);
            
            if(i_num == firstNumber) {
                System.out.println("사이클 : " + cicle);
                break;
            } else {
                System.out.println("원래 수로 돌아가지 못했습니다.");
            }
        }
        System.out.println("사이클 : " + cicle);

        System.out.println("====== 끝 =======");
    }
        System.out.println("최종 사이클 : " + cicle);
        
        
    }

}

// <-- 마지막으로 같은 값이면 break 후 cicle 출력 하는 코드 입력 필요 
        

// 입력받은 수 = ab
        
        // 루프
        // 입력받은 숫자를 두자리로 나누기 "a","b"
        
        // String 두자리 더하기 = "a" + "b" = c
        
        // String 두자리 중 뒷자리 수와 더해서 나온 값을 더하기 = "b" + "c" = de
        
        // 루프
        // 숫자를 두자리로 나누기 "c" + "e" = f ...
        
        // 형변환

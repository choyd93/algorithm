package inputAndOutput;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("문자열입력: ");
        String str1 = scanner.nextLine();
        System.out.println(str1);
        
        System.out.println("문자열입력: ");
        String str2 = scanner.next();
        System.out.println(str2);
    }
}
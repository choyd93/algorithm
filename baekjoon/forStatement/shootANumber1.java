package forStatement;
import java.util.Scanner;

public class shootANumber1 { 

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		int a;
		a = my.nextInt(); //a 입력값을 받음.
		
		for(int i = 1; i <= a; i++) //i가 a만큼 증가
		System.out.println(i);  //i출력, a값 입력
	}
}
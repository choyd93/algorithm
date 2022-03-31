package forStatement;
import java.util.Scanner;

public class shootANumberInverse {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		int a;
		a = my.nextInt();
		
		for(int i = a; i > 0; i--)
		System.out.println(i);
	}
}
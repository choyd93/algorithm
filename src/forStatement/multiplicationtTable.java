package forStatement;
import java.util.Scanner;

public class multiplicationtTable {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		int a;
		a = my.nextInt();
		
		for (int i = 1; i <= 9; i++)
		System.out.println(a + "*" + i + "=" + (a * i));
	}
}
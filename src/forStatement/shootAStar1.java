package forStatement;
import java.util.Scanner;
public class shootAStar1 {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		int j;
		int a = my.nextInt();
		my.close();
		
		for(int i = 1; i<=a; i++) {
			for(j = 1; j<=a;) {
				System.out.print("*");
			break; } 
			System.out.println();
		}
	}
}

package forStatement;
import java.util.Scanner;
public class shootAStar2 {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		int a = my.nextInt();
		my.close();
		
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=a; j++) {
				System.out.format("%6d", "*");
				if (j>=i)
					break; } 
			System.out.println();
		}
	}
}
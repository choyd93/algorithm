package inputAndOutput;

import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    int a,b;
    a = sc.nextInt();
    b = sc.nextInt();
    
    System.out.println(a + b);
}
}
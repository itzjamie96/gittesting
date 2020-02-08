package if문;

import java.util.Scanner;

public class Main1330_숫자비교 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if (A==B) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}

	}

}

package �����;

import java.util.Scanner;

public class Main10430_������ {
	
	public static void main(String[] args) {
		int A,B,C;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		System.out.println( (A+B)%C);
		System.out.println( (A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println( (A%C * B%C)%C);
	}

}

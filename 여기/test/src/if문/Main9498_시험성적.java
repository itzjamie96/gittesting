package if��;

import java.util.Scanner;

public class Main9498_���輺�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int grade = scan.nextInt();
		
		if(90 <= grade) {
			System.out.println("A");
		} else if (80 <= grade) {
			System.out.println("B");
		} else if (70 <= grade) {
			System.out.println("C");
		} else if (60 <= grade) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}

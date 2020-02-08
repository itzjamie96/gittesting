package if문;

import java.util.Scanner;

public class Main2753_윤년 {

	public static void main(String[] args) {
		//윤년 = 연도가 4의배수 && 100의배수 아님 || 400의배수

		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if (year%4 == 0 && year%100 !=0 || year%400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}

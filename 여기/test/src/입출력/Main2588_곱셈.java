package �����;

import java.util.Scanner;

public class Main2588_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�Է¹��� ����
		int A,B;
	
		A = scan.nextInt();		
		B = scan.nextInt();
		
		//B�� ���ڸ�
		int one, tenth, hund;
		
		one = B/100 * A;	
		tenth = B%100/10 * A;	
		hund = B%10 * A;		
		
		System.out.println(hund);
		System.out.println(tenth);
		System.out.println(one);
		System.out.println(hund + tenth*10 + one *100);

	}

}

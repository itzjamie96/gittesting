package if��;

import java.util.Scanner;

public class Main2884_�˶��ð� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if (M >= 45) {
			System.out.println(H+ " " + (M-45));
		} else {
			if (H==0) {
				H = 24;
			}
			System.out.println(H -1 + " " + (M+15));
		}
		
	}

}

package ���Ʈ����;

import java.util.Scanner;

public class Main2231_������ {
	/*
	 * � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. 
	 * � �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. 
	 * ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. 
	 * ���� 245�� 256�� �����ڰ� �ȴ�. ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. 
	 * �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
	 * �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		
		//�ڸ��� ���ϱ�
		int log = (int)(Math.log10(N)+1);
		
		
		//���ۼ� ���ϱ�
		int start = N - log*9;
		System.out.println(start);
		
		//���ۼ�~N���� ������ ���ϱ�
		int num = 0;	//������
		
		for (int i=start; i<N; i++) {
			
			int n = sum(i);
			if(i+n == N) {
				num = i;
				break;
			}
			
		
		}
		System.out.println(num);
		

	}
	
	public static int sum(int N) {
		int sum = 0;
		while (N>0) {
			sum += N%10;
		}
		return sum;
	}

}

package ���Ʈ����;

import java.util.Scanner;

public class Main7568_��ġ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// N = ��ü ����� �� 
		int N = sc.nextInt();
		
		// 2���� �迭 �ʿ� -> size�� 5 rows 2 columns
		int[][] size = new int[N][2];
		
		// �� x,y �� 2���� �迭�� �ֱ�
		for (int i=0; i<N; i++) {
			size[i][0] = sc.nextInt();
			size[i][1] = sc.nextInt();
		}
		
		// �� �ε��� �ڸ����� 0���� ��� �ε����� �񱳸� �ؾ��ϱ� ������ ���� for��
		for (int i=0; i<size.length; i++) {
			
			//��� �ʱ�ȭ
			int rank = 0;
			
			for (int j=0; j<size.length; j++) {
				//i�� j�� ���� ������ �ڽ��̱� ������ ���� �ʿ䰡 ����
				if (i == j) {
					//������~
					continue;
				}
				//x,y�� ��� Ŀ�� rank++�ϱ�
				if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					rank ++;
				}
			}
			//����� ������ ū ���+1�̷���
			System.out.println(rank+1);
		}
	}
}

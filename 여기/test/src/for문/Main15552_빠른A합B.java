package for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15552_����A��B {

	public static void main(String[] args) throws Exception {
		
		/* �׽�Ʈ ���̽��� Ŀ������ Scanner�� �Է¹޴� �� �Ѱ谡 ����
		 * 
		 * Buffer: �����͸� �� ������ �ٸ� �Ѱ����� �����ϴ� ���� �Ͻ������� �� �����͸� �����ϴ� �ӽ� �޸� ����
		 * 	-> ����� �ӵ� ����� ���� ��� 
		 * 	-> Ű������ �Է��� ���� ������ �� ���ھ� ���۷� ���� -> ���۰� ���� ���� �ѹ��� ������
		 * 	-> �׳� �Է¹޴� ��� �����ϴ� �ͺ��� �ξ� ȿ�����̰� ����
		 * 
		 * BufferedReader : readLine()�� ����� �����͸� ���� ������ ���� (=String Ÿ��)
		 * 	-> ������ ���ڿ��̱� ������ ���ڷ� �ٲٷ��� Integer.parseInt() �ʼ�
		 * 
		 * Buffer Flush : ���ۿ� ���� �����͵��� ��� ��� (= ���� ����)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			
			String[] num = br.readLine().split(" ");

			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			bw.write(A+B + "\n");
		}
		bw.flush();
	}
}

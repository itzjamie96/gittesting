package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main15552_빠른A합B {

	public static void main(String[] args) throws Exception {
		
		/* 테스트 케이스가 커질수록 Scanner로 입력받는 데 한계가 있음
		 * 
		 * Buffer: 데이터를 한 곳에서 다른 한곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
		 * 	-> 입출력 속도 향상을 위해 사용 
		 * 	-> 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송 -> 버퍼가 가득 차면 한번에 전송함
		 * 	-> 그냥 입력받는 대로 전송하는 것보다 훨씬 효율적이고 빠름
		 * 
		 * BufferedReader : readLine()을 사용해 데이터를 라인 단위로 읽음 (=String 타입)
		 * 	-> 무조건 문자열이기 때문에 숫자로 바꾸려면 Integer.parseInt() 필수
		 * 
		 * Buffer Flush : 버퍼에 남은 데이터들을 모두 출력 (= 버퍼 비우기)
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

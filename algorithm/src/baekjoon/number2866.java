package baekjoon;
/*
 * baekjoon
 * 문자열 잘라내기
 * 하는중
 */
import java.util.*;

import javax.net.ssl.SSLContext;

public class number2866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // 행
		int n2 = sc.nextInt(); // 열
		StringBuilder st=new StringBuilder();
		
		char[][] str = new char[n1][n2];

		for (int i = 0; i < n1; i++) {
			String s = sc.next();
			for (int j = 0; j < n2; j++) {
				str[i][j] = s.charAt(j);

			}
		}


		for(int i=0; i<n2; i++) {
			for(int j=0; j<n1; j++) {
				st.append(j);
				
			}
		}
	}

}

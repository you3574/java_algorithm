package swea;
//"기러기" 또는 "level" 과 같이 거꾸로 읽어도 앞에서부터 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.
//
//주어진 8x8 평면 글자판에서 가로, 세로를 모두 보아 제시된 길이를 가진 회문의 총 개수를 구하는 문제이다.
import java.util.*;
public class number1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		char [][] arr=new char[8][8];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int line=sc.nextInt();
			Stack<Character> st=new Stack<>();
			for(int i=0; i<8; i++) {
				String s=sc.next();
				for(int j=0; j<8; j++) {
					arr[i][j]=s.charAt(j);
				}
			}
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					//1번째랑 n번째 요소가 같을 때
					if()
					
					
					int loop=1;
					while(loop<4) {
						if(!st.isEmpty() && st.peek()==arr[i][j])
							st.pop();
						else
							st.push(arr[i][j]);
					}
				}
				
			}
			
		}
	}

}

package swea;
//"�ⷯ��" �Ǵ� "level" �� ���� �Ųٷ� �о �տ������� ���� �Ͱ� ���� �����̳� ������ ȸ��(����, palindrome)�̶� �Ѵ�.
//
//�־��� 8x8 ��� �����ǿ��� ����, ���θ� ��� ���� ���õ� ���̸� ���� ȸ���� �� ������ ���ϴ� �����̴�.
import java.util.*;
public class number1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
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
					//1��°�� n��° ��Ұ� ���� ��
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

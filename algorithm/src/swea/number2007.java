package swea;

//패턴에서 반복되는 부분을 마디라고 부른다. 문자열을 입력 받아 마디의 길이를 출력하는 프로그램을 작성하라.
import java.util.*;

public class number2007 {

	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int num=2;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s=sc.next();
			int result=0;
			
			for(int i=2; i<s.length(); i++) {
				String copy=s;
				
				String s1=s.substring(0,i);
				String s2=s.substring(i,i+i);
				
				if(s1.equals(s2)) {
					result=s1.length();
					break;
				}
			}
			
			System.out.println("#" + test_case + " "+ result);
		}
}

}

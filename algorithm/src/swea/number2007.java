package swea;

//���Ͽ��� �ݺ��Ǵ� �κ��� ������ �θ���. ���ڿ��� �Է� �޾� ������ ���̸� ����ϴ� ���α׷��� �ۼ��϶�.
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

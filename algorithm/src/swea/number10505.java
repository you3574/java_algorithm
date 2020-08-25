package swea;
import java.util.*;
public class number10505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		System.out.print("테스트:");
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int answer=0;
			System.out.print("케이스:");
			int n=sc.nextInt();
			int sum=0;
			int [] num=new int[n];
			for(int i=0; i<n; i++) {
				num[i]=sc.nextInt(); //숫자넣기
				sum+=num[i]; //다 더하기
			}
			
			int result=sum/n; //평균
			
			for(int i=0; i<n; i++) {
				if(num[i]<result || num[i]==result) {
					answer++;
				}
			}
			System.out.println("#"+test_case+" "+answer);
			
		}
	}

}

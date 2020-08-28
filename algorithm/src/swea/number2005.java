package swea;
import java.util.*;
public class number2005 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
			int [][] pascal =new int[num][num];

			System.out.println("#" + test_case);

			for(int i=0; i<num; i++) {
				for(int j=0; j<=i; j++) {
					if(i==j || j==0) {
						pascal[i][j]=1;
					}else
						pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
					System.out.print(pascal[i][j]+"");
				}
				System.out.println();
			}
		}
	}


}

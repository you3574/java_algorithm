package swea;
import java.util.Scanner;
import java.io.FileInputStream;

class number2072
{
    public static void main(String args[]) throws Exception
    {
      
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num=0;
            for(int i=0; i<10; i++){
                int n=sc.nextInt();
                if(n%2==1)
                    num+=n;
            }
            System.out.println("#"+test_case+" "+num);
        }
    }
}
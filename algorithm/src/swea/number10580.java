package swea;
//����� ���� ���ٰ� �������� �����ϰ� ���� �ִ� ������ �� ���� ���Ҵ�.
//�� ������� ���̰� �ſ� ������, N���� ������ �������� ����Ǿ� �־���.
//�� ������ ������ ���� ���� ������, �����ϴ� ���� �ִ�.
//�̸� �׸����� �ϸ� �Ʒ��� ����. (���� 3���� ������, ������ 2���� ���������� ĥ������.)
//�� �� �̻��� ������ �ϳ��� ������ ������ �ʴ´ٰ� ��������. �� �����뿡�� �� �� ���� �������� ������?
import java.util.*;

public class number10580 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        int T;
//        System.out.print("�׽�Ʈ���� :");
        T=sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
        	int answer=0;
//        	System.out.print("���� ���?:");
        	int loop=sc.nextInt();
        	int [][] num=new int[loop][2];
        	
        	for(int a=0; a<loop; a++) {
        		for(int b=0; b<2; b++) {
        			num[a][b]=sc.nextInt();
        			//num[i][0]�� ����, num[i][1]�� ������
        		}
        	}
        	
        	Arrays.sort(num,new Comparator<int[]>() { //A�� �������� �������� ����
    			@Override
    			public int compare(int[] a, int[] b) {
    				if(a[0]<b[0]) return -1;
    				else if(a[0]>b[0]) return 1;
    				return 0;
    			}
    			
    		});
        	
      	
        	for(int a=0; a<num.length-1; a++) {
        		//�� ó������ ���µ� �ǵڱ��� ������ ������ �մ�?
        		for(int b=a+1; b<num.length; b++) {
        			if(num[a][1]>num[b][1]) {
        				answer++;
        			}
        		}
        	}
        	System.out.println("#"+test_case+" "+answer);
        }
	}

}

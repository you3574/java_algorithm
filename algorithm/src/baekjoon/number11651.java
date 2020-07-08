package baekjoon;
import java.util.*;

public class number11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] num=new int [n][2];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<2; j++) {
				num[i][j]=sc.nextInt();
			}
		}
		
        Arrays.sort(num, new Comparator<int[]>() {
            // Override�� compare �Լ��� ��� �����ϳĿ� ���� �پ��� ������ ���������ϴ�
            @Override
            public int compare(int[] o1, int[] o2) {
            	if(o1[1]==o2[1]) {
            		return o1[0]-o2[0];
            	}
                return o1[1] - o2[1];
             
            }
        });
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i][0] + " " + num[i][1]);
        }
        System.out.println();
	}

}

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
            // Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능해집니다
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

package swea;
//현우는 길을 가다가 전선들이 복잡하게 꼬여 있는 전봇대 두 개를 보았다.
//두 전봇대는 높이가 매우 높으며, N개의 팽팽한 전선으로 연결되어 있었다.
//두 전선이 끝점이 같은 경우는 없으나, 교차하는 경우는 있다.
//이를 그림으로 하면 아래와 같다. (전선 3개가 있으며, 교차점 2개가 검은색으로 칠해졌다.)
//세 개 이상의 전선이 하나의 점에서 만나지 않는다고 가정하자. 이 전봇대에는 총 몇 개의 교차점이 있을까?
import java.util.*;

public class number10580 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        int T;
//        System.out.print("테스트개수 :");
        T=sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
        	int answer=0;
//        	System.out.print("루프 몇번?:");
        	int loop=sc.nextInt();
        	int [][] num=new int[loop][2];
        	
        	for(int a=0; a<loop; a++) {
        		for(int b=0; b<2; b++) {
        			num[a][b]=sc.nextInt();
        			//num[i][0]은 왼쪽, num[i][1]은 오른쪽
        		}
        	}
        	
        	Arrays.sort(num,new Comparator<int[]>() { //A를 기준으로 오름차순 정렬
    			@Override
    			public int compare(int[] a, int[] b) {
    				if(a[0]<b[0]) return -1;
    				else if(a[0]>b[0]) return 1;
    				return 0;
    			}
    			
    		});
        	
      	
        	for(int a=0; a<num.length-1; a++) {
        		//맨 처음부터 도는데 맨뒤까지 나보다 작은게 잇니?
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

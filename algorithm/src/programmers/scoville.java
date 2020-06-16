/*
 * programmers
 * ´õ ¸Ê°Ô
 */
package programmers;
import java.util.*;
public class scoville {

	public static int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> qu=new PriorityQueue<>();
        
        for(int i:scoville) {
        	qu.add(i);
        }
        
        while(true) {
        	if(qu.size()==1) {
        		return -1;
        	}
        	if(qu.peek()>=K) {
        		break;
        	}
        	qu.add(qu.poll()+qu.poll()*2);
        		answer++;
        }
     
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] scoville= {1,2,3,9,10};
		int [] scoville2= {3,1,5,7,2};

		System.out.println(solution(scoville,10));
	}

}

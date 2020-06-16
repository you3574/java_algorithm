/*
 * programmers
 * 라면공장
 */
package programmers;
import java.util.*;

public class lamen {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		int index=0;
		Queue<Integer> sup=new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for(int i=0; i<k; i++){
			if(index<dates.length && i==dates[index]) {
				sup.add(supplies[index]);
				index++;
			}
			if(stock==0) {
				stock+=sup.poll();
				answer++;
			}
			stock--;
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] dates= {4,10,15};
		int [] supplies= {20,5,10};
		System.out.println(solution(4,dates,supplies,30));
	}

}

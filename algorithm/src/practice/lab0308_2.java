package practice;

import java.util.*;

public class lab0308_2 {

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;
		int result = lost.length;

		ArrayList<Integer> reserve_num = new ArrayList<>();
		//ArrayList<Integer> lost_num= new ArrayList<>();
		Queue<Integer> lost_num=new LinkedList<>();
		
		for (int i = 0; i < reserve.length; i++) {
			reserve_num.add(reserve[i]);
		}
		for( int i=0; i<lost.length; i++) {
			lost_num.add(lost[i]);
		}

		
		//for (int i = 0; i < lost_num.size(); i++) {
		while(!lost_num.isEmpty()) {
		//	if(reserve)
		if(reserve_num.contains(lost_num.peek()-1)) {
				result--;
				lost_num.poll();
			}else if(reserve_num.contains(lost_num.peek()+1)) {
				result--;
				lost_num.poll();
			}else {
				lost_num.poll();
			}
		}

		answer = n-result;
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3 };

		System.out.println(solution(n, lost, reserve));
	}

}

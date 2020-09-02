package ebay2020;

import java.util.*;

public class number2 {

	public static int solution(int num, int[] cards) {
		int answer = 0;
		int turn = 0;

		// 횟수 넣는 list
		ArrayList<Integer> list = new ArrayList<>();

		while (turn<cards.length) {
			int copyNum = num; //8
			int count = 0;

			// 배열값 차례대로 나눠보기
			for (int i = turn; 0 <=i; i--) {

				// num값을 cards[i]로 나눴을 때
				// 나머지 값이 일때
				//1,4,6
				if (copyNum % cards[i] == 0) {
					int result = copyNum / cards[i]; //2
					count += result; //3
					list.add(count); //2 ,8 3
					break;
				}
				// 나머지 값이 0이 아닐 때
				else {
					//copyNum에 나머지 값을 넣고 그 값을 기준으로 또 나눠야함.
					int result=copyNum/cards[i]; //1
					count+=result; //1
					copyNum = copyNum % cards[i]; //2
				}
				
			}
			turn++;
		}

		Collections.sort(list);
		answer=list.get(0);
		
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = { 1, 4, 6 };
		int[] cards2= {1,2,5};
		System.out.println(solution(8, cards));
		//System.out.println(solution(18,cards2));
	}

}

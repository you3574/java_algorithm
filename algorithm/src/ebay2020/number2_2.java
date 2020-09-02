package ebay2020;

import java.util.*;

public class number2_2 {

	public static int solution(int num, int[] cards) {
		int answer = 0;
		int turn = 0;

		// È½¼ö ³Ö´Â list
		ArrayList<Integer> list = new ArrayList<>();

		while (turn<cards.length) {
			int copyNum = num;
			int count = 0;

			// ¹è¿­°ª Â÷·Ê´ë·Î ³ª´²º¸±â
			for (int i = turn; 0 <=i; i--) {

				if(copyNum==0)
					break;
				
				count+=copyNum/cards[i];
				copyNum=copyNum%cards[i];
				
				if(copyNum==0) {
					list.add(count); 
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
		System.out.println(solution(18,cards2));
	}

}

package naverAITest;

import java.util.*;

public class naver {

	public static String solution(int n, int[][] delivery) {

		HashMap<Integer, Character> s = new HashMap<Integer, Character>();
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			s.put(i, '?'); // ?값으로 초기화
		}

		for (int i = 0; i < delivery.length; i++) {
			System.out.println("i값 " + i);
			if (delivery[i][2] == 1) { // 배송성공
				s.put(delivery[i][0], 'O');
				s.put(delivery[i][1], 'O');
			
			} else if (delivery[i][2] == 0) { // 배송실패
				if (s.get(delivery[i][0]) == 'O') { // 만약 첫번째 값이 o
					// 두번째 값은 무조건 x
					s.put(delivery[i][1], 'X');
				} else if (s.get(delivery[i][1]) == 'O') {
					s.put(delivery[i][0], 'X');
					
				}
			}
			
			
		}
		for (int i = 0; i < delivery.length; i++) {
			System.out.println("i값 " + i);
			if (delivery[i][2] == 1) { // 배송성공
				s.put(delivery[i][0], 'O');
				s.put(delivery[i][1], 'O');
			
			} else if (delivery[i][2] == 0) { // 배송실패
				if (s.get(delivery[i][0]) == 'O') { // 만약 첫번째 값이 o
					// 두번째 값은 무조건 x
					s.put(delivery[i][1], 'X');
				} else if (s.get(delivery[i][1]) == 'O') {
					s.put(delivery[i][0], 'X');
					
				}
			}
			
			
		}

		for (Integer key : s.keySet()) {
			char v = s.get(key);
			result.append(v);
		}

		String answer = "";
		answer = result.toString();
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] delivery = { { 1, 3, 1 }, { 3, 5, 0 }, { 5, 4, 0 }, { 2, 5, 0 } };
		int[][] delivery2 = { { 5, 6, 0 }, { 1, 3, 1 }, { 1, 5, 0 }, { 7, 6, 0 }, { 3, 7, 1 }, { 2, 5, 0 } };
		//System.out.println(solution(6, delivery));
		System.out.println(solution(7, delivery2));
		// System.out.println(solution(7, delivery2));
	}

}

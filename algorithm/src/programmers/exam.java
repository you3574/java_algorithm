/*
 * programmers
 * 모의고사
 */
package programmers;
import java.util.*;

public class exam {
	public static int[] solution(int[] answers) { // 1,3,2,4,2

		Queue<Integer> qu = new PriorityQueue<Integer>();

		int r1 = 0;
		int r2 = 0;
		int r3 = 0;

		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] num3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 0~4까지
		for (int i = 0; i < answers.length; i++) {
			if (num1[i % num1.length] == answers[i])
				r1++;
			if (num2[i % num2.length] == answers[i])
				r2++;
			if (num3[i % num3.length] == answers[i])
				r3++;
		}

		if (r1 > r2) {
			qu.add(1);
			if (r3 > r1) {
				qu.poll();
				qu.add(3);
			} else if (r3 == r1) {
				qu.add(3);
			}
		}

		if (r2 > r1) {
			qu.add(2);
			if (r3 > r2) {
				qu.poll();
				qu.add(3);
			} else if (r2 == r3) {
				qu.add(3);
			}
		}

		if (r1 == r2) {
			qu.add(1);
			qu.add(2);
			if (r3 > r1) {
				qu.clear();
				qu.add(3);
			} else if (r3 == r1) {
				qu.add(3);
			}
		}


		int[] answer = new int[qu.size()];
		int i=0;
		
		while(!qu.isEmpty()) {
			answer[i]=qu.poll();
			i++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = { 1, 2, 3, 4, 5 };
		int[] answers2 = { 1, 3, 2, 4, 2 };

		// System.out.println(solution(answers));
		System.out.println(solution(answers2));
	}

}

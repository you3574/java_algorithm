/*
 * programmers
 * problems/기능개발
 */
package programmers;
import java.util.*;

public class functionDevelopment {

	public static int[] solution(int[] progresses, int[] speeds) {

		// progresses와 speeds더함
		// index 점점 늘려가
		// qu에 result값 넣어
		int index = 0;
		int result = 0;
		Queue<Integer> qu = new LinkedList<>();

		// System.out.println(progresses.length);
		while (index < progresses.length) {
			for (int i = 0; i < progresses.length; i++) {
				progresses[i] += speeds[i];
			}
		
			if (progresses[index] >= 100) {
				//뒤에 있는것도 100이 넘는지 화인
				while (index < progresses.length && progresses[index] >= 100) {
					result++;
					index++;
				}
				qu.add(result);
				result=0;
			}
		}

		int[] answer = new int[qu.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = qu.poll();
			System.out.println(answer[i]);

		}
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		System.out.println(solution(progresses, speeds));
	}

}

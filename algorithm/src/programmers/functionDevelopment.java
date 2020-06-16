/*
 * programmers
 * problems/��ɰ���
 */
package programmers;
import java.util.*;

public class functionDevelopment {

	public static int[] solution(int[] progresses, int[] speeds) {

		// progresses�� speeds����
		// index ���� �÷���
		// qu�� result�� �־�
		int index = 0;
		int result = 0;
		Queue<Integer> qu = new LinkedList<>();

		// System.out.println(progresses.length);
		while (index < progresses.length) {
			for (int i = 0; i < progresses.length; i++) {
				progresses[i] += speeds[i];
			}
		
			if (progresses[index] >= 100) {
				//�ڿ� �ִ°͵� 100�� �Ѵ��� ȭ��
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

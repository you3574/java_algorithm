package baekjoon;

import java.util.*;

public class number1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int start = 0;
		Queue<Integer> qu = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			qu.add(i + 1);
		}

		while (!qu.isEmpty()) {
			if (qu.size() < k) {
				result.add(qu.poll());
			}
			for (int i = 0; i < k - 1; i++) {
				int num = qu.poll();
				qu.add(num);
			}

			result.add(qu.poll());
		}

		System.out.println(result);
	}

}

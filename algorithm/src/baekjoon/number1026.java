package baekjoon;

import java.util.*;

public class number1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // nÀÇ ¼ö
		int sum = 0;
		int result = 0;
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			result = a[i] * b[i];
			sum += result;
		}
		System.out.println(sum);
	}

}

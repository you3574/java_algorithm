package baekjoon;

import java.util.*;

public class number1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		StringBuilder st = new StringBuilder();
		
		Integer[] result = new Integer[num.length()];
		for (int i = 0; i < num.length(); i++) {
			result[i] = (num.charAt(i) - '0');
		}

		Arrays.sort(result, Collections.reverseOrder());

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}

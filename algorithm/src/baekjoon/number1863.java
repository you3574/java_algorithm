package baekjoon;

import java.util.*;

public class number1863 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ��� ����
		int[] arr = new int[n+1]; //������ ������ ó��
		Stack<Integer> st = new Stack<>();
		int answer=0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[i] = y;	
		}
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && st.peek() > arr[i]) {
				st.pop();
				answer++;
			}
			if(!st.isEmpty() && st.peek() == arr[i]) {
				continue;
			}
			
			st.push(arr[i]);
		}
		
		System.out.println(answer);
	}

}

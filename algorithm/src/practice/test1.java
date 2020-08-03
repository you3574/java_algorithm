package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
•	문자열은 1 과 2 로만 구성된다.
•	1의 뒤는 항상 2 가 존재해야만 한다.
•	2의 뒤는 1 혹은 2 가 존재할 수 있다.

 */
public class test1 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Queue qu = new LinkedList<>();

		for (int i = 0; i < input.length(); i++) {
			qu.add(input.charAt(i));
		}

		while (qu.size() != 0) {
			if ((char)qu.peek() == '1') {
				qu.poll(); //1 삭제
				
				if(qu.isEmpty()) {
					System.out.println("false");
					return ;
				}else {
					char num2=(char)qu.peek();
					//1일때
					if(num2=='1') {
						System.out.println("false");
						return ;
					}else {
						qu.poll();
					}
				}

			} else {
				// 2일때
				qu.poll();
				if (qu.isEmpty()) {
					System.out.println("true");
					return;
				} 
			}
		}
		System.out.println("true");
	}

}

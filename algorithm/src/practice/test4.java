package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

//•	내가 기억할 수 있는 결제수단은 최근 5개의 결제수단이다.
//•	주어진 input은 내가 사용한 순서대로 나열한 것이다. (나열된 값 중 가장 마지막 값이 사용자가 가장 최근에 사용한 결제수단이다)
//•	주어진 input을 기준으로 매 결제수단 사용시 최근 5개 결제수단을 출력하시오.

public class test4 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<String> st = new Stack<>();
		LinkedList<String> result = new LinkedList<>();

		int num = input.length();

		while (num != 0) {
			st.push(input.substring(num - 2, num));
			// System.out.println(input.substring(num-2, num));
			num -= 2;

		}

		while (!st.isEmpty()) {
			String s = st.pop(); // 단어 뽑기

			// 전체 size가 5보다 작을 때
			if (result.isEmpty()) {
				// 리스트가 비어있으면 무조건 값을 넣는다.
				result.addFirst(s);
				System.out.println(result);
			} else {
				// 리스트가 비어있지 않을 때
				if (result.contains(s)) {
					// 만약 리스트에 똑같은 값이 있으면? 있던 값을 삭제해주고 맨 앞에 삽입!
					result.remove(s);
					result.addFirst(s);
					// 어차피 같아서 사이즈 변경 안해도됨.
					System.out.println(result);
				} else {
					// 리스트에 똑같은 값이 없으면? 맨 앞에 삽입!
					result.addFirst(s);

					// size 오바 시
					if (result.size() > 5) {
						result.removeLast();
						System.out.println(result);
					} else {
						System.out.println(result);

					}
				}
			}

		}
	}

}

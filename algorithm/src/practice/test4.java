package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//•	내가 기억할 수 있는 결제수단은 최근 5개의 결제수단이다.
//•	주어진 input은 내가 사용한 순서대로 나열한 것이다. (나열된 값 중 가장 마지막 값이 사용자가 가장 최근에 사용한 결제수단이다)
//•	주어진 input을 기준으로 매 결제수단 사용시 최근 5개 결제수단을 출력하시오.

public class test4 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
	
		System.out.println(input.substring(1));
	}

}

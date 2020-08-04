package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
•	김토스는 이토스에게 매일 특정 금액을 줘야한다
•	이토스는 김토스에게 매일 특정 금액을 줘야한다
•	두 명이 서로 주는게 귀찮아서, 항상 김토스가 이토스에게 받을 금액을 감안해서 이토스에게 돈을 준다

 */
public class test5 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();

		String[] kim = input.split(" ");
		String[] lee = input2.split(" ");
		LinkedList<Integer> list = new LinkedList<>();

		int[] result = new int[kim.length];
		int num = 0;

		for (int i = 0; i < kim.length; i++) {
			// 김토스가 줄 돈이 더 많거나 같을 때
			if (Integer.parseInt(kim[i]) >= Integer.parseInt(lee[i])) {
				if (num < 0) {
					//김토스가 이토스에게 빚이 있을 때
					if ((Integer.parseInt(kim[i])) - (Integer.parseInt(lee[i])) + num < 0) {
						//줄 돈으로 빚이 감당이 안될 때, 일단 갚을 수 있을 만큼 갚고 나머지는 빚으로..
						num+=((Integer.parseInt(kim[i])) - (Integer.parseInt(lee[i])));
						result[i] = 0;
					} else {
						//김토스가 이토스에게 빚을 다 청산할 수 있을 때
						result[i]=(Integer.parseInt(kim[i])) - (Integer.parseInt(lee[i])) + num;
						num=0;
					}
				} else {
					//김토스가 이토스에게 빚을 없읗 때
					result[i] = (Integer.parseInt(kim[i])) - (Integer.parseInt(lee[i]));
				}
			} else {
				// 김토스가 줄 돈이 더 적을 때
				num += (Integer.parseInt(kim[i])) - (Integer.parseInt(lee[i]));
				result[i] = 0;
			}
		}

		for (int s : result) {
			list.add(s);
		}

		System.out.println(list);
	}

}

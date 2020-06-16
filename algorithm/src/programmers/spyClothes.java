/*
 * programmers
 * ¿ß¿Â
 */
package programmers;
import java.util.*;

public class spyClothes {

	public static int solution(String[][] clothes) {
		int answer = 1;
		

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			if (map.containsKey(clothes[i][1])) {
				int k = map.get(clothes[i][1]);
				map.put(clothes[i][1], k + 1);
			} else {
				map.put(clothes[i][1], 2);
			}
		}

		for(String key:map.keySet()) {
			int value=map.get(key);
			answer*=value;
		}
		
		answer--;
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		String[][] clothes2 = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "face" } };

		System.out.println(solution(clothes));
		System.out.println(solution(clothes2));
	}

}

/*
 * programmers
 * problems/완주하지 못한 선수
 */
package programmers;
import java.util.*;

public class NotCompletion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] p1 = { "leo", "kiki", "eden" };
		String[] p2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] p3 = { "mislav", "stanko", "mislav", "ana" };

		String[] c1 = { "eden", "kiki" };
		String[] c2 = { "josipa", "filipa", "marina", "nikola" };
		String[] c3 = { "stanko", "ana", "mislav" };

		System.out.println(solution(p1, c1));
		System.out.println(solution(p2, c2));
		System.out.println(solution(p3, c3));
		//solution(p3,c3);

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0; i<participant.length; i++) {
			if(map.containsKey(participant[i])) {
				int k=map.get(participant[i]);
				map.put(participant[i],k+1);
				//System.out.println(participant[i]);
			}else {
				map.put(participant[i],0);
			}
			
		}
		
		for(int i=0; i<completion.length; i++) {
			if(map.containsKey(completion[i])) {
				if(map.get(completion[i])==0) {
					map.remove(completion[i]);
				}else if(map.get(completion[i])>0) {
					//System.out.println(completion[i]);
					int k=map.get(completion[i]);
					map.put(completion[i],k-1);
				}
			}
		}
		
		for(String key:map.keySet()) {
			answer=key;
		}

		return answer;

	}

}

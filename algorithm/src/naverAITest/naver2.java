package naverAITest;

import java.lang.reflect.Array;
import java.util.*;

public class naver2 {

	public static int solution(String[] id_list, int k) { //손님 리스트, 최대 구매

		int answer = 0;
		Map<String,Integer> map=new HashMap<String,Integer>();	
	
		for(int i=0; i<id_list.length; i++) {
			String[] array=id_list[i].split(" ");
	
			Set<String>set=new HashSet<String>();
			Collections.addAll(set, array);
			System.out.println(set);
			for(String s:set) {
				if(map.containsKey(s)) {
					int value=map.get(s);
					if(value==k) {
						continue;
					}else {
						map.put(s, value+1 );
					}
				}else {
					map.put(s, 1);
				}
				
			}
		}
	
		for(String s:map.keySet()) {
			answer+=map.get(s);
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] id_list= {"A B C D","A D","A B D","B D"};
		String[] id_list2= {"JAY","JAY ELLE JAY MAY","MAY ELLE MAY","ELLE MAY","ELLE ELLE ELLE","MAY"};
		
		//System.out.println(solution(id_list,2));
		System.out.println(solution(id_list2,3));
	}

}

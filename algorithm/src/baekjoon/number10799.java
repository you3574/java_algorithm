package baekjoon;

import java.util.*;

public class number10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		s=s.replace("()", "0");
		
		System.out.println(s);
		
		ArrayList<Character> list = new ArrayList<>();
		Stack<Character> st = new Stack<>();
		int answer=0;
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		for(int i=0; i<list.size(); i++) {
			if(list.get(i)=='(') {
				st.add(list.get(i));
			}else if(list.get(i)==')') {
				st.pop();
				answer++;
			}else if(list.get(i)=='0'){
				answer+=st.size();
			}
		}
		
		System.out.println(answer);
	}

}

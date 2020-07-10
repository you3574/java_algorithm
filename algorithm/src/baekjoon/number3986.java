package baekjoon;

import java.util.*;

public class number3986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] words=new String[n];
		int result=0;
	
		for(int i=0; i<n; i++) {
			words[i]=sc.next();
		}
		
		for(int i=0; i<n; i++) {
			Stack<Character> st=new Stack<>();
			for(char c:words[i].toCharArray()) {
				if(st.empty() || st.peek()!=c)
					st.add(c);
				else
					st.pop();
			}
			if(st.empty())
				result++;
		}
		
		System.out.println(result);
	}

}

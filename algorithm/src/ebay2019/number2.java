package ebay2019;

import java.util.*;

public class number2 {

	public static int 최대공약수(int s, int t) {
		while (t != 0) {
			int num = s % t;
			s = t;
			t = num;
		}
		return s;
	}

	public static boolean solution(String s, String t) {

		int n1=s.length();
		int n2=t.length();
				
		int num = 최대공약수(n1,n2);
		
		for(int i=0; i<n1; i++) {
			if(s.charAt(i)!=t.charAt(i%num)) return false;
		}
		for(int i=0; i<n2; i++) {
			if(t.charAt(i)!=s.charAt(i%num)) return false;
		}

		return true;

	}

	public static void main(String[] args) {
		String[][] a = new String[][] { { "a", "a" }, { "a", "aa" }, { "ab", "abab" }, { "abab", "ababab" },
				{ "a", "b" }, { "a", "bb" }, { "ab", "aba" }, { "abab", "abaab" }, };
		for (String[] s : a)
			System.out.println(solution(s[0], s[1]));
	}

}

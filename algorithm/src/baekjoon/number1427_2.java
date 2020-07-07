package baekjoon;

import java.util.*;

public class number1427_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		String line = sc.next();
		
		for(int i=0; i<line.length(); i++) {
			list.add(line.charAt(i)-48);
		}
		
		Collections.sort(list);
		
		for(int i=list.size()-1; 0<=i; i--) {
			System.out.println(list.get(i));
		}
	}

}

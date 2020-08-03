package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
•	로또 번호는 중복되지 않는 숫자 6개로 구성된다. 
•	각 번호는 1 부터 45 까지의 숫자로 구성된다.
•	로또 번호는 오름차순으로 정렬되어야 한다.

 */

public class test2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] num=input.split(" ");
		int[] result=new int[num.length];
		
		if(num.length!=6) {
			System.out.println("false1");
			return;
		}
		
		for(int i=0; i<num.length; i++) {
			if(Integer.parseInt(num[i])>46 || Integer.parseInt(num[i])<0) {
				System.out.println("false2");
				return;
			}else {
				result[i]=Integer.parseInt(num[i]);
			}
		}
		
		for(int i=0; i<result.length-1; i++) {
			if(result[i]>result[i+1]){
				System.out.println("false3");
				return;
			}else if(result[i]==result[i+1]){
				System.out.println("false4");
				return;
			}
			else {
				continue;
			}
		}
		System.out.println("true");

	}
}

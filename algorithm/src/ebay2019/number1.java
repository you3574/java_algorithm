package ebay2019;

import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] prices=new int[sc.nextInt()];
		int max=0;
		int min=1000000;
		
		for(int i=0; i<prices.length; i++) {
			prices[i]=sc.nextInt();
			max=Math.max(max, prices[i]);
			min=Math.min(min, prices[i]);
		}
		
		int answer=max-min;
		System.out.println(answer);
		
	}

}

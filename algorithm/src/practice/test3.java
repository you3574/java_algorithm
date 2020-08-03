package practice;
import java.util.*;
import java.io.*;
/*
•	compute(int n) 의 함수가 주어졌다
•	주어진 compute 함수는 정수를 받아서 정수를 반환하지만, 1초가 걸린다.
•	compute 함수는 동일한 인자가 주어지면 항상 동일한 수를 리턴한다.
*/
public class test3 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Map<Integer, Integer> map=new HashMap<>();
		String[] num=input.split("");
		//int[] result=new int[num.length];
		
		for(int i=0; i<num.length; i++) {
			
			if(map.containsKey(Integer.parseInt(num[i]))){
				compute(map.get(Integer.parseInt(num[i])));
			}else {
				map.put(Integer.parseInt(num[i]),compute(Integer.parseInt(num[i])));
			}

		}
		
	}

	private static int compute(int n) {
		// TODO Auto-generated method stub
		return 0;
	}


}

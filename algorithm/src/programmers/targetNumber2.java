package programmers;

public class targetNumber2 {

	 static int answer = 0;
	 public static int solution(int[] numbers, int target) {
	       
	        dfs(numbers,0,0,target);
	        return answer;
	    }
	 
	private static void dfs(int[] numbers, int node, int sum, int target) {
		// TODO Auto-generated method stub
		if(numbers.length==node) {
			if(sum==target)
				answer++;
		}
		else if(numbers.length>node) {
			dfs(numbers,node+1,sum+numbers[node],target);
			dfs(numbers,node+1,sum-numbers[node],target);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {1,1,1,1,1};
		System.out.println(solution(numbers,3));
	}

}

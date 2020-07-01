package programmers;

public class network {

	public static int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] check = new boolean[n]; // 확인햇는지 체크하는 배열
		for (int i = 0; i < n; i++) {
			check[i] = false;
		}

		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				dfs(check, i, computers);
				answer++;
			}
		}

		return answer;
	}

	static boolean[] dfs(boolean[] check, int i, int[][] computers) {
		// TODO Auto-generated method stub
		check[i] = true;

		// 마지막까지 돌기.
		for (int j = 0; j < computers.length; j++) {
			if (j != i && check[j] == false && computers[i][j] == 1) {
				dfs(check, j, computers);
			}
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] computers= {{1,1,0},{1,1,0},{0,0,1}};
		int [][] computers2= {{1,1,0},{1,1,1},{0,1,1}};
		System.out.println(solution(3,computers));
		System.out.println(solution(3,computers2));
	}

}

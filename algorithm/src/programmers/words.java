package programmers;

import java.util.*;

public class words {
	public static class Node {
		int count;
		String word;

		public Node(String word, int count) {
			this.word = word;
			this.count = count;
		}

		public int getCount() {
			return count;
		}

		public String getWord() {
			return word;
		}

	}

	public static int solution(String begin, String target, String[] words) {
		boolean check=false;

		for (int i = 0; i < words.length; i++) {
			
			if (words[i].equals(target)) {
				check=true;
			}
		}
		
		if(!check) return 0;
		
		return dfs(begin, target, words);
	}

	public static int dfs(String begin, String target, String[] words) {
		// TODO Auto-generated method stub
		Queue<Node> qu = new LinkedList<>();
		qu.add(new Node(begin, 0)); // hit넣음.
		
		while (!qu.isEmpty()) {
			Node curNode = qu.poll(); // 현재값
			System.out.println(curNode.getWord());
			
			if (curNode.getWord().equals(target)) {
				return curNode.getCount();
			} else {
				for (int i = 0; i < words.length; i++) {
					if (!compare(curNode.getWord(), words[i])) // false일때
						continue;
					else { // true일때
						qu.add(new Node(words[i], curNode.getCount() + 1));
					}
				}
			}

		}

		return 0;
	}

	public static boolean compare(String nodeWord, String word) {

		int c = 0;
		for (int i = 0; i < word.length(); i++) {
			if (nodeWord.charAt(i) != word.charAt(i))
				c++;
		}
		return c > 1 ? false : true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		System.out.println(solution("hit", "cog", words));
	}

}

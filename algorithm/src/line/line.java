package line;

import java.util.*;

class line {
	public static int solution(String inputString) {
		Stack<Character> stack = new Stack<Character>();
		int answer = 0;

		int loopCount = 0;
		for (loopCount = 0; loopCount < inputString.length(); loopCount++) {
			char ch = inputString.charAt(loopCount);

			switch (ch) {
			case '(':
			case '{':
			case '[':
			case '<':
				stack.push(ch);
				break;

			case ')':
				if (stack.isEmpty() || (ch = stack.pop()) != '(') {
					
				}
				answer++;
				break;

			case '}':
				if (stack.isEmpty() || (ch = stack.pop()) != '}') {
					
				}
				answer++;
				break;

			case ']':
				if (stack.isEmpty() || (ch = stack.pop()) != ']') {
					
				}
				answer++;
				break;

			case '>':
				if (stack.isEmpty() || (ch = stack.pop()) != '<') {
					
				}
				answer++;
				break;

			}

			
		}
		
		if(stack.contains('(') ||stack.contains('[') ||stack.contains('{') ||stack.contains('<'))
			answer=-1;
			
		return answer;
	}

	public static void main(String[] args) {
		
		String a1="line [plus]";
		String a2=">_<";
		System.out.println(solution(a1));
		System.out.println(solution(a2));
		// TODO Auto-generated method stub
	}
}
/*
 * leetcode
 * problems/valid-parentheses
 */

package leetcode;
import java.util.*;

public class ValidParentheses {
	public static boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character>();

		for(char c:s.toCharArray()) {
			switch(c) {
			case '(' :
				stack.push(c);
				break;
			case '{' :
				stack.push(c);
				break;
			case '[' :
				stack.push(c);
				break;
			case ')':
				if(stack.isEmpty()) {
					return false;
				}else if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
					break;
				}else
					return false;
			case '}' :
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
					break;
				}else if(stack.isEmpty()) {
					return false;
				}else
					return false;
			case ']' :
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
					break;
				}else if(stack.isEmpty()) {
					return false;
				}else
					return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("([)])"));
		
	}

}

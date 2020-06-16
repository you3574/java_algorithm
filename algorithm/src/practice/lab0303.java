package practice;
import java.util.*;
class lab0303 {
    public static int[] solution(int[] heights) {
    	
    	Stack<Integer> st=new Stack<>(); //선입후출
        
    	int[] answer = new int[heights.length];
        
        for(int i=0; i<heights.length; i++) {
        	st.push(heights[i]);
        	answer[i]=0;
        }
        
        while(!st.isEmpty()) {
        	int num=st.pop();
        	//System.out.println(st.size());
        	for(int i=st.size(); i>=0; i--) {
        		if(heights[i]>num) {
        			answer[st.size()]=i+1; //배열 자리 + 1 = 위치
        			break;
        		}
        	}
        }
       
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,2,3,4,5};
		int[] n2= {6,9,5,7,4};
		System.out.println(solution(n2));
	}

}

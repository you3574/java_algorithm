package practice;
import java.util.*;
public class lab0308 {
	
	public static int[] solution(int[] answers) {
        int [] p1= {1,2,3,4,5};
        int [] p2= {2,1,2,3,2,4,2,5};
        int [] p3= {3,3,1,1,2,2,4,4,5,5};
        
        ArrayList<Integer> nums = new ArrayList<>();
        int num1 = 0,num2 = 0,num3=0;
       
        for(int i=0; i<answers.length; i++) {
        	if(p1[i%p1.length] == answers[i])
        		num1++;
        	if(p2[i%p2.length] == answers[i])
        		num2++;
        	if(p3[i%p3.length] == answers[i])
        		num3++;
        }
       
        if(num1>num2) {
        	if(num1>num3) 
        		nums.add(1);
        	else if(num3>num1)
        		nums.add(3);
        	else {
        		nums.add(1);
        		nums.add(3);
        	}
        }else if(num2>num1) {
        	if(num2>num3)
        		nums.add(2);
        	else if(num3>num2)
        		nums.add(3);
        	else {
        		nums.add(2);
        		nums.add(3);
        	}
        }else if(num1==num2) {
        	if(num1==num3) {
        		nums.add(1);
        		nums.add(2);
        		nums.add(3);
        	}else {
        		nums.add(1);
        		nums.add(2);
        	}
        		
        }
		
        
        int[] answer=new int [nums.size()];
        Collections.sort(nums);

        for(int i=0; i<answer.length; i++) {
        	answer[i]=nums.get(i);
        	System.out.println(answer[i]);
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {1,2,3,4,5};
		int n2[]= {1,3,2,4,2};
		
		solution(n2);

	}

}

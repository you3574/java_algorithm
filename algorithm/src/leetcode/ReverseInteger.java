/*
 * leetcode
 * problems/reverse-integer
 */
package leetcode;
import java.util.*;

public class ReverseInteger {
	 public static int reverse(int x) {
	     StringBuilder sb=new StringBuilder();
		 
		 int num=x;
		 if(num<0) {
			 num=num*-1;
		 }
		 while(num>0) {
			 int result=num%10;
			sb.append(result);
			 num/=10;
		 }
			 
		 if(x<0) {
			 sb.insert(0, '-');
		 }
		 String s=sb.toString();
		 
		 try {
			return Integer.parseInt(s); //여기서 앞에있는 0들 제거됨.
			} catch (Exception e) {
				return 0;
			}
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-1203000));
	}

}

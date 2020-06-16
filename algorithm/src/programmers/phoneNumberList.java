/*
 * programmers
 * 전화번호부
 */
package programmers;
import java.util.*;

public class phoneNumberList {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=phone_book.length-1; i<j; j--) {
				if(phone_book[j].startsWith(phone_book[i])) {
					answer=false;
					break;
				}
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] phone_book = { "119", "97674223", "1195524421" };
		String[] phone_book2= {"123", "456", "789"};
		String[] phone_book3= {"12", "123", "1235","567","88"};
		System.out.println(solution(phone_book));
		System.out.println(solution(phone_book2));
		System.out.println(solution(phone_book3));
	}

}

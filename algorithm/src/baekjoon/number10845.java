package baekjoon;
import java.util.*;
public class number10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qu=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //명령 개수
		int num=0;
		
		for(int i=0; i<n; i++) {
			String s=sc.next();
			if(s.equals("push")) {
				num=sc.nextInt();
				qu.offer(num);
			}else if(s.equals("front")) {
				System.out.println(qu.isEmpty()?-1:qu.peek());
			}else if(s.equals("back")) {
				System.out.println(qu.isEmpty()?-1:num);
			}else if(s.equals("empty")) {
				System.out.println(qu.isEmpty()?1:0);
			}else if(s.equals("size")) {
				System.out.println(qu.size());
			}else if(s.equals("pop")) {
				System.out.println(qu.isEmpty()?-1:qu.poll());
			}
		}
		
	}

}

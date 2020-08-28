package baekjoon;
import java.util.*;
public class number13567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int xy=sc.nextInt(); //ũ��
		int num=sc.nextInt(); //����Ƚ��
		
		int way=1; //ó���� ����
		//1 ����, 2 ����, 3 ����, 4 ����
		int go_x=0;
		int go_y=0;
		boolean check=true;
		
		for(int i=0; i<num; i++) {
			String motion=sc.next();
			int movement=sc.nextInt();
			
			if(motion.equals("MOVE")) {
				switch(way) {
				case 1:
					go_x+=movement;
					break;
				case 2:
					go_y+=movement;
					break;
				case 3:
					go_x-=movement;
					break;
				case 4:
					go_y-=movement;
					break;
				}
			}else if(motion.equals("TURN")) {
				if(movement==0) {
					if(way==4)
						way=1;
					else
						way+=1;
				}else if(movement==1) {
					if(way==1)
						way=4;
					else
						way-=1;
				}
			}
			
			if(go_x>xy || go_x<0 || go_y>xy || go_y<0) {
				check=false;
				break;
			}
		}
		
		if(check==true)
			System.out.println(go_x+" "+go_y);
		else if(check==false)
			System.out.println("-1");
	}

}

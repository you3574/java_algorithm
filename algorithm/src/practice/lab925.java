package practice;
import java.util.*;

public class lab925 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
       
		System.out.println("�ڸ� ��");
		num = scan.nextInt();   //n�� ����
		int result = 0;
		HashSet<Integer> hash = new HashSet<Integer>(); //treeSet
        Random random = new Random();
        
        boolean[] number=new boolean [num];
        int [] number2=new int [num];
         
        for(int i=0; i<num; i++) {
        	number[i]=random.nextBoolean();
            number2[i]=(number[i] ? 1: 0);
            System.out.print(number2[i]+" ");
        }
        System.out.println(" ");

        for(int first=0; first<num; first++) {
        	if(number2[first]==1) {
        	for(int second=(first+1); second<num; second++) {
        		if(number2[second]==1) {
        				result = second-first;
        				hash.add(result);
        				System.out.println(result);
              		}
        	}
        	
        }
        }
      
        List<Integer> arrayList=new ArrayList();
    	arrayList.addAll(hash);
    	System.out.print("���"+arrayList.get(0)+" ");

	}

}

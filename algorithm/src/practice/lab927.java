package practice;

import java.util.*;

public class lab927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int start=0, end=0;
		int count = 0, result=0;
		int maxValue=0,f=0, maxKey=0; 
		
		Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
       
		System.out.println("�ڸ� ��");
		num = scan.nextInt();   //n�� ����
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        Random random = new Random();
        
        boolean[] number=new boolean [num];
        int [] number2=new int [num];
        
        for(int i=0; i<num; i++) {
        	number[i]=random.nextBoolean();
            number2[i]=(number[i] ? 1: 0);
            System.out.print(number2[i]+" ");
        }
        System.out.println(" ");
       
        
       for(int i=0; i<num; i++) {
    	   if(number2[i]==0) {
    		   count++;
    	   }
    	   else {
    		   map.put(i,count);
    		   count=0;
    	   }
    		   
       }
       
       Collection values = map.values();//value���� �ֱ�
       maxValue=(int) Collections.max(values);
       System.out.println("�ִ밪 : " + maxValue); //�ִ밪
       
       System.out.println("�ε���: "+getKey(map,maxValue)); //�ε���
       
       maxKey=getKey(map,maxValue);
       
       f=maxValue/2;
       
       int f2=(int)Math.ceil(f);
       System.out.println("�ݿø� ��: "+f2);
       
       
       f2=(maxKey-f2-1);
       
       System.out.println("1�� �����ϴ� �ڸ�: "+f2);
     
   	   number2[f2]=1;
   	   
   	   for(int i=0; i<num; i++) {
   		System.out.print(number2[i]+" ");   
   	   }
       
       
    
	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
        // ã�� hashmap �� �־��� �ܼ� value
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

}

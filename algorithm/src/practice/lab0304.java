package practice;

import java.util.*;
class Truck {
    int weight;
    int distance;

    public Truck(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }
}
class lab0304 {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        
	  	int answer = 0;	        
        int w=weight; //��������
        //���Ʈ���� ���� -, �̵������� ���������� + 
	  	
	  	Truck truck =null;
	  	Queue<Truck> stop= new LinkedList<Truck>();
	 
	  	List<Truck> ing=new ArrayList<Truck>();
	  	    
	  	for(int t: truck_weights) {
	  		stop.add(new Truck(t, bridge_length));
	  	}
        
        while(!(stop.isEmpty() && ing.isEmpty())) {
        	answer++;
        	
        	//�ǳʴ� Ʈ���� ���� �� 1.�Ÿ��� 0�϶� 
        	if(!ing.isEmpty() && ing.get(0).distance<=0) {
        		w+=ing.get(0).weight;
        		//System.out.println(ing.peek());
        		ing.remove(0);
        	}
        	//��� Ʈ���� ������, �Ÿ��� �˳��� ��
        	if(!stop.isEmpty() && w-stop.peek().weight >=0) {
        		w-=stop.peek().weight;
        		ing.add(stop.poll()); //��� ->�̵�
        	}
        	
        	 for (int i = 0; i < ing.size(); i++) {
                 truck = ing.get(i);
                 truck.distance--;
             }
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 7,4,5,6 };
		System.out.println(solution(2,10,n));
	}

}

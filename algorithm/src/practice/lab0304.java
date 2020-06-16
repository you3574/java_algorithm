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
        int w=weight; //무게측정
        //대기트럭이 들어가면 -, 이동차량이 빠져나가면 + 
	  	
	  	Truck truck =null;
	  	Queue<Truck> stop= new LinkedList<Truck>();
	 
	  	List<Truck> ing=new ArrayList<Truck>();
	  	    
	  	for(int t: truck_weights) {
	  		stop.add(new Truck(t, bridge_length));
	  	}
        
        while(!(stop.isEmpty() && ing.isEmpty())) {
        	answer++;
        	
        	//건너는 트럭이 빠질 때 1.거리가 0일때 
        	if(!ing.isEmpty() && ing.get(0).distance<=0) {
        		w+=ing.get(0).weight;
        		//System.out.println(ing.peek());
        		ing.remove(0);
        	}
        	//대기 트럭이 빠질때, 거리가 넉넉할 때
        	if(!stop.isEmpty() && w-stop.peek().weight >=0) {
        		w-=stop.peek().weight;
        		ing.add(stop.poll()); //대기 ->이동
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

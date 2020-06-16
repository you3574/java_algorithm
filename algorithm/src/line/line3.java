package line;
import java.util.*;
class line3 {
    public static String[][] solution(String[][] snapshots, String[][] transactions) {
        
    	HashMap<String, Integer> s=new HashMap<String,Integer>();
    	HashMap<String, Integer> id=new HashMap<String,Integer>(); //id확인
    	
    	for(int i=0; i<snapshots.length; i++) {
    		s.put(snapshots[i][0],(Integer.parseInt(snapshots[i][1]))); //계좌이름, 잔액
    	}
    	
    	for(int i=0; i<transactions.length; i++) {
    		 //중복제거 id값 들어감
    		if(!id.containsKey(transactions[i][0])) {
    			id.put(transactions[i][0],1);
    			System.out.println(transactions[i][2]);
    			if(s.containsKey(transactions[i][2])) { //계좌이름
    				if(transactions[i][1].equals("SAVE")) {
    					s.put(transactions[i][2], (s.get(transactions[i][3]))+Integer.parseInt(transactions[i][3]));
    				}else {
    					s.put(transactions[i][2], (s.get(transactions[i][3]))-Integer.parseInt(transactions[i][3]));
    				}
    			}else{
    				System.out.println("1111111111111111111");
    				s.put(transactions[i][2], Integer.parseInt(transactions[i][3]));
    			}
    		}
    	}
    	
    	

    	String[][] answer =new String [s.size()][2];
    	Set<String> list=s.keySet();
    	int i=0;
//    	for(String a:list) {
//    		System.out.println(answer[i][0]=a);
//    		System.out.println(answer[i][1]=s.get(a).toString()); //스트링으로 바꿔줘야함
//    		i++;
//    	}
    	
    	Arrays.sort(answer, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
    	
    	
        return answer;
        
        
    }
    public static void main(String[] args) {
        String[][] snapshots = {{"ACCOUNT1","100"}, {"ACCOUNT2", "150"}, {"ACCOUNT10", "150"}};
        String[][] transactions = {{"1", "SAVE", "ACCOUNT2", "100"},
                {"2", "WITHDRAW", "ACCOUNT1", "50"},
                {"1", "SAVE", "ACCOUNT2", "100"},
                {"4", "SAVE", "ACCOUNT3", "500"},
                {"3", "WITHDRAW", "ACCOUNT2", "30"}
        };

        String[][] result = solution(snapshots, transactions);
        for(int i = 0; i<result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }
    }
}
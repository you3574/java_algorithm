package brandi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class number1 {

	 public static void main(String[] args) throws Exception {
	        List<Integer> list=new ArrayList<>();
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int array[]={0,0,0,0,0,0};
	        //System.out.println("Hello Goorm! Your input is " + input);
	        int age = Integer.parseInt(br.readLine());
	        while(true){
	            String input=br.readLine();
	            if((input==null)||(input.equals("")))
	                break;
	            int standard = Integer.parseInt(input);
	            list.add(standard);
	        }

	        for(int n:list){
	            int result=(int)(n/(220.0-age)*100.0);
	            if(result<60)
	                array[5]++;
	            else if(result<68)
	                array[4]++;
	            else if(result<75)
	                array[3]++;
	            else if(result<80)
	                array[2]++;
	            else if(result<90)
	                array[1]++;
	            else
	                array[0]++;
	        }

	        for(int n:array)
	            System.out.print(n+" ");
	    }

}

package baekjoon;
import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

class test2 {
    public static boolean main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //   String input = br.readLine();
        String[] s = br.readLine().split(",");

        System.out.print(s.length);

        if (s.length!=6) {
            return false;
        }else {
            for(int i=0; i<s.length; i++){
                if(parseInt(s[i]) > parseInt(s[i+1])){
                    return false;
                }else
                    continue;
            }
            return true;
        }

    }


}
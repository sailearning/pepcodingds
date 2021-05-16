import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ss = scn.next();
        System.out.println(gss(ss));
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> s1 = new ArrayList<String>();
            s1.add("");
            return s1;
        }
        ArrayList<String> s = new ArrayList<String>();
        
        char p = str.charAt(0);
        
        ArrayList<String> s2 = gss(str.substring(1));
    
        for(String sg:s2){
            s.add(sg);
        }
        for(String sg:s2){
            s.add(p+sg);
        }
        return s;
    }

}

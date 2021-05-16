import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(getKPC(s));
    }
    
    public static String keypad(char a){
        if(a=='1') return "abc";
        else if(a=='2') return "def";
        else if(a=='3') return "ghi";
        else if(a=='4') return "jkl";
        else if(a=='5') return "mno";
        else if(a=='6') return "pqrs";
        else if(a=='7') return "tu";
        else if(a=='8') return "vwx";
        else if(a=='9') return "yz";
        else return ".;";
        }
    
    public static ArrayList<String> getKPC(String str) {
    
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        
        char p = str.charAt(0);
        
        String ss = str.substring(1);
        
        ArrayList<String> prevres = getKPC(ss);
        
        ArrayList<String> res = new ArrayList<String>();
        
        String word = keypad(p);
        
        for(int i=0;i<word.length();i++){
            char b = word.charAt(i);
            for(String s1:prevres){
                res.add(b+s1);
            } 
        }
        return res;
    }

}

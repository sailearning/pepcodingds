import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        printKPC(s,"");
    }

    public static String  letters(char ch) {
        if (ch=='1')return "abc";
        else if (ch=='2')return "def";
        else if (ch=='3')return "ghi";
        else if (ch=='4')return "jkl";
        else if (ch=='5')return "mno";
        else if (ch=='6')return "pqrs";
        else if (ch=='7')return "tu";
        else if (ch=='8')return "vwx";
        else if (ch=='9')return "yz";
        else return ".;";
    }

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        String ans = letters(ch);
        for(int i =0;i<ans.length();i++){
            char n = ans.charAt(i);
            printKPC(roq,asf+n);
        }
    }
}

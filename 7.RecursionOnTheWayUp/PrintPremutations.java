import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        printPermutations(s,"");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            String lp = str.substring(0,i);
            String rp = str.substring(i+1);
            String roq = lp+rp;
            printPermutations(roq,asf+ch);
        }

    }
}

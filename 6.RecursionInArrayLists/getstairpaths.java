import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> list = getStairPaths(n);
        System.out.println(list);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
            ArrayList<String> res1=new  ArrayList<String>();
            res1.add("");
            return res1;
        }
        if(n<0){
            ArrayList<String> res1=new  ArrayList<String>();
            return res1;
        }
        
        ArrayList<String> length1 = getStairPaths(n-1);
        ArrayList<String> length2 = getStairPaths(n-2);
        ArrayList<String> length3 = getStairPaths(n-3);
        
        ArrayList<String> res = new ArrayList<String>();
        
        for(String x:length1){
            res.add("1"+x);
        }
        for(String x:length2){
            res.add("2"+x);
        }
        for(String x:length3){
            res.add("3"+x);
        }
        return res;
    }

}

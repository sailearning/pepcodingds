import java.io.*;
import java.util.*;

public class PrintStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }
    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }
        
        int n1=n-1;
        int n2=n-2;
        int n3=n-3;
        String path1= path+1;
        String path2= path+2;
        String path3= path+3;

        if (n1>=0)
        printStairPaths(n1,path1);
        if (n2>=0)
        printStairPaths(n2,path2);
        if (n3>=0)
        printStairPaths(n3,path3);

    }

}

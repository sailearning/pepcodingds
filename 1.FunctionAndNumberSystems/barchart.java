import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        int m=-1;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]>m){
                m=arr[i];
            }
            
        }
        for(int i=1;i<=m;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>m-i)
                    System.out.print("*	");
                else
                    System.out.print("	");
            }
            System.out.println();
            
        }
    }

}

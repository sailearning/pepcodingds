import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[]arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[]arr2= new int[n2];
        for(int j=0;j<n2;j++){
            arr2[j]=scn.nextInt();
        }
        
        int len=Math.max(n1,n2);
        int[]ansarr= new int[len+1];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=ansarr.length-1;
        
        while(i>=0||j>=0||k>=0){
            
            int sum=0;
            if(i>=0)
                sum=sum+arr1[i];
            
            if(j>=0)
                sum=sum+arr2[j];
            
            sum=sum+carry;
            
            int rem=sum%10;
            int quo=sum/10;
            ansarr[k]=rem;
            carry=quo;
            i--;
            j--;
            k--;
    }
    
    if(ansarr[0]!=0)
        System.out.println(ansarr[0]);
    j=1;
    while(j<ansarr.length){
        System.out.println(ansarr[j]);
        j++;
    }
  }
}

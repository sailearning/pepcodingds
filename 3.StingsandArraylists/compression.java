import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String s=str.substring(0,1);
		char prev=str.charAt(0);
		for(int i=1;i<str.length();i++){
		    if(prev!=str.charAt(i)){
		        s=s+str.charAt(i);
		        prev=str.charAt(i);
		    }
		}
		return s;
	}

	public static String compression2(String str){
	    int count=1;
		String s=str.substring(0,1);
		char prev=str.charAt(0);
		for(int i=1;i<str.length();i++){
		    if(prev!=str.charAt(i)){
		        if(count>1)
		            s=s+count;
		        s=s+str.charAt(i);
		        prev=str.charAt(i);
		        count=1;
		    }
		    else{
		        count++;
		    }
		}
		if(count>1)
		    return s+count;
		else
		    return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
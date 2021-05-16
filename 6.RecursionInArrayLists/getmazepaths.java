import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        ArrayList<String> allpaths = getMazePaths(0,0,nr-1,nc-1);
        System.out.println(allpaths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc){
            ArrayList<String> p = new ArrayList<String>();
            p.add("");
            return p;
        }
        
        if(sr>dr || sc>dc){
            ArrayList<String> p = new ArrayList<String>();
            return p;
        }
        
        ArrayList<String> pathh = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> pathv = getMazePaths(sr+1,sc,dr,dc);
        
        ArrayList<String> paths = new ArrayList<String>();
        
        for(String path:pathh){
            paths.add("h"+path);   
        }
        
        for(String path:pathv){
            paths.add("v"+path);   
        }
        return paths;
    }

}

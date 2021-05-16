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
        ArrayList<String> paths = new ArrayList<String>();
        
            ArrayList<String> pathh = new ArrayList<String>();
            for(int i=1;i<=dc;i++){
                pathh = getMazePaths(sr,sc+i,dr,dc);
                for(String path:pathh){
                    paths.add("h"+i+path);   
                }
            }
            
            for(int i=1;i<=dr;i++){
                ArrayList<String> pathv = new ArrayList<String>();
                pathv = getMazePaths(sr+i,sc,dr,dc);
                for(String path:pathv){
                    paths.add("v"+i+path);   
                }   
            }
            
            for(int i=1;i<=dr && i<=dc;i++){
                ArrayList<String> pathd = new ArrayList<String>();
                pathd =  getMazePaths(sr+i,sc+i,dr,dc);
                for(String path:pathd){
                    paths.add("d"+i+path);   
                }
            }
        
        return paths;
    }

}

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        printMazePaths(0,0,dr-1,dc-1,"");
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) throws Exception {
        if(sc==dc && sr==dr){
            System.out.println(psf);
            return;
        }
        if(sc>dc || sr>dr){
            return;
        }
        for(int i=1; i<=dr; i++){
            printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
        }
        for(int j=1;j<=dc;j++){
            printMazePaths(sr,sc+j,dr,dc,psf+"h"+j);
        }
        for(int k=1; k<=dr+dc;k++){
            printMazePaths(sr+k,sc+k,dr,dc,psf+"d"+k);
        }

    }
}

package com.company;
import java.util.*;

public class dsa_Maze_jump {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        for (int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hpaths = getMazePaths(sr,sc+ms,dr,dc);
            for (String hpath:hpaths) {
                paths.add("h"+ms+hpath);
            }
        }
        for (int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ms,sc,dr,dc);
            for (String vpath:vpaths) {
                paths.add("v"+ms+vpath);
            }
        }
        for (int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for (String dpath:dpaths) {
                paths.add("d"+ms+dpath);
            }
        }

        return paths;
    }
}

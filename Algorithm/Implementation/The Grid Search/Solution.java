import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            boolean flag = false;
            int R = in.nextInt();
            int C = in.nextInt();
            char[][] G = new char[R][C];
            for(int i=0; i < R; i++){
                String s = in.next();
                for(int j = 0; j < C; j++){
                    G[i][j] = s.charAt(j);
                }
            }
            int r = in.nextInt();
            int c = in.nextInt();
            char[][] P = new char[r][c];
            for(int i=0; i < r; i++){
                String s = in.next();
                for(int j = 0; j < c; j++){
                    P[i][j] = s.charAt(j);
                }
            }
            char first = P[0][0];
            
            for(int i = 0; i < R; i++){
                
                for(int j = 0; j < C; j++){
                    if(G[i][j] == first){
                        if(isPattern(G,P,R,C,r,c,i,j))
                        {
                            System.out.println("YES");
                            flag = true;
                            break;
                        }
                        else
                            flag = false;
                    }        
                }                    
                if(flag)
                    break;
            }
            if(!flag)
                System.out.println("NO");
        }
            
    }
    
    static boolean isPattern(char[][] G,char[][] P,int R,int C,int r,int c,int I, int J){
        boolean flag = false;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                
                if(i+I < R && j + J < C && P[i][j] == G[i+I][j+J]) 
                    flag = true;
                else
                    return false;
            }
        }
        return flag;
    }
}

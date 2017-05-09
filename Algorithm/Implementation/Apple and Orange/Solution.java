import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple=0;
        int app=0,oran=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple = in.nextInt();
            if(a+apple>=s && a+apple<=t)
                {app++;}  
        }
        int orange=0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange = in.nextInt();
            if(b+orange<=t && b+orange>=s)
                {oran++;}
        }
        System.out.println(app+"\n"+oran);
    }
}

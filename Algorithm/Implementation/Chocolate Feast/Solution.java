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
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int choc=n/c;
            int wrap=choc;
            while(wrap>=m)
                {
                choc=choc+1;
                wrap=wrap+1;
                wrap=wrap-m;
            }
            System.out.println(choc);
        }
    }
}

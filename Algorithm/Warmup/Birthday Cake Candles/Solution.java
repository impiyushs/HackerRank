import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max=0,count=0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i]>max)
                {count=1;
                max=height[height_i];}
            else if(height[height_i]==max)
                {count++;}
        }
        
        
        System.out.println(count);
    }
}

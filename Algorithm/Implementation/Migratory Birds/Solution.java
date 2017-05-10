import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[6];
        for(int types_i=0; types_i < n; types_i++){
            types[in.nextInt()]++;
        }
        int count=0,max=0;
        for(int i=1;i<6;i++)
            {
            if(count<types[i])
                {count=types[i];
                max=i;}
        }
        System.out.println(max);
    }
}

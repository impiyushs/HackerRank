import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int d1=0,d2=0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                    {
                    d1=d1+a[a_i][a_j];
                }
                if(a_i+a_j==(n-1))
                    {d2=d2+a[a_i][a_j];}
            }
        }
        System.out.println(Math.abs(d1-d2));
    }
}

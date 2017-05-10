import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    static String solve(int year){
        // Complete this function
        int sum=31+31+30+31+30+31+31;
        
        int feb=0;
        if(year<1919)
            {
            if(year%4==0)
                feb=29;
            else 
                feb=28;
        
            if(year==1918)
                feb=feb-13;
            }
        if(year>=1919)
            {
            if(year%400==0 || year%4==0 && year%100!=0)
                feb=29;
            else
                feb=28;
            }
        sum=sum+feb;        
        int diff=256-sum;
        String s= diff+".09."+year;
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}

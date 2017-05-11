import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String step=sc.next();
        int u=0,count=0;
        for(int i=0;i<n;i++)
            {
            if(step.charAt(i)=='U')
            {u++;
             if(u==0)
                count++;
            }
            if(step.charAt(i)=='D')
                u--; 
        }
        System.out.println(count);
    }
}

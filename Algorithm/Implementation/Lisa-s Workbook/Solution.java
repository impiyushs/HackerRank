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
        int k=sc.nextInt();
        int count=0;
        int pg=1;
        for(int i=0;i<n;i++)
            {
            int prob=sc.nextInt(),j=1;
            while(j<=prob)
                {
                int temp=1;
                while(temp<=k && j<=prob)
                {
                    if(j==pg)
                         count++;
                    temp++;
                    j++;
                }
                pg++;
            }
        }
        System.out.println(count);
    }
}

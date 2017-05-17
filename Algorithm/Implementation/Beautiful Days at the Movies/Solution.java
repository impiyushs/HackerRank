import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
            {
            StringBuilder s=new StringBuilder();
            s=s.append(i);
            String revers=s.reverse().toString();
            int r= Integer.parseInt(revers);
            if((i-r)%k==0)
                count++;
        }
        System.out.println(count);
    }
}

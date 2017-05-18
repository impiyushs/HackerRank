import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=((int)Math.floor(Math.sqrt(b))-(int)Math.ceil(Math.sqrt(a))+1);
            System.out.println(count);
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b)
                System.out.print((x-1)*a);
            else
             {    if(b<a)
                {
                    int p=a;
                    a=b;
                    b=p;
                }
                for(int j=0;j<x;j++)
                {
                    int t= j*b+(x-1-j)*a;
                    System.out.print(t + " ");
                }
             }
                System.out.println();
        }
    }
}

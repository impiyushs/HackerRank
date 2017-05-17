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
        int sum=0,init=5;
        for(int i=1;i<=n;i++)
            {
            int temp=init/2;
            sum=sum+temp;
            init=temp*3;
        }
        System.out.println(sum);
    }
}

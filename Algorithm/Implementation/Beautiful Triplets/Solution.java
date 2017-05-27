import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int diff=sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<len;i++)
            {
            set.add(sc.nextInt());
        }
        int c=0;
        for(Integer n: set)
            {
            if( set.contains( (n + diff) ) && set.contains( (n + 2*diff) ) )
                c++;
        }
        System.out.println(c);
        }
    }

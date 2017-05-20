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
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
            {
            int temp=sc.nextInt();
            if (map.containsKey(temp))
                map.put(temp,map.get(temp)+1);
            else
                map.put(temp,1);      
        }
        int x=Collections.max(map.values());
        System.out.println(n-x);      
    }
}

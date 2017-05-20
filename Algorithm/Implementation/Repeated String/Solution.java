import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long count=0;
        if(s.length()==1 && s.charAt(0)=='a')
            count=n;
        else{
                for(int j=0;j<s.length();j++)
                    {
                    if(s.charAt(j)=='a')
                        count++;
                }
            long tot=n/s.length();
            count=count*tot;
            long temp=n%s.length();
            for(int i=0;i<temp;i++)
                {
                if(s.charAt(i)=='a')
                        count++;
            }
            
        }
        System.out.println(count);
    }
}

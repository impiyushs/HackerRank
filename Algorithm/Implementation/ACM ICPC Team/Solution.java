import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int max=0,c=0;
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        for(int i=0;i<n-1;i++)
            {
            for(int j=i+1;j<n;j++)
                {
                int count=0;
                for(int k=0;k<m;k++)
                    {
                    if((topic[i].charAt(k))=='1'|| (topic[j].charAt(k))=='1')
                        count++;
                }
                if(count>max)
                {max=count;
                 c=1;}
                else if(count==max)
                    c++;
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}

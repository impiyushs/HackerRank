import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        Set<Integer> set = new HashSet<Integer>();
        int count=0;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if(!set.contains(c[c_i]))
                {set.add(c[c_i]);}
            else
            {count++;
             set.remove(c[c_i]);
            }
        }
        System.out.println(count);
        
    }
}

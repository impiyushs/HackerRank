import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int minLength = Math.min(s.length(), t.length());
        int maxLength = Math.max(s.length(), t.length());
        
        int count=0,i=0;

           for(i=0;i<minLength;i++)
               {
               if(s.charAt(i)!=t.charAt(i))
                   break;
           }
            count=count+2*(minLength-i);
            count=count+(maxLength-minLength); 
            if(count<=k &&count%2==k%2 ||s.length() +t.length()<k)
                System.out.println("Yes");
            else
                System.out.println("No");
    }
}

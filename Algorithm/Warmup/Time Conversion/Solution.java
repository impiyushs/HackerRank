import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int i=Integer.parseInt(time.substring(0,2));
        if(time.charAt(8)=='P')
            {
            
            if(i<12)
                {i=i+12;
                System.out.println(i + time.substring(2,8));}
            else {
                 System.out.println(time.substring(0,8));}
            }
        else{ if(i==12)
            {System.out.println("00" + time.substring(2,8));}
                else {System.out.println(time.substring(0,8));}
            }
    
    }
}

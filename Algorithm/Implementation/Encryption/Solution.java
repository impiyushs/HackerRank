import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c= (int)Math.ceil(Math.sqrt(s.length()));
        String enc="";
        for(int i=0;i<c;i++)
        {
        	int j=0;
        	while(i+j<s.length())
            {
        		enc=enc+s.substring(i+j,i+j+1);
            	j=(j+c);
            }
        	enc=enc+" ";
        }
        System.out.println(enc);
    }
}

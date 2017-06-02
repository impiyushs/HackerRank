import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String [] tm={"zero","one","two", "three", "four", "five", "six",
        "seven", "eight", "nine", "ten", "eleven", "twelve",
        "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen", "twenty", 
        "twenty one", "twenty two", "twenty three", 
        "twenty four", "twenty five", "twenty six", 
        "twenty seven", "twenty eight", "twenty nine",
        "thirty"};
        String time="";
        if(m==0)
            time=tm[h] + " o' clock";
        if(m==15)
            time= "quarter past " + tm[h];
        if(m==30)
            time="half past "+tm[h];
        if(m==45)
            time="quarter to " +tm[h+1];
        if(m>0 && m<30 && m!=15)
            time=tm[m]+" minutes past " +tm[h];
        if(m>30 && m<60 && m!=45)
            time=tm[60-m]+" minutes to "+tm[h+1];
        
        System.out.println(time);
    }
}

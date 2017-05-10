import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = in.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
        int split=in.nextInt();
        if(split==sum/2)
            {
            System.out.println(arr[index]/2);
        }
        else{System.out.println("Bon Appetit");}
        
    }
}

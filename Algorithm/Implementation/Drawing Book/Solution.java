import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int res=0;
        int diff=n-p;
        if(diff==n/2)
            {res=(n-p)/2;}
        else if(diff>n/2)
            {
            if(p==1)
                {res=0;}
            else{res=p/2;}
        }
        else
        {
            if(n%2==0 && p%2!=0)
                {
                res=(n-p+1)/2;
                }
            else    
            res=(n-p)/2;    
        }
        return res;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}

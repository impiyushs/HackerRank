import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count=0;
            int n1=n;
            while (n > 0) 
            {
            int temp= n % 10;
                if(temp!=0 && n1%temp==0)
                    {
                        count++;
                    }
            n = n / 10;
            }
            System.out.println(count);
        }
    }
}

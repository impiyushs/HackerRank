import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger b= new BigInteger("1");
        while(n>1){
            b=b.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(b);
    }
}

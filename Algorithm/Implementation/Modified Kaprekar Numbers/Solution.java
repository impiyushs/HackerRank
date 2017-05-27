import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = p; i <= q; i++) {
            long sq = (long) i*i;
            int l = (Integer.toString(i)).length();
            int mod = (int) Math.pow(10, l);
            if (i == (sq/mod) + (sq%mod)) {
                a.add(i);
            }
        }
        if (a.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
        }
    }
}

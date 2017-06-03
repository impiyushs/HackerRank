import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int solution(int[] arr, int n){
            Arrays.sort(arr);
            int maxDistance = arr[0];
            for(int i = 1; i < arr.length; i++){
                int distance = (arr[i] - arr[i-1]) / 2;
                if(maxDistance < distance) 
                    maxDistance = distance;
            }
            int lastGap = (n-1) - arr[arr.length - 1];
            return (lastGap < maxDistance) ? maxDistance : lastGap;
       }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int x=solution(c,n);
        System.out.println(x);

    }
}

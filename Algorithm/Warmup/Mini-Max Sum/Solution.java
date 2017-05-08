import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        long min=0,max=0;
        for(int i=0;i<4;i++)
            {
            min=min+arr[i];
        }
        for(int i=arr.length-1;i>arr.length-5;i--)
        {
            max=max+arr[i];    
        }
        System.out.println(min+ " "+ max);
    }
}

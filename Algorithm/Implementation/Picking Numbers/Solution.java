import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    Arrays.sort(arr);
    int max = 0;
    for(int i=0;i<n-1;i++){
        if(Math.abs(arr[i]-arr[i+1])<=1){
            list.add(arr[i]);
            list.add(arr[i+1]);
            for(int j=i+2;j<n;j++){
                if(Math.abs(arr[i]-arr[j])<=1){
                    list.add(arr[j]);
                }else{
                    break;
                }
            }
            if(list.size()>max){
                max=list.size();
            }
            list.clear();
        }
    }
    System.out.println(max);
    }
}

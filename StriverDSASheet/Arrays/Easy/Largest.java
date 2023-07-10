import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int mx = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            mx = Math.max(mx, arr[i]);

        }

        return mx;

    }
}
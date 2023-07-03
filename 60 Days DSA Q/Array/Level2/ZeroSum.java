import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        
        int arr[] = {4, 2, -3, 1, 6};
        int n = arr.length;

        int target = 0;

        HashSet<Integer> set = new HashSet<Integer>();

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(arr[i]==0 || sum==0 || set.contains(sum)){
                System.out.println(true);
            }

            set.add(arr[i]);
        }

        System.out.println(false);
         
    }
}

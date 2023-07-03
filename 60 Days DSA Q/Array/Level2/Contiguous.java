import java.util.HashSet;

public class Contiguous {
    public static void main(String[] args) {
        
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;

        int currentSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
            if(currentSum<sum){
                currentSum = sum;
            }

            if (currentSum<0) currentSum = 0;
        }

        System.out.println(currentSum);

    }
}

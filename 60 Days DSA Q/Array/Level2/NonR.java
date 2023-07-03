
import java.util.*;

public class NonR {
    public static void main(String[] args) {
        
        int arr[] = {-1, 2, -1, 3, 0};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<n; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
                break;
            }
        }

        System.out.println(-1);
    }
}

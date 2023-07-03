
import java.util.*;

public class FirstRep {

    public static void main(String[] args) {
        
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;

        HashSet<Integer> set = new HashSet<Integer>();
        int last = -1;
        for(int i=n-1; i>=0; i--){
             if(set.contains(arr[i])){
                
                last = arr[i];
             } else {
                set.add(arr[i]);
             }
              
        }

        System.out.print(last);


    }
    
}

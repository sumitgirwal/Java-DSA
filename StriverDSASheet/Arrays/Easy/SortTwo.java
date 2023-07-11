package StriverDSASheet.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class SortTwo {
    public static void main(String[] args) {
        int a[] = {1,2,3,3};
        int b[] = {2,2,4};
        List<Integer> ans = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;

        int i=0;
        int j=0;    
        while(i<n1 && j<n2){

            if (a[i] <= b[j]) // Case 1 and 2
            {
              if (ans.size() == 0 || ans.get(ans.size()-1) != a[i])
                ans.add(a[i]);
              i++;
            } else // case 3
            {
              if (ans.size() == 0 || ans.get(ans.size()-1) != b[j])
                ans.add(b[j]);
              j++;
            }

        }


        
        while(i<n1){

            if (ans.get(ans.size()-1) != a[i]){
                ans.add(a[i]);     
            }
             i+=1;
         }

         while(j<n2){
            if (ans.get(ans.size()-1) != b[j]){
                ans.add(b[j]);     
            }
             j+=1;

         }
         System.out.println();
         for (int element : ans) {
            System.out.print(element+" ");
        }
    }
}

import java.util.*;

public class Solution {
	
	public static void merge(int arr[], int s, int e){
        // two first and second list
        int mid = s+(e-s)/2;
        int l1 = mid-s+1;
        int l2 = e-mid;

        // declaring two element
        int first[] = new int[l1];
        int second[] = new int[l2];

        // storing element l2 and l1
        int mainIndex = s;
        for(int i=0; i<l1; i++){
            first[i] = arr[mainIndex++];
        }

        mainIndex = mid+1;
        for(int i=0; i<l2; i++){
            second[i] = arr[mainIndex++];
        }

        // sorting first and second and restore
        int i=0; int j=0;
        mainIndex = s;
        while(i<l1 && j<l2){

            if(first[i]<second[j]){
                arr[mainIndex++] = first[i];
                i+=1;
            } else {
                arr[mainIndex++] = second[j];
                j+=1;
            }
        }

        while(i<l1){
            arr[mainIndex++] = first[i];
            i+=1;
        }

        while(j<l2){
            arr[mainIndex++] = second[j];
            j+=1;
        }
    }
	
	public static void mergeSort(int arr[], int s, int e){
	
		// if reaching end
		if(s>=e) return;

		// getting the pivot position
		int mid = s+(e-s)/2;

		// sorting left part
		mergeSort(arr, s, mid);
		
		// sorting right part
		mergeSort(arr, mid+1, e);

        // merge sort
        merge(arr, s, e);

}

	public static void main(String args[]){

        int arr[] = { 9,8,7,6,5,4 };
        int n = arr.length;

        mergeSort(arr, 0, n-1);

        for( int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }	

    }
}


// import java.util.*;

// public class Solution {
	
	 

// 	public static int getPivot(int arr[], int s, int e){

//         // set the start value as pivot 
//         int pivotIndex = s;

//         // count less values
//         int count = 0;
//         for(int i=s; i<=e; i++){
//             if(arr[i]<arr[pivotIndex]){
//                 count+=1;
//             }
//         }
	
//         // setting pivotIndex and swapping
//         int temp = arr[pivotIndex];
//         arr[pivotIndex] = arr[s+count];
//         arr[s+count] = temp;
//         pivotIndex = s+count;

//         // setting first and end pointer to swap greater values
//         int i=s; int j=e;
//         while(i<pivotIndex && j>pivotIndex){
            
//             while(arr[i]<arr[pivotIndex]){
//                 i+=1;
//             }

//             while(arr[j]>arr[pivotIndex]){
//                 j-=1;
//             }

//             if(i<pivotIndex && j>pivotIndex){
//                 // swap(&arr[i], &arr[j]);

//                 temp = arr[i];
//                 arr[i] = arr[j];
//                  arr[j] = temp;
//             }
//         }
        
//         return pivotIndex;

//     }
	
// 	public static void quickSort(int arr[], int s, int e){
	
// 		// if reaching end
// 		if(s>=e) return;

// 		// getting the pivot position
// 		int pivotIndex = getPivot(arr, s, e);

// 		// sorting left part
// 		quickSort(arr, s, pivotIndex-1);
		
// 		// sorting right part
// 		quickSort(arr, pivotIndex+1, e);

// }

// 	public static void main(String args[]){

//         int arr[] = { 9,8,7,6,5,4 };
//         int n = arr.length;

//         quickSort(arr, 0, n-1);

//         for( int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }	

//     }
// }



// class Solution {
//     public static int different(int num1, int num2){
//         if(num1<num2){
//             return num2-num1;
//         }
//         return num1-num2;
//     }
//     public static int twoSum(int[] nums, int target) {

//         Map<Integer, Integer> mp = new HashMap<>();

//         for(int i=0; i<nums.length; i++){
//             int diff = different(nums[i], target);
             
//             boolean isPresent = mp.containsKey(diff);
//             if(isPresent){
//                 mp.put(diff, mp.get(diff)+1);
//             }else{
//                 mp.put(diff, 1);
//             }
//         }
//         for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
//             int key = i.getKey();
//             int value = i.getValue();
//             System.out.println(key + "   " + value);
//         }
//         return 0;
//     }

//     public static void main(String args[]){
         
//         int[] arr = {2, 7, 11, 15};
//         int value = twoSum(arr, 9);
//         System.out.println(value);
//     }
// }
package StriverDSASheet.Arrays.Easy;

public class ShiftZero {
    
    public static void main(String[] args) {
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = arr.length;

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


        // swapint element with first 
        // int j=0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]!=0){
        //         arr[j]=arr[i];
        //         j+=1;
        //     }
        // }

        // // filling last zero elements    
        // while(j<n){
        //     arr[j]=0;
        //     j+=1;
            
        // }

        // leetcode
        int l = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l+=1;
            }
        }


        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }


}

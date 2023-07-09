package Arrays;

public class Pairs {

    public static void printArr(int arr[]){

        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void pairsArray(int arr[]){

        int tp = 0;
        System.out.println();

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                System.out.print("("+ arr[i] +","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }

        // formula: n*(n-1)/2  => 5*(4)/2 => 10
        System.out.println("Total Pairs: "+tp);
        
    }


    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        printArr(arr);
        pairsArray(arr);

    }
    
    
}

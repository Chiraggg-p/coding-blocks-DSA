import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    static void display(int []  arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    System.out.println();
}


    public static void main(String[] args) {
        int[] arr={9,8,7,5,6,45,1,2,3};
        // insertionSort(arr);
        Arrays.sort(arr); //in build function
        System.out.println(Arrays.binarySearch(arr, 5)); //in build function
        display(arr);
    }
}                                                                  

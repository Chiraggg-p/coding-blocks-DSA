public class array2 {

    // // return the sum if arr : 12345
    // static int sumArr(int[] arr) {
    //     // int arr[] = {1,2,3,4,5};
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++)
    //         sum += arr[i];
    //     return sum;
    // }

    // static int sumArrAB(int[] arr, int a, int b) {

    //     a = 1;
    //     b = 3;
    //     int sum = 0;
    //     for (int i = a; i <= b; i++) {
    //         sum += arr[i];
    //     }
    //     return sum;
    // }

    // // print reverse order : 5,4,3,2,1
    // static void printReverseArr(int[] arr) {
    //     for (int i = arr.length - 1; i >= 0; --i) {
    //         System.out.print(arr[i]+" ");                                                                                                                                                                                               ");
    //     }
    // }

    // static void swap(int[] arr ,int i, int j){
    //     int temp = arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
    // static void reverseUsingSwap(int[] arr){
    //     for(int i=0,j=arr.length-1;i<j;i++,j--){
    //         swap(arr,i,j);
    //     }
    // }

    //////Searching in array 

        //linear search Q- finding an element
        static boolean linearSearch(int [] arr,int n){
            for(int i=0;i<arr.length;i++){
                if(i==n)
                    return true;
             }
            return false;
        }

       //binary search 
       static boolean binarySearch(int[] arr , int n){
        int i =0; int j=arr.length-1;
        while (i<=j) {
            int mid = (i+j)/2;
            if(mid==n) return true;
            else if(mid<n) i=mid+1;
            else j=mid-1;  
        }
        return false;
       } 
       static boolean binarySearchAB(int[] arr , int n, int a, int b ){
        int j=b;
        for(int i=a;i<=b;i++){
            int mid = (i+j)/2;
            if(mid==n) return true;
            else if(mid<n) i=mid+1;
            else j=mid-1; 
        }  return false;
        // return false;

            //or another type

    // int i =a; int j= b;
    // while(i<=j){
    //     int mid = (i+j)/2;
    //     if(mid== n) return true;
    //     else if(n<mid) j=mid-1;
    //     else i=mid+1;
    // }
    //     return false;
}

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6,7,8,9,10 };
        // int n=7;
        // // System.out.println(sumArrAB(arr, 1, 3));
        // // printReverseArr(arr);
        // System.out.println(linearSearch(arr, 7));
        System.out.println(binarySearchAB(arr, 6, 3, 9));
    }
}
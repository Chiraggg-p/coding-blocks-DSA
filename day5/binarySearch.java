import java.util.Scanner;

public class binarySearch {
    static int BinarySearch(int [] arr , int num){
        int low =0 ; int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]== num)
            return mid;
            else if(arr[mid]<num){
            low = mid+1;
        }
        else 
         high=mid-1;

        }
        return -1;

    }

    //lowerbond 

    static int lowerBond(int []arr , int num){
        int firstOccurence=-1;
        int low = 0 ; int high=arr.length-1;int mid=0;
        
        while (low<=high) {
            mid=(low+high)/2;
            if(arr[mid]==num){
            firstOccurence=mid;
            high=mid-1;
        }
            else if(arr[mid]<num){
                low = mid+1;
            }
            else
            high = mid-1;
        }

        return firstOccurence;

    }

    //Upperbond

    static int upperBond(int []arr , int num){
        int low=0;int high=arr.length-1;int mid=0; int ans=-1;
        while (low<=high) {
            mid=(low+high)/2;
            if(arr[mid]==num){
                 ans=mid+1;
                 low=mid+1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    static int countOccurence(int [] arr , int num){
           
        int first = lowerBond(arr, num);
        if(first==-1) return 0;
        return upperBond(arr, num)-first;

    }
    public static void main(String[] args)
    {
        int[] arr={1,2,2,2,3,3,4,5,5,6,7,7,7,7,8,9,10,10,10};

        Scanner obj= new Scanner(System.in);
        System.err.println("enter the number you wanna search for !!");
        int num = obj.nextInt();
        
        //     System.out.println(BinarySearch(arr, 5));
        //     System.out.println(lowerBond(arr, 7));
               System.out.println(upperBond(arr,num));
    }
    
}
 
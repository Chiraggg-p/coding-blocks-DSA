
import java.util.*;

public class Arraylist {

    static ArrayList<Integer> findsubArray(int[] arr, int k) {
        int start = 0;
        int end = k - 1;
        int maxSum = 0;

        for (int i = 0; i < end; i++) {
            maxSum += arr[i];
            int currSum = maxSum;
            int index = 0;
            while (end < arr.length-1) {
                currSum -= arr[start];
                start++;
                end++;
                currSum += arr[end];
                if (currSum > maxSum) {
                    index = start;
                    maxSum = currSum;
                }
            }
        
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }
        return nums;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 50, 40, 30, 17 };
        nums=findsubArray(arr, 2);
        System.out.println(nums);

    }

}


import java.util.*;

public class Arraylist {

    static ArrayList<Integer> findsubArray(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        return list;

    }
    public static void main(String[] args) {
        int[] arr = { 10, 50, 40, 30, 17 };
        System.out.println(findsubArray(arr, 2));

    }
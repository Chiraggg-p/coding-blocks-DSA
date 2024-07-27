public class bubbleSort {
    public static void bubbleSorting(int [] arr){
        for(int turn =1 ; turn<arr.length ; turn++){
            for(int i=0; i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    static void display(int [] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {64,34,25,12,22,11,90};
        bubbleSorting(arr); 
        display(arr);

    }
}

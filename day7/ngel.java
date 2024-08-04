public class ngel {
    static int[] NGER(int[] arr){
        int maxElement=0;
        int[] NGER = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            NGER[i]=maxElement;
            maxElement=Math.max(maxElement,arr[i]);
            }
            return NGER;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 15, 7, 8};
            int[] result = NGER(arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
                }
        }
    }
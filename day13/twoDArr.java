public class twoDArr {
    static void populate(int[][] nums) {
        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = n;
                n++;
            }
        }
    }

    static int display(int [][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[0].length; j++) {
    System.out.print(nums[i][j] + " \t");
    sum += nums[i][j];
    }
    System.out.println();
    }
    return sum;
    }

    static int sumArr(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }
    static int[] search(int [][] nums2 , int n){
    
        int [] ans = new int[2];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[0].length; j++) {
                if(nums2[i][j]==n){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            
            }
        }
        return ans;
                
    }
    static void transposeArr (int [][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
                } 
        }

    }

    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        populate(nums);
        display(nums);
        System.out.println();
        transposeArr(nums);
        display(nums);
        // System.out.println(sumArr(nums));
        // System.out.println(search(nums, 5)[0] + " " + search(nums,
        // 5)[1]);
        
        
        // 2d arr
        // System.out.println(display(nums));
        // System.out.println(sumArr(nums));
        

        // int[][] nums = new int[3][4];
        // int [][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        // //one d arr

        // int [] oned = {1,5,9};
        // int [] arr = new int[5];
        // System.out.println(nums);
        // System.out.println(arr);
        // System.out.println(nums[2][3]);

        // 3d array

        // int[][][] threeDarr = new int[2][2][3];
        // System.out.println(threeDarr);

        // // linear search in 2d arr
        // int [][] nums2 = new int[3][3];
        // // int [] indeces = new int
        // System.out.println(search(nums2, 7));

    }

}

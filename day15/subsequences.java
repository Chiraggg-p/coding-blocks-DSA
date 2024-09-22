public class subsequences {
    // static void generateSubSequence(String ques, String ans) {
    //     if (ques.length() == 0) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     generateSubSequence(ques.substring(1), ans + ques.charAt(0));
    //     generateSubSequence(ques.substring(1), ans);

    // }
    // //count subseque 
    // static void generateSubSequence(String ques) {
    //     if (ques.length() == 0) {
    //         return 1;
    //     }
    //     int l =generateSubSequence(ques.substring(1), ans + ques.charAt(0));
    //     int r=generateSubSequence(ques.substring(1), ans);

    // }

    // // toss coin
    // static void tossCoin(String ans, int n) {
    //     if (n == 0) {
    //         System.out.println(ans);
    //         return;
    //     }
    //     tossCoin("H" + ans, n - 1);
    //     tossCoin("T" + ans, n - 1);
    // }

    // // count tosses
    // static int countTossCoin(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     int l = countTossCoin(n - 1);
    //     int r = countTossCoin(n - 1);
    //     return l+r;
    // }
     //genrate parantheesis
    static void parantheesis(int n , String par){
        if(n==0){
            System.out.println(par);
            return;
        }
        parantheesis(n-1, par+"{");
        parantheesis(n-1, par+"}");

    }
    public static void main(String[] args) {
                                                                    
        // String input = "abc";
        // System.out.println("All possible subsequences of '" + input + "':");
        // generateSubSequence(input, "");
        // }
        // toss coin
        
        // // tossCoin("", n);
        // System.out.print(countTossCoin(0));
        System.out.println(parantheesis(3, ""));
       

    }
}
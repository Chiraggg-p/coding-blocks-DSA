public class fibonacci {
//recurssion

    static int fibonacciSeries(int n){
        if (n==1) return 0;
        else if(n==2) return 1;
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

      public static void main(String[] args) {
        System.out.println(fibonacciSeries(8));

    }

}

public class BsSearchSpace {

    static boolean check(int speed , int dist , int maxTime){
        int distance_travelled = speed*maxTime;
        // if(distance_travelled>=dist) return true;
        // else return false;
        return distance_travelled>=dist;

    }
    static int bsSearchSp(int dis , int time ){
        int low =0,high =1000, mid=0,ans=0;
        while(low<=high){
            mid= high-(high-low)/2;
            if(check(mid, dis, time)){
                ans = mid;
                high = mid-1;
            }
            else low = mid +1;
        }
        return ans;
    }
         public static void main(String[] args) {
        int dis = 1000;
        int time = 100;
        System.out.println(bsSearchSp(dis, time));
    

  }
}

package arrays;

public class maximumsubarray {

    public int maxsub(int[]num){
        int n = num.length;
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i = 0;i<n;i++){
               currentsum += num[i];
               maxsum = Math.max(currentsum,maxsum);
               if(currentsum<0){
                   currentsum = 0;
               }
            }
//(edge cases or corner cases) we are checking currentsum after calculating maxsum because if there are all negative numbers in an array so our program should be able to calculate it rather then returning 0
        return maxsum;
    }

    public static void main(String[] args) {
        int [] arr = {-2,-3,-10,-2,-7,-4};
        maximumsubarray ob = new maximumsubarray();
       int result =  ob.maxsub(arr);
        System.out.println(result);
    }
}

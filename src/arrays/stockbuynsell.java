package arrays;

public class stockbuynsell {
    public int stockandbuy(int[]arr) {
        int n = arr.length;
        int mini_price = arr[0];
        int buy = 0 ;
        int sell = 0;
        int profit = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]<mini_price){
                mini_price = arr[i];
                buy = i;
            }else if(arr[i]-mini_price>profit){
                profit = arr[i]-mini_price;
                sell = arr[i];
            }
        }
return profit;
    }
    public static void main(String[] args) {
        stockbuynsell ob =  new stockbuynsell();
        int [] arr = {10,7,5,8,11,9};
        System.out.println(ob.stockandbuy(arr));
    }

}



// Brute force approach
//    int maxprofit = 0;
//    int n = arr.length;
//        for(int i = 0;i<n;i++){
//        for(int j = 1;j<n;j++){
//            int profit= arr[j]-arr[i];
//            maxprofit = Math.max(maxprofit,profit);
//        }
//
//    }
//        return maxprofit;
//}

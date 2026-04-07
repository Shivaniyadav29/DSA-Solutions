package arrays;

public class productofarray {


    public int[] productofarrayexcpetself(int[]arr){
        int n = arr.length;
        int [] answer = new int[n];
          answer[0] = 1;
        int suffix = 1;
       for(int i = 1;i<n;i++){
           answer[i] = answer[i-1]*arr[i-1];
       }

       for(int i = n-2;i>=0;i--){
           suffix *= arr[i+1];
           answer[i] *= suffix;
       }
      return answer;
    }

    public static void main(String[] args) {
        int [] arr =  {1,2,3,4};
            productofarray ob = new productofarray();
            int [] result = ob.productofarrayexcpetself(arr);

        for(int i = 0;i<result.length;i++){
            System.out.print(  result[i]+" ");
        }

    }





}

//Optimal Approach TC: O(3n) SC: 0(n)
//public int[] productofarrayexcpetself(int[]arr){
//    int n = arr.length;
//    int [] answer = new int[n];
//    int[]prefix =  new int[n];
//    prefix[0] = 1;
//    int[]suffix =  new int[n];
//    suffix[n-1] = 1;
//    for(int i = 1;i<n;i++){
//        prefix[i] =  prefix[i-1]*arr[i-1];
//    }
//
//    for(int i = n-2;i>=0;i--){
//        suffix[i] = suffix[i+1]*arr[i+1];
//    }
//
//    for(int i = 0;i<n;i++){
//        answer[i] = prefix[i]*suffix[i];
//    }
//
//    return answer;
//}











//Brute force Approach
//public int[] productofarrayexcpetself(int[]arr){
//    int n = arr.length;
//    int [] answer = new int[n];
//    for(int i = 0;i<n;i++){
//        answer[i] = 1;
//        for(int j = 0;j<n;j++){
//            if(i!=j){
//                answer[i] *= arr[j];
//            }
//
//        }
//
//    }
//    return answer;
//}
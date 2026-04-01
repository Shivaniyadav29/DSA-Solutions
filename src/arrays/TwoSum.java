package arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//        Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

 public int[] sum( int [] arr, int target){
     Map<Integer, Integer>map = new HashMap<>();
     for(int i = 0;i<arr.length;i++){
         int difference = target-arr[i];
         if(map.containsKey(difference)){
             return new int[]{map.get(difference),i};
         }
         map.put(arr[i],i);
     }
     return new int[]{};
 }


    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        TwoSum  ts = new TwoSum();
        int [] result = ts.sum(arr,target);
        System.out.println(Arrays.toString(result));
    }

}

//>>>>Brute Force Approach>>>>>>>>>>
//    int n = arr.length;
//    int sum = 0;
//     for(int i = 0;i<n;i++){
//        for(int j = 1;j<n;j++){
//            sum = arr[i]+arr[j];
//            if(sum==target){
//                return new int []{i,j};
//            }
//        }
//    }
//     return new int[]{-1,-1};
//}
// Time Complexcity : O(n2)
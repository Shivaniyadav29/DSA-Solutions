package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class MajorityElement {

    public int melement(int[]nums){
        int n = nums.length;
        int element = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if (nums[i] == element) {
                count++;
            }else{
                count--;
            }
        }
        int counter = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==element){
                counter++;
            }
            if(counter>(n/2)){
                return element;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
    MajorityElement ob = new MajorityElement();
    int [] nums = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
    System.out.println(ob.melement(nums));
}
}


// Better approach
// TC:O(n) SC:0(N)
//public int melement(int[]nums){
//    int n = nums.length;
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int num : nums){
//        map.put(num,map.getOrDefault(num,0)+1);
//        if(map.get(num)>n/2){
//            return num;
//        }
//    }
//    return -1;
//}

package arrays;


//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
//If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
//Input: arr[]=[1,1,2,2,2,3,3]
//Output: [1,2,3,_,_,_,_]
//Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

public class removeduplicate {

   public int rd(int[]arr){
       int n = arr.length;
       int i = 1;
       while(i<n){
           if(arr[i] == arr[i-1]){
               for(int j = i;j<n-1;j++){
                   arr[j] = arr[j+1];
               }
               n--;
           }else{
               i++;
           }
       }
       return n;
          }


    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        removeduplicate ob = new removeduplicate();
        System.out.println(ob.rd(arr));
    }



}

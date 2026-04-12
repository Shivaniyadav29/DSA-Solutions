package arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicateelement {
    public Set<Integer> dupelement(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,2,1};
        duplicateelement ds = new duplicateelement();
        System.out.println(ds.dupelement(arr));
    }


}

package String;

public class firstunique {

    public static int uniquecharacter(String s){
        int n = s.length();
        int [] frequency = new int[26];
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            frequency[c-'a']++;
        }
        for(int j = 0;j<n;j++){
          if( frequency[s.charAt(j)-'a'] == 1){
              return j;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(uniquecharacter("leetcode"));
    }


}


// brute force approach
//for(int i = 0;i<n;i++){
//            boolean isunique = true;
//            for(int j = 0;j<n;j++){
//              if(i!=j&&s.charAt(i)==s.charAt(j)){
//                  //so you are saying that first we will make sure that i and j are not the same index and if character at i == j then we will turn isunique variable to false 
//                  isunique = false;
//                  break;
//              }
//            }
//            if(isunique){
//                return i;
//            }
//        }
//        return -1;
//    }






package String;

public class validAnagram {

    public boolean anagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] frequecy = new int[26];
        for(int i = 0;i<s.length();i++){
            frequecy[s.charAt(i) - 'a']++ ;
        }
        for(int i = 0;i<t.length();i++){
            frequecy[t.charAt(i) - 'a']-- ;
        }
     for(int i = 0;i<26;i++){
         if(frequecy[i] !=0){
             return false;
         }
     }
     return true;

    }

    public static void main(String[] args) {
        validAnagram va = new validAnagram();
        String str1 = "listen";
        String str2 = "silent";
        if(va.anagram(str1,str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


}

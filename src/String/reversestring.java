package String;

public class reversestring {
        public String reverseWords(String s) {
            String []words = s.trim().split("\\s");
            String result = " ";
            for(int i = words.length-1;i>=0;i--){
                result += words[i];
                if(i != 0) result += " ";
            }
            return result;

        }

    public static void main(String[] args) {
        reversestring st = new reversestring();
        System.out.println(st.reverseWords("welcome to the jungle"));
    }

    }



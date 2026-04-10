package recursion;

public class printnvalues {


    public void printn(int n){
        if( n ==1){
            System.out.println(1);
            return; // if return statement is not written then it will give stackoverFlowError.
        }
        System.out.print(n + " ");

        printn(n-1);
    }

    public static void main(String[] args) {
        printnvalues pv = new printnvalues();
        pv.printn(4);
    }


}

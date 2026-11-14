package dsa.Recursion;

public class one_to_n {
    void one2n(int n){
        if(n<1){
            return;
        }
        one2n(n-1);
        System.out.println(n);
    }
    int nsum(int n,int sum){
        if(n<1){
            return sum;
        }
        return nsum(n-1,sum+n);


    }
    int factorial(int n){
        if(n==1){

        }
    }

    static void main() {
        one_to_n n=new one_to_n();
//        n.one2n(10);
        System.out.println(n.nsum(3,0));
    }

}

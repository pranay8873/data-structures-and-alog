package dsa.maths;

import java.util.Arrays;

public class Divisors {
        public int[] divisors(int n) {
            int[] divisiors=new int[n];
            int pos=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    divisiors[pos]=i;
                    pos++;
                }
            }
            return Arrays.copyOf(divisiors,pos);
        }

     void main() {
        System.out.println("ddivisors of 50 are : "+Arrays.toString(divisors(50)));
    }

}

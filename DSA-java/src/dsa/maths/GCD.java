package dsa.maths;

public class GCD {
        public int GCD1(int n1, int n2) {
            int lowest;
            int high;
            if(n1<n2){
                lowest=n1;
                high=n2;
            }
            else{
                lowest=n2;
                high=n1;
            }
            for(int i=high;i>=1;i--){
                if(high%i==0&&lowest%i==0){
                    return i;
                }

            }
            return 1;

        }

        public int GCD2(int n1, int n2) {
            int a=n1;
            int b=n2;
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;

        }



     void main() {
        int gcd=GCD1(10,20);
         System.out.println(gcd);
         int gcd2=GCD2(10,20);
         System.out.println("Gcd of 10 and 20 using euclidian algorithm : "+gcd2);

    }
}

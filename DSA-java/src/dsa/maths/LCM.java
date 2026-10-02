package dsa.maths;

public class LCM {
        public int LCM(int n1, int n2) {
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
            for(int i=1;i<=high;i++){
                int multiple=lowest*i;
                if(multiple%high==0){
                    return multiple;
                }

            }
            return lowest*high;

        }

     void main() {
        int lcm=LCM(4,6);
         System.out.println(lcm);
    }

}

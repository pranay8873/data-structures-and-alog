package dsa.hashing;

public class Hashing {

    int count_n(int num,int[] array){
        int count=0;
//        for (int i=0;i<array.length;i++){
//            if (array[i]==num){
//                count++;
//            }
//        }
          for(int i:array){
              if(i==num){
                  count++;
              }
          }
        return count;
    }




    void main(String[] args) {
        int number=1;
        int[] array={1,1,1,1,2,3,4,5};
        System.out.println(" count : "+count_n(number,array));

    }
}

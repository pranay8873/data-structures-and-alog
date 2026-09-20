package dsa.hashing;

import java.util.Arrays;
import java.util.Scanner;

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

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Elements of array : ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] hash=new int[13];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        System.out.println("Enter number of numbers to fetch : ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Number : ");
            int number= sc.nextInt();
            System.out.println("Times "+number+" Repeated : "+hash[number]);
            q--;
        }

        System.out.println("Your array is : "+ Arrays.toString(arr));
        System.out.println("Your hash array is : "+ Arrays.toString(hash));


    }



//
//    void main(String[] args) {
//        int number=1;
//        int[] array={1,1,1,1,2,3,4,5};
//        System.out.println(" count : "+count_n(number,array));
//
//    }
}

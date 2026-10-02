package dsa.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class number_hashing {
    static void main() {
        System.out.println("Enter size of array : ");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(array));
        int[] hash=new int[100000];
//        hash={0};
        for(int i=0;i<size;i++){
            hash[array[i]]+=1;
        }
        System.out.println("Enter number of numbers to fetch : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Number : ");
            int number= sc.nextInt();
            System.out.println(number+" appears "+hash[number]+" times in array.");
        }
    }
}

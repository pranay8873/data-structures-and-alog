package dsa.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
//    int[] reverse(int[] array){
//        int length=array.length;
//
//    }


    void main() {
        System.out.println("Enter no.of elements in array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter Elements of Array : ");
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array is : "+ Arrays.toString(array));
        void rev(int i){
            if(i>=n/2)
                return;
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-1-1]=temp;
            return rev(i+1);

        }
        rev(0);
        System.out.println(Arrays.toString(array));
    }
}

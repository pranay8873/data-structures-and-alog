package dsa.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
//    int[] reverse(int[] array){
//        int length=array.length;
//
//    }
        void rev(int[] array,int i){
            if(i>=array.length/2)
                return;
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
            rev(array,i+1);

        }


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

        rev(array,0);
        System.out.println(Arrays.toString(array));
    }
}

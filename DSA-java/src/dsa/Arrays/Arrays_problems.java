package dsa.Arrays;

import java.util.*;

public class Arrays_problems {
    static void Left_rot(int[] arr){
        int n=arr.length;
        int temp=arr[0];
//        int temp2=arr[1];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
//        arr[n-1]=temp2;
    }
    static void Left_rot_n(int[] arr,int n){
        int len=arr.length;
        int d=n%len;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for (int i=d;i<len;i++){
            arr[i-d]=arr[i];

        }
        int j=0;
        for (int i=len-d;i<len;i++){
            arr[i]=temp[j];
            j++;
        }


    }

    static void main() {
        int[] numbers={10,20,30,40,50,60};
        Left_rot_n(numbers,4);
        System.out.println(Arrays.toString(numbers));

    }
}

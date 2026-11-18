package dsa.Arrays;

import java.lang.reflect.Array;
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
//        int j=0;
        for (int i=len-d;i<len;i++){
//            arr[i]=temp[j];
            arr[i]=temp[i-(len-d)];

//            j++;
        }


    }
    static void Left_rot_n2(int[] arr,int len,int n){
        n=n%len;
        Reverse_Array(arr,0,len-n-1);
        Reverse_Array(arr,len-n,len-1);
        Reverse_Array(arr,0,len-1);
    }
    static void Reverse_Array(int[] arr,int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void move_Zeros_to_end(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int ind=0;
        for (int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[ind]=arr[i];
                ind++;
            }
        }
        while (ind<n){
            temp[ind]=0;
            ind++;
        }
        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    static void move_Zeros_to_end2(int[] arr){
        int j=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
    }
    static int[] union(int[] arr1,int[] arr2){
        Set<Integer> union=new TreeSet<>();
        for (int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        return union.stream().mapToInt(Integer::intValue).toArray();
    }

    static void main() {
        int[] numbers={10,20,30,40,50,60};
//        Left_rot_n(numbers,4);
        Left_rot_n2(numbers,numbers.length,305);
        System.out.println(Arrays.toString(numbers));
        int[] array={1,23,0,0,24,10,25,0,0,12};
        move_Zeros_to_end2(array);
        System.out.println("Moved zeros to end : "+Arrays.toString(array));
        System.out.println("union of "+Arrays.toString(numbers)+"& "+Arrays.toString(array)+" is "+Arrays.toString(union(numbers,array)));

    }
}

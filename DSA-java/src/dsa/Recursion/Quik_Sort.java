package dsa.Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quik_Sort {
    int quiksort(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while (i<=high&&arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot&&j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

            int temp=arr[j];
            arr[j]=arr[low];
            arr[low]=temp;
        return j;

    }


    void QS(int[] arr,int low,int high){
        if(low<high){
            int partition=quiksort(arr,low,high);
            QS(arr,low,partition-1);
            QS( arr,partition+1,high);

        }
    }

    static void main() {
        int[] arr={100,20,90,60,30,66,23,12};
        Quik_Sort qs=new Quik_Sort();
        qs.QS(arr,0,arr.length-1);
        System.out.println("Sorted array using quik sort : "+ Arrays.toString(arr));
    }

}

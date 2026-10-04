package dsa.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    int[] bubsorass(int[] array){
        int n=array.length;
        for(int i=n-1;i>=1;i--){
            for (int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    int[] bubsortdes(int[] array){
        int n=array.length;
        for(int i=n-1;i>=1;i--){
            for (int j=0;j<i;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    void main() {
     int[] array={10,20,50,70,15,5};
        System.out.println(Arrays.toString(bubsorass(array)));
        System.out.println(Arrays.toString(bubsortdes(array)));

    }
}

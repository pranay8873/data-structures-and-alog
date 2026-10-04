package dsa.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    int[] selsortass(int[] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[min])
                    min=j;
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;

        }
        return array;
    }
    int[] selsortdes(int[] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(array[j]>array[max])
                    max=j;
            }
            int temp=array[i];
            array[i]=array[max];
            array[max]=temp;

        }
        return array;
    }

    void main() {
     int[] array={1,10,20,3,5,500,15,0,2,5};
        System.out.println(Arrays.toString(selsortass(array)));
        System.out.println(Arrays.toString(selsortdes(array)));
    }
}

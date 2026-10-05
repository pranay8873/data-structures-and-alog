package dsa.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    int[] bubsorass(int[] array){
        int n=array.length;
        for(int i=n-1;i>=1;i--){
            int swap=0;
            for (int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=1;
                }

            }
            if(swap==0)
                break;
            System.out.println("runs");

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
     int[] array={10,30,20,40,50,60};
        System.out.println(Arrays.toString(bubsorass(array)));
        System.out.println(Arrays.toString(bubsortdes(array)));

    }
}

package dsa.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    int[] Insorass(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&array[j]<array[j-1]){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            };
        }
        return array;
    }
    int[] Insordes(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&array[j]>array[j-1]){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            };
        }
        return array;
    }

    void main() {
     int[] array={1,10,5,3,6,2,20};
        System.out.println("Accending order : "+Arrays.toString(Insorass(array)));
        System.out.println("Decending order : "+Arrays.toString(Insordes(array)));
    }
}

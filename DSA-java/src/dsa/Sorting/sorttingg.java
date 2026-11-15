package dsa.Sorting;

import java.util.Arrays;

public class sorttingg {
    int[] selection(int[] arr){
        int length=arr.length;
//        int[] sorted;
        for(int i=0;i<length;i++){
            int min=i;
            for(int j=i+1;j<length;j++){
                if(arr[j]<arr[min]){
                    min=j;                                        //best,avg,worst:- O(n^2)
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    int[] bubblesort(int[] arr){
        int length=arr.length;
        for(int i=length-1;i>=1;i--) {
            boolean swaped = false;
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){             //best :- O(n), avg,worst :- O(n^2)
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
            }
            if(!swaped){
                break;
            }
        }
        return arr;
    }
     int[] insertion(int[] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            int j=i;
            while (j>0&&arr[j-1]>arr[j]){                     //best:O(n),avg,worst:O(n^2)
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
     }
     void mergesort(int[] array,int low,int high){
        if(low>=high)
            return ;
        int mid=(low+high)/2;
        mergesort(array,low,mid);
        mergesort(array,mid+1,high);
        merge(array,low,mid,high);



     }
     void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid&&right<=high){
            if(arr[left]<arr[right]){
                temp[k]=arr[left];
                k++;
                left++;
            }else{
                temp[k]=arr[right];
                k++;
                right++;
            }
        }
        while(left<=mid){
            temp[k]=arr[left];
            k++;
            left++;
        }
        while(right<=high){
            temp[k]=arr[right];
            k++;
            right++;
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
//        return arr;
     }



    static void main() {
        sorttingg s=new sorttingg();
        int[] array={100,500,200,30,80,90};
//        System.out.println("selection sort : "+Arrays.toString(s.selection(array)));
//        System.out.println("bubble sort : "+Arrays.toString(s.bubblesort(array)));
//        System.out.println("Inssertion sort : "+Arrays.toString(s.selection(array)));
        s.mergesort(array,0,5);
        System.out.println("Merge sort : "+Arrays.toString(array));
    }
}

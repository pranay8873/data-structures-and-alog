
import java.util.Arrays;


public class Merge_Sort {
    void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Divide into two halves
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        // Merge the sorted halves
        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy merged result back into the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9, 1, 6};

        Merge_Sort obj = new Merge_Sort();
        obj.mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
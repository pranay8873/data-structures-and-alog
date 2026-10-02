package dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_hashing_using_map {
    static void main() {
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Map<Integer ,Integer> mpp=new HashMap<>();
        for (int i=0;i<size;i++){
//            mpp[array[i]]++;
            mpp.put(array[i], mpp.getOrDefault(array[i],0)+1);
        }

        System.out.println("Enter number of numbers to Fetch : ");
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Enter number : ");
            int number=sc.nextInt();
            System.out.println(number+" appears "+mpp.getOrDefault(number,0)+" times in array.");

        }


    }
}

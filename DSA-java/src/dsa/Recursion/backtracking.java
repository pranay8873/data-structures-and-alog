package dsa.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class backtracking {
    void one_to_n(int i,int n){
        if(i<1)
            return;
//        i--;
        one_to_n(i-1,n);
        System.out.println(i);
    }
    void n_to_one(int i,int n){
        if(i>=n)
            return;
        i++;
        n_to_one(i,n);
        System.out.println(i);

    }
    void sum_n(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum_n(i-1,sum+i);
    }

    int sum_n_fun(int n){
        if(n==0){
            return 0;
        }
        return n+sum_n_fun(n-1);
    }
    double factorial(int n){
        if(n==1)
         return n;
        return n*factorial(n-1);
    }
    int[] rev_array(int[] array,int i){
        int length=array.length;
//        int i=0;
        if(i>=length/2)
            return array;
        else {
            int temp=array[i];
            array[i]=array[length-i-1];
            array[length-i-1]=temp;
        }
        return rev_array(array,i+1);
    }
    int[] rev_array2(int[] array,int i,int n){
        if(i>(n-i-1)){
            return array;
        }
        int temp=array[i];
        array[i]=array[n-i-1];
        array[n-i-1]=temp;
        return rev_array2(array,i+1,array.length);
    }
    boolean palindrome_string(int i,char[] name){
        if(i>=name.length/2){
            return true;
        }

        if(name[i] != (name[name.length-i-1])){
            return false;
        }
        return palindrome_string(i+1,name);
    }
    int fibonaci_number(int n){
        if(n<=1) return n;

        return fibonaci_number(n-1)+fibonaci_number(n-2);
    }



    void main(){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int num= sc.nextInt();
//        one_to_n(num,num);
//        System.out.println("Enter number : ");
//        int num= sc.nextInt();
//        n_to_one(0,num);
//        sum_n(num,0);
//        int num2=sum_n_fun(num);
//        double num2=factorial(num);
//        System.out.println(num2);
//        System.out.println("Enter size of array : ");
//        int n= sc.nextInt();
//        int[] array=new int[n];
//        System.out.println("Enter Array elements");
//        for (int i=0;i<n;i++){
//            array[i]= sc.nextInt();
//        }
        

//        int[] numbers2=Arrays.copyOf(array,array.length);
//        for (int number :numbers){
//            System.out.println(number);
//        }
//        System.out.println(numbers.length);
//        int[] reversed_array=rev_array(numbers,0);
//         int[] reversed_array=rev_array2(array,0,array.length);
//        System.out.println("original array :"+ Arrays.toString(numbers2)+"\nreversed array : "+Arrays.toString(reversed_array));
//          System.out.println("Enter the String : ");
//          String name= sc.nextLine();
//          char[] name_arr=name.toCharArray();
//          boolean palindrome=palindrome_string(0,name_arr);
//          if(palindrome)
//              System.out.println("Given String is a palindrome");
//          else
//              System.out.println("Given String is not a palindrome");
//            sum_n_fun(5);
        System.out.println("Enter n for fibonaci series : ");
        int n=sc.nextInt();
//        int num=fibonaci_number(n,0,0);
//        System.out.println("fibonacci series upto "+n+"are : "+num);

//          fibonacci using for loop
//          int[] arr=new int[n];
//          arr[0]=0;
//          arr[1]=1;
//          for (int i=2;i<n;i++){
//              arr[i]=arr[i-1]+arr[i-2];
//          }
//        System.out.println(arr[n-1]);
        int n2=fibonaci_number(n);
        System.out.println(n2);

    }
}

package dsa.Recursion;

import java.util.Scanner;

public class n_times_name {
    void print_name(int i,int n,String name){
        if(i>n)
            return;
        System.out.println(name);
        print_name(i+1,n,name);
    }
    void n_numbers(int i,int n){
        if(i>n)
            return;
        System.out.println(i);
        i++;
        n_numbers(i,n);
    }
    void rev_numbers(int s,int e){
        if(s<e)
            return;
        System.out.println(s);
        s--;
        rev_numbers(s,e);
    }

    void main() {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Name : ");
//        String name= sc.next();
//        print_name(1,5,name);
//        System.out.println("Enter Number : ");
//        int number= sc.nextInt();
//        n_numbers(1,number);
          System.out.println("Enter staring Number : ");
          int start_number=sc.nextInt();
          System.out.println("Enter ending Number : ");
          int ending_number=sc.nextInt();

        rev_numbers(start_number,ending_number);
    }
}

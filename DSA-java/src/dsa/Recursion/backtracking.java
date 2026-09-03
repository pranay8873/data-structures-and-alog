package dsa.Recursion;

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
    void main(){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int num= sc.nextInt();
//        one_to_n(num,num);
        System.out.println("Enter number : ");
        int num= sc.nextInt();
        n_to_one(0,num);
    }
}

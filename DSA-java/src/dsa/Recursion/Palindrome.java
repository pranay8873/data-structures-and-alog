package dsa.Recursion;

import java.util.Scanner;

public class Palindrome {
    boolean pal(String str,int i){
        if(i>=str.length()/2)
            return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
            return false;
        return pal(str,i+1);
    }

     void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
//        char[] str=str;
        if(pal(str,0)){
            System.out.println(str+" is a palindrome.");
        }
        else {
            System.out.println(str+" Is not a palindrome");
        }
    }

}

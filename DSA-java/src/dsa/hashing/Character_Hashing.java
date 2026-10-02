package dsa.hashing;

import java.util.Scanner;

public class Character_Hashing {
    //FOR 26 SIZED ARRAY
//    static void main() {
//        String s;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter string : ");
//        s= sc.nextLine();
//        int[] hash=new int[26];
//        for(int i=0;i<s.length();i++){
//            hash[s.charAt(i)-'a']++;
//        }
//        System.out.println("Enter number of letters to fetch : ");
//        int n= sc.nextInt();
//        for (int i=0;i<n;i++){
//            System.out.println("Enter character : ");
//            char ch=sc.next().charAt(0);
//            System.out.println(ch+" appeared "+hash[ch-'a']+" times in the given string");
//
//        }
//    }
    // IF SIZE IS NOT MATTERED
    static void main() {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        s= sc.nextLine();
        int[] hash=new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        System.out.println("Enter number of letters to fetch : ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Enter character : ");
            String input= sc.nextLine();;
            char ch=input.charAt(0);
            System.out.println(ch+" appeared "+hash[ch]+" times in the given string");

        }
    }
}

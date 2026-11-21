package fundamentals.abstraction.exceptionhandling;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int a=sc.nextInt();
        try {
            int b=10/a;
        } catch (ArithmeticException e) {
            System.out.println("Arthemetic exc occured "+e);
        } catch (Exception e) {
            System.out.println("internal error occured");
        }
        finally {
            System.out.println("Completed execution...:-)");
        }
        System.out.println("Enter another number : ");
        int c= sc.nextInt();
        System.out.println("Enter name ");
        String name=null;
        try {
            try {
                System.out.println("name is "+name);
            }catch (NullPointerException e){
                System.out.println("exception occured "+e);
            }

            try {
                System.out.println("50 divided by number gives : "+50/c);

            }catch (ArithmeticException e){
                System.out.println("Error occured : "+e);
            }
        } catch (Exception e) {
            System.out.println("Internal error");
        }
    }
}

package fundamentals.abstraction.exceptionhandling;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        try {
            int b=10/a;
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Completed execution...:-)");
        }
    }
}

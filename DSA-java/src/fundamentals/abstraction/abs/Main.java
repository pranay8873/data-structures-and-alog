package fundamentals.abstraction.abs;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        int id= sc.nextInt();
        System.out.println("Enter name : ");
        String name=sc.next();
        System.out.println("Enter amount : ");
        float amount= sc.nextFloat();
        System.out.println("Enter your choice \n1.cash\n2.Credit Card");
        int choice=sc.nextInt();
        PAYMENT p;
        switch (choice){
            case 1:
                p=new Cash(id,amount,name);
                p.pay();
                break;
            case 2:
                p=new Credit_Card_Payment(id,amount,name);
                p.pay();
                break;
            default:
                System.out.println("Invalid choice retry...:-(");
        }

    }
}

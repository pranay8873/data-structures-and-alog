package fundamentals.abstraction.collections.Lists;

import fundamentals.abstraction.collections.sets.product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Product_List {
    static void main() {
//        List<product> products=new ArrayList<product>();
        List<product> products=new LinkedList<>();

        product p1=new product();
        p1.setId(10);
        p1.setName("x apple ipad");
        p1.setCost(150000);
        product p2=new product();
        p2.setId(20);
        p2.setName("apple pod");
        p2.setCost(1500);
        product p3=new product();
        p3.setId(30);
        p3.setName("y apple macbook");
        p3.setCost(1500000);
        products.add(p1);
        products.addAll(List.of(p1,p2,p3));
        System.out.println(products.toString());
        System.out.println(products.size());
//        System.out.println(products(2));?


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of names : ");
//        int n= sc.nextInt();
//        while(n>0){
//            names.add
//        }


    }
}

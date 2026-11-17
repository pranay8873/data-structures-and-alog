package fundamentals.abstraction.collections.maps;

import fundamentals.abstraction.collections.sets.product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Product_Map {
    static void main() {
//        HashMap<Integer, product> products=new HashMap<>();
//        LinkedHashMap<Integer, product> products=new LinkedHashMap<>();
        TreeMap<Integer, product> products=new TreeMap<>();
        product p1=new product();
        p1.setId(100);
        p1.setName("x apple ipad");
        p1.setCost(150000);
        product p2=new product();
        p2.setId(10);
        p2.setName("apple pod");
        p2.setCost(1500);
        product p3=new product();
        p3.setId(40);
        p3.setName("y apple macbook");
        p3.setCost(1500000);
        product p4=new product();
        p4.setId(30);
        p4.setName("xyz apple macbook");
        p4.setCost(100);
        products.put(p1.getId(),p1);
        products.put(p2.getId(),p2);
        products.put(p3.getId(),p3);
        products.put(p4.getId(),p4);
        products.put(p2.getId(),p2);

        System.out.println(products.entrySet());
        System.out.println(products.keySet());
    }
}

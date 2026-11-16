package fundamentals.abstraction.collections.sets;

import java.util.*;

public class Sets {


    static void main() {
//        Set products=new HashSet<>();
//        Set products=new LinkedHashSet();
        Set<product> products=new TreeSet<>();
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
        products.add(p3);
        products.add(p2);
        System.out.println(products);
        Iterator<product> itr=products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Set<Integer> ids=new HashSet<>();
        ids.add(p1.getId());
        ids.add(p2.getId());
        ids.add(p3.getId());
        System.out.println(ids.contains(10));
        System.out.println(ids.size());
    }
}

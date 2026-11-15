package fundamentals.abstraction.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class product{
    int id;
    String name;
    float cost;

}
class customer{
    int id;
    String name;
    String gender;

}
public class Sets {


    static void main() {
        Set products=new HashSet<>();
        product p1=new product();
        p1.id=10;
        p1.name="apple ipad";
        p1.cost=150000;
        product p2=new product();
        p2.id=20;
        p2.name="apple pod";
        p2.cost=1500;
        product p3=new product();
        p3.id=30;
        p3.name="apple macbook";
        p3.cost=1500000;
        products.add(p1.name);
        products.add(p3.name);
        products.add(p2.name);
        System.out.println(products);
        Iterator<product> itr=products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Set<Integer> ids=new HashSet<>();
        ids.add(p1.id);
        ids.add(p2.id);
        ids.add(p3.id);
        System.out.println(ids.contains(10));
        System.out.println(ids.size());
    }
}

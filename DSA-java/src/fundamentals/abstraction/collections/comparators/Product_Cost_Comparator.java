package fundamentals.abstraction.collections.comparators;

import fundamentals.abstraction.collections.sets.product;

import java.util.Comparator;

public class Product_Cost_Comparator implements Comparator<product> {
    @Override
    public int compare(product o1, product o2) {
        return (int) (o1.getCost()- o2.getCost());
    }
}

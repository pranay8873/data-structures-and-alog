package fundamentals.abstraction.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    static void main() throws IOException {
        List<Product> products;
        ReadCSV csv=new ReadCSV();
        products=csv.getProducts();
        List<Product> filteredProducts=new ArrayList<>();
        for (Product product : products ){
            if(product.getMaxRetailPrice()>=50000){
                filteredProducts.add(product);
            }
        }
        List<Product> productsstream=products.stream().filter(Product->Product.getMaxRetailPrice()>=50000).toList();
        for (Product product:filteredProducts){
            System.out.println(product);
        }
        System.out.println("------------------------------------------------------------------------\n-------------------------------------------------------------------");
        for (Product product:filteredProducts){
            System.out.println(product);
        }

    }
}

package fundamentals.abstraction.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        List<String> productnames=new ArrayList<>();
        productnames=products.stream().map(Product::getName).toList();
        for (String name:productnames){
            System.out.println(name);
        }
//        Product p2=Product::new;
        Predicate<Product> isExpensive=product -> product.getMaxRetailPrice()>80000;
        for (Product pr:products){
            System.out.println(pr.getName()+" isExpensive : "+isExpensive.test(pr));
        }
        Consumer<Product> prname=product -> System.out.println("name of product : "+product.getName());
        for (Product pr:products){
            prname.accept(pr);
        }
        Function<Product, Double> getprice= Product::getMaxRetailPrice;
        Map<String,Long> ProductCatagory=products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
        System.out.println(ProductCatagory);
        Map<String,List<String>> namesByCategory=products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(Product::getName,Collectors.toList())));



    }
}

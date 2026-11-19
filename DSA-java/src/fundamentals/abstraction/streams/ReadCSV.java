package fundamentals.abstraction.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public List<Product> getProducts() throws IOException {
        File file = new File("C:/pranay d drive/dsa/DSA-java/src/fundamentals/abstraction/streams/products.csv");
        BufferedReader bf=new BufferedReader(new FileReader(file));
        bf.readLine();
        String productdata=bf.readLine();
        List<Product> products=new ArrayList<>();
        while (productdata!=null){
            Product product = getProduct(productdata);
            products.add(product);
            productdata=bf.readLine();
        }
        return products;
    }

    private static Product getProduct(String productdata) {
        String[] data= productdata.split(",");
        Product product=new Product();
        product.setId(Integer.parseInt(data[0]));
        product.setName(data[1]);
        product.setMaxRetailPrice(Double.parseDouble(data[2]));
        product.setDiscount(Integer.parseInt(data[3]));
        product.setAvailable(Boolean.parseBoolean(data[4]));
        product.setCompany(data[5]);
        product.setCategory(data[6]);
        product.setManufacturedYear(Integer.parseInt(data[7]));
        return product;
    }

}

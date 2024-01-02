package FutureJava8;

import CreateList.CategoryProduct;
import CreateList.Product;
import CreateList.TypeProduct;

import java.util.Optional;

public class TestFlatMap {


    public static void main(String[] args) {
       Optional<Product> product = Optional.of(new Product(1,
               Optional.of(new CategoryProduct(1,
                       Optional.of(new TypeProduct(123, null, "test")), "address")),
               "code", "Test", 1.0));

         Optional<String> name = product.flatMap(Product::getCategoryProduct)
                 .flatMap(CategoryProduct::getTypeProduct)
                 .flatMap(TypeProduct::getName);



         System.out.println(name);
    }
}

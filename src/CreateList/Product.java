package CreateList;

import java.util.Optional;

public class Product {

    private int id;

    private Optional<CategoryProduct> categoryProduct;

    private String code;

    private String name;

    private double price;

    public Product(int id, Optional<CategoryProduct> categoryProduct, String code, String name, double price) {
        this.id = id;
        this.categoryProduct = categoryProduct;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Optional<CategoryProduct> getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(Optional<CategoryProduct> categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", categoryProduct=" + categoryProduct +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

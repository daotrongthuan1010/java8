package Test;

import java.time.LocalDateTime;

public class Product {

    private int id;

    private String name;

    private Float price;

    private String category;

    private LocalDateTime timeBuy;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getTimeBuy() {
        return timeBuy;
    }

    public void setTimeBuy(LocalDateTime timeBuy) {
        this.timeBuy = timeBuy;
    }

    public Product() {
    }

    public Product(int id, String name, Float price, String category, LocalDateTime timeBuy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.timeBuy = timeBuy;
    }

    @Override
    public String toString() {
        return "Product[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", timeBuy=" + timeBuy +
                ']';
    }
}

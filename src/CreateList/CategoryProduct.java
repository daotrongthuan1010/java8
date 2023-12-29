package CreateList;

import java.util.Optional;

public class CategoryProduct {
    private int code;

    private Optional<TypeProduct> typeProduct;

    private String description;

    public CategoryProduct(int code, Optional<TypeProduct> typeProduct, String description) {
        this.code = code;
        this.typeProduct = typeProduct;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Optional<TypeProduct> getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(Optional<TypeProduct> typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CategoryProduct{" +
                "code=" + code +
                ", typeProduct=" + typeProduct +
                ", description='" + description + '\'' +
                '}';
    }
}

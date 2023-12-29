package CreateList;

import java.util.Optional;

public class TypeProduct {

    private int code;

    private Optional<String> name;

    private String description;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeProduct(int code, Optional<String> name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TypeProduct{" +
                "code=" + code +
                ", name=" + name +
                ", description='" + description + '\'' +
                '}';
    }
}

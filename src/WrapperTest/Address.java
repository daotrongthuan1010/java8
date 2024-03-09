package WrapperTest;

public class Address {
    private String name;

    private String id;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address(String name, String id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

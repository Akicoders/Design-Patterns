package utp.edu.pe.Creacionales.ModernPrototype;

public class Product implements IPrototype {
    private String name;
    private String description;
    private double price;
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;

    }

    @Override
    public IPrototype Clone() {
        Product clone = new Product(this.name, this.description, this.price);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        return Clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))
                + "Product: " +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

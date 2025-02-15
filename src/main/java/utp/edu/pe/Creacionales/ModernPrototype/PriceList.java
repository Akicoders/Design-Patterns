package utp.edu.pe.Creacionales.ModernPrototype;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements IPrototype{
    private String name;
    private List<Product> products = new ArrayList<>();

    @Override
    public IPrototype Clone() {
        PriceList priceList = new PriceList(name);
        priceList.setProducts(products);
        return priceList;
    }

    @Override
    public IPrototype deepClone() {
        PriceList priceList = new PriceList(name);
        List<Product> priceLists = new ArrayList<>();
        products.forEach(product -> {
            Product cloneProduct = (Product) product.Clone();
            priceLists.add(cloneProduct);
        });
        priceList.setProducts(priceLists);
        return priceList;
    }

    public PriceList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return  Integer.toHexString(System.identityHashCode(this)) +
                "PriceList:" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

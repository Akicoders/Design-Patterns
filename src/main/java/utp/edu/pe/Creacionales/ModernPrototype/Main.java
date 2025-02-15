package utp.edu.pe.Creacionales.ModernPrototype;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PriceList priceList = new PriceList("VIP");
        PriceList priceList2 = new PriceList("NORMAL");
        PriceList priceList3 = new PriceList("DEV"); //joke

        Product vino = new Product("Vino Morado", "Vinito morado de VIP", 192.00);
        Product con = new Product("Con", "Pa el 14 crack", 10);
        Product agua = new Product("Aguita de Limon", "Pa que te hidrate", 2);
        Product cafe = new Product("Café Premium", "Despierta con energía", 15);
        Product galletas = new Product("Galletas Choco", "Con chispas de chocolate", 5);
        Product jugo = new Product("Jugo de Mango", "100% natural y sin azúcar", 8);
        Product pizza = new Product("Pizza Pepperoni", "Con extra queso", 25);
        Product helado = new Product("Helado de Fresa", "Refrescante y cremoso", 12);
        Product pan = new Product("Pan Integral", "Saludable y delicioso", 6);
        Product queso = new Product("Queso Manchego", "Curado y con mucho sabor", 18);
        Product pollo = new Product("Pollo Asado", "Bien doradito y jugoso", 30);
        Product arroz = new Product("Arroz Basmati", "Aromático y suelto", 7);
        Product chorizo = new Product("Chorizo Español", "Con especias auténticas", 20);
        Product empanadas = new Product("Empanadas Argentinas", "Rellenas de carne", 9);
        Product torta = new Product("Torta Tres Leches", "Esponjosa y dulce", 15);
        Product sushi = new Product("Sushi Variado", "Con salmón y aguacate", 28);
        Product cerveza = new Product("Cerveza Artesanal", "Fresca y con buen cuerpo", 14);
        Product refresco = new Product("Refresco Cola", "Burbujeante y dulce", 3);
        Product chocolate = new Product("Chocolate Amargo", "Con 80% cacao", 10);
        Product miel = new Product("Miel Orgánica", "Directo del panal", 12);

        ArrayList<Product> productsVIP = new ArrayList<>();
        ArrayList<Product> productsNormal = new ArrayList<>();
        ArrayList<Product> productsDev = new ArrayList<>();

        productsVIP.add(chocolate);
        productsVIP.add(vino);
        productsVIP.add(chorizo);
        productsVIP.add(empanadas);
        productsVIP.add(torta);
        productsVIP.add(sushi);
        productsVIP.add(cerveza);
        productsNormal.add(miel);
        productsNormal.add(con);
        productsNormal.add(queso);
        productsNormal.add(refresco);
        productsNormal.add(pollo);
        productsNormal.add(arroz);
        productsDev.add(agua);
        productsDev.add(cafe);
        productsDev.add(galletas);
        productsDev.add(jugo);
        productsDev.add(pizza);
        productsDev.add(helado);
        productsDev.add(pan);

        priceList.setProducts(productsVIP);
        priceList2.setProducts(productsNormal);
        priceList3.setProducts(productsDev);

        System.out.println(arroz.toString());
        System.out.println(arroz.Clone().toString());

        System.out.println(priceList3);
        System.out.println( priceList3.deepClone().toString());


    }
}

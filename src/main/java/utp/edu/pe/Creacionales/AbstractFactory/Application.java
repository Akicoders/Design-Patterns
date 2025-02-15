package utp.edu.pe.Creacionales.AbstractFactory;

public class Application {
    private GUIFactory guiFactory;
    private Cap cap;
    private Tshirt tshirt;
    private Pants pants;

    public Application(GUIFactory factory) {
        this.guiFactory = factory;
        this.cap = guiFactory.createCap();
        System.out.println(cap.marca());
        System.out.println( cap.color());
        System.out.println(cap.nombre());
        System.out.println(cap.curvada());
        this.tshirt = guiFactory.createTshirt();
        System.out.println(tshirt.color());
        System.out.println(tshirt.forma());
        System.out.println(tshirt.logo());
        this.pants = guiFactory.createPants();
        System.out.println(pants.color());
        System.out.println(pants.colocarLogo());
        System.out.println(pants.colocarNombre());

    }
    public static void main(String[] args) {

        System.out.println("Bienvenido a la tienda x regalona, te vamos a regalar un conjunto por tener un sistema operativo");
        String os = System.getProperty("os.name");
        GUIFactory factory;
        Application app;
        if (os.contains("Windows")) {
            factory = new WinFactory();
            app = new Application(factory);
        }
        if (os.contains("Mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        }

    }


}

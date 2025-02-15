package utp.edu.pe.Creacionales.AbstractFactory;

public class MacFactory implements  GUIFactory{
    @Override
    public Cap createCap() {
      return new MacCap();
    }

    @Override
    public Pants createPants() {
        return new MacPants();
    }

    @Override
    public Tshirt createTshirt() {
        return new MacTShirt();
    }
}

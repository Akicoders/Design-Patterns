package utp.edu.pe.Creacionales.AbstractFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Cap createCap() {
        return new WinCap();
    }

    @Override
    public Pants createPants() {
        return new WinPants();
    }

    @Override
    public Tshirt createTshirt() {
        return new WinTShirt();
    }
}

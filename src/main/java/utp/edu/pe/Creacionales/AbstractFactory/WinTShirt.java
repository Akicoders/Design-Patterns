package utp.edu.pe.Creacionales.AbstractFactory;

public class WinTShirt implements  Tshirt{
    @Override
    public String color() {
        return "BLACK NEON ";
    }

    @Override
    public String forma() {
        return "CURVADA COMO VENTANA MODERNA";
    }

    @Override
    public Boolean logo() {
        return true;
    }
}

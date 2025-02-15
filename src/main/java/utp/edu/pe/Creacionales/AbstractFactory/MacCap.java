package utp.edu.pe.Creacionales.AbstractFactory;

public class MacCap implements Cap{
    @Override
    public String nombre() {
        return "MAP CAP PRO MAX";
    }

    @Override
    public Boolean marca() {
        return true;
    }

    @Override
    public String color() {
        return "WHITE";
    }

    @Override
    public Boolean curvada() {
        return false;
    }
}

package utp.edu.pe.Creacionales.AbstractFactory;

public class WinCap implements Cap{

    @Override
    public String nombre() {
        return "Windows Cap GOD ";
    }

    @Override
    public Boolean marca() {
        return true;
    }

    @Override
    public String color() {
        return "Amarilla, azul, roja";
    }

    @Override
    public Boolean curvada() {
        return true;
    }
}

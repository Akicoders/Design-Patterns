package utp.edu.pe.Creacionales.AbstractFactory;

public class WinPants implements  Pants{

    @Override
    public String color() {
        return "Amarillo con rojo y azul";
    }

    @Override
    public String colocarNombre() {
        return "WINCAP AMERICA";
    }

    @Override
    public String colocarLogo() {
        return "WIN CAP X EVER";
    }
}

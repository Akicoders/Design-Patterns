package utp.edu.pe.Creacionales.FactoryMethod;

public class Avion implements Vehiculo{
    public String nombre = "Avion";
    @Override
    public void arrancar() {
        System.out.println("Arrancando Avion");
    }

    @Override
    public void parar() {
        System.out.println("Parando Avion");
    }
}

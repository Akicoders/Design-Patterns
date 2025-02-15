package utp.edu.pe.Creacionales.FactoryMethod;

public class Camion implements Vehiculo{
    public String nombre = "Camion";
    public String getNombre() {
        return nombre;
    }
    @Override
    public void arrancar() {
        System.out.println("Camion arrancado");
    }

    @Override
    public void parar() {
        System.out.println("Camion parar");
    }
}

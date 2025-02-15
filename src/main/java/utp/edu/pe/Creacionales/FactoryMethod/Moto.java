package utp.edu.pe.Creacionales.FactoryMethod;

public class Moto implements Vehiculo{
    public String nombre = "Moto";

    public String getNombre() {
        return nombre;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando Moto");
    }

    @Override
    public void parar() {
        System.out.println("Parando Moto");
    }
}

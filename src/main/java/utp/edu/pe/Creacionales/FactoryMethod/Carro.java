package utp.edu.pe.Creacionales.FactoryMethod;

public class Carro implements Vehiculo{
    public String nombre = "Carro";
    public String getNombre() {
        return nombre;
    }
    @Override
    public void arrancar() {
        System.out.println("Arrancando carro");
    }
    @Override
    public void parar() {
        System.out.println("Parando carro");
    }
}

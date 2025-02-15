package utp.edu.pe.Creacionales.FactoryMethod;

public class LogisticaMoto extends Logistica{
    @Override
    public Vehiculo crearTransporte() {
        return new Moto();
    }
}

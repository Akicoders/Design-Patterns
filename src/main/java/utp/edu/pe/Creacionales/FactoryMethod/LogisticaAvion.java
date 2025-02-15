package utp.edu.pe.Creacionales.FactoryMethod;

public class LogisticaAvion extends Logistica{
    @Override
    public Vehiculo crearTransporte() {
        return new Avion();
    }
}

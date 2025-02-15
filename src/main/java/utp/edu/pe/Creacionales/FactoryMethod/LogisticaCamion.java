package utp.edu.pe.Creacionales.FactoryMethod;

public class LogisticaCamion extends Logistica{
    @Override
    public Vehiculo crearTransporte() {
        return new Camion();
    }
}

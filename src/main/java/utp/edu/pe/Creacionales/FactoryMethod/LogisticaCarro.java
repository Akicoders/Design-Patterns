package utp.edu.pe.Creacionales.FactoryMethod;

public class LogisticaCarro extends Logistica {
    @Override
    public Vehiculo crearTransporte() {
        return new Carro();
    }
}

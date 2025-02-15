package utp.edu.pe.Creacionales.FactoryMethod;

public abstract class Logistica {
    public void Acciones(){
        Vehiculo vehiculo = crearTransporte();
        vehiculo.arrancar();
        vehiculo.parar();
    }

    public abstract Vehiculo crearTransporte();
}
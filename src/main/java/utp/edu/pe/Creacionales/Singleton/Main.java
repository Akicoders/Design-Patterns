package utp.edu.pe.Creacionales.Singleton;

public class Main {
    public static void main(String[] args) {
       //Probar aqui, no eliminar nada que no este adentro de aca
        //Prueba de conexion
        Database.getInstance();
        Database.getInstance().query("Select * from productos");

        // Respuesta esperada:  Conexion exitosa! Fecha y hora del servidor....

    }
}

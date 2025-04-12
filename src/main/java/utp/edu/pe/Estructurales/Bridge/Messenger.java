package utp.edu.pe.Estructurales.Bridge;

public class Messenger implements Remitente {

    @Override
    public void enviar(String Mensaje) {
        System.out.println("Enviado de Menssenger: " + Mensaje);
    }

    
}

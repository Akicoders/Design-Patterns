package utp.edu.pe.Estructurales.Bridge;

public class Whatsaap implements Remitente  {

    @Override
    public void enviar(String Mensaje) {
        System.out.println("Enviado de Whatsapp: " + Mensaje);
        
    }
    
}

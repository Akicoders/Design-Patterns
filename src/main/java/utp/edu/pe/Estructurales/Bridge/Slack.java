package utp.edu.pe.Estructurales.Bridge;

public class Slack implements Remitente {

    @Override
    public void enviar(String Mensaje) {
        System.out.println("Enviado de Slack: " + Mensaje);        
    }
    
}

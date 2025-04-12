package utp.edu.pe.Estructurales.Bridge;

public class Recordatorio extends TipoMensaje {

    public Recordatorio(Remitente remitente){
        super(remitente);
    }
    
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Recordatorio: " + mensaje);
    }
    
    
}

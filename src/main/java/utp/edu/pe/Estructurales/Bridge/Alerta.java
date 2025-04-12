package utp.edu.pe.Estructurales.Bridge;

public class Alerta extends TipoMensaje {

    public Alerta(Remitente remitente){
        super(remitente);
    }
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("WIUIWUWIUWIWUWIUWIWUWI ALERTAAAAAAAAAAA!!: " + mensaje);
    }
   

    
}

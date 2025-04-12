package utp.edu.pe.Estructurales.Bridge;

public class Promo extends TipoMensaje{

    public Promo(Remitente remitente) {
        super(remitente);
    }

    @Override
    public void enviar(String mensaje) {
       System.out.println("PROMOCION UNICA POR TIEMPO LIMITADOOOO!!!!: " + mensaje + "!!!!"); 
    }
    
}

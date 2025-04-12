package utp.edu.pe.Estructurales.Bridge;

public abstract class TipoMensaje  {
    protected Remitente mensaje;

    public TipoMensaje(Remitente mensaje) {
        this.mensaje = mensaje;
    }

    abstract public void enviar(String mensaje);
    
}

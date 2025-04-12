package utp.edu.pe.Estructurales.Bridge;
//Abstracción: Message (Alerta, Promoción, Recordatorio)
// Implementación: MessageSender (WhatsAppSender, EmailSender, SlackSender)



public class main {

    public static void main(String[] args) {
        Remitente slack = new Slack();
        Remitente whatsapp = new Whatsaap();
    
        TipoMensaje alert = new Alerta(slack);
        alert.enviar("Reunion caída");
    
        TipoMensaje promo = new Promo(whatsapp);
        promo.enviar("50% de descuento en tu próxima compra en Akicoders");
    }
   

}       

package tests;


import clases.EmailNotification;
import clases.Notification;
import clases.PushNotification;
import clases.SmsNotification;

public class Test {

    public static void main(String[] args) {
        // EmailNotification e = new EmailNotification("a@a.com", "b","c");
        // System.out.println(e.toString());

        // SmsNotification s = new SmsNotification("5483749582", "Soy un sms de un sony ericson<3");
        // System.out.println(s.toString());

        // PushNotification p = new PushNotification("a", "Soy una push notification");
        // System.out.println(p.toString());


        Notification[] notifications = {
            new EmailNotification("alex@gmail.com", "Recibo de pago", "Aquí tiene su recibo de pago"),
            new SmsNotification("6221232432", "Registra tu celular antes de la fecha límite"),
            new EmailNotification("brayan@outlook.com", "Registro exitoso", "Gracias por registrarte en nuestra página"),
            new SmsNotification("6352313243", "Su saldo se ha agotado"),
            new SmsNotification("6321495145", "Su tarjeta no cuenta con los fondos disponibles para hacer la compra"),
            new SmsNotification("6321495145", "Su mensaje no pudo ser enviado con éxito"),
            new PushNotification("acxwp132", "Has recibido una nueva solicitud de amistad")};
        
        int emailsCount = 0;
        int smsCount = 0;
        int pushCount = 0;

        
        for (Notification notification : notifications) {

            switch (notification) {
                case EmailNotification email -> emailsCount++;
                case SmsNotification sms -> smsCount++;
                case PushNotification push -> pushCount++;
            }
            
        }




    }

}

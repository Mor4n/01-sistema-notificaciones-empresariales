package clases;

public record SmsNotification(String number, String message) implements Notification{


    public SmsNotification{

        if(number == null || message == null){
            throw new IllegalArgumentException("Ningún campo debe ser null, por favor, llene el number y message correctamente");
        }
        
        if(number.length()!=10){
            throw new IllegalArgumentException("El número de teléfono ingresado debe de ser de 10 dígitos");
        }
        if(message.isBlank()){
            throw new IllegalArgumentException("El contenido del mensaje SMS es obligatorio y no puede estar en blanco");
        }

        if (!number.matches("^[0-9]{10}$")){

            throw new IllegalArgumentException("El número de teléfono ingresado inválido, verifique que sean sólo números y que sean 10 dígitos");

        }


    }
}

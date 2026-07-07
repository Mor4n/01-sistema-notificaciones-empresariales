package clases;

public record PushNotification(String deviceToken, String message) implements Notification {


    public PushNotification{

        if(deviceToken == null || message == null){
            throw new IllegalArgumentException("Ningún campo debe ser null, por favor, llene el deviceToken y message correctamente");
        }

        if(deviceToken.isBlank()){
            throw new IllegalArgumentException("El token del dispositivo es obligatorio y no puede estar en blanco");
        }

        if(message.isBlank()){
            throw new IllegalArgumentException("El contenido del push notification es obligatorio y no puede estar en blanco");
        }




    }



}

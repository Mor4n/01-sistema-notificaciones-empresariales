package clases;

public record EmailNotification(String email, String subject, String content) implements Notification{


    public EmailNotification{

        if(email == null || subject == null || content == null){
            throw new IllegalArgumentException("Ningún campo debe ser null, por favor, llene el email, subject y content correctamnte");
        }

        if(email.isBlank()){
            throw new IllegalArgumentException("El correo electrónico no puede estar en blanco");
        }
        
        if(subject.isBlank()){
            throw new IllegalArgumentException("El asunto del correo es obligatorio y no puede estar en blanco");
        }
        if(content.isBlank()){
            throw new IllegalArgumentException("El contenido del correo es obligatorio y no puede estar en blanco");
        }

        if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")){

            throw new IllegalArgumentException("El email ingresado es inválido");

        }

    }

}

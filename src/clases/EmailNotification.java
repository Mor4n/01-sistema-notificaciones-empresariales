package clases;

public record EmailNotification(String email, String subject, String content) implements Notification{


}

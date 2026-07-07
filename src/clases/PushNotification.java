package clases;

public record PushNotification(String deviceToken, String message) implements Notification {

}

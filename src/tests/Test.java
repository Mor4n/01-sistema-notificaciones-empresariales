package tests;

import clases.EmailNotification;
import clases.SmsNotification;

public class Test {

    public static void main(String[] args) {
        // EmailNotification e = new EmailNotification("a@a.com", "b","c");
        // System.out.println(e.toString());

        SmsNotification s = new SmsNotification("5483749582", "Soy un sms de un sony ericson<3");
        System.out.println(s.toString());
    }

}

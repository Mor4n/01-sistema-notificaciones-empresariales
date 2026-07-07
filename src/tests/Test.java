package tests;

import clases.EmailNotification;

public class Test {

    public static void main(String[] args) {
        EmailNotification e = new EmailNotification("a@a.com","a","xd");
        System.out.println(e.toString());
    }

}

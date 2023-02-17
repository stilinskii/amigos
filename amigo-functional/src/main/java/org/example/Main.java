package org.example;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");\
//        EmailSender emailSender = new Gmail();
//        emailSender.send();

//        EmailSender amigosCodeSender = new EmailSender() {
//            @Override
//            public void send() {
//                System.out.println("Send email using Amigoscode");
//            }
//        };

//        EmailSender amigosCodeSender = () -> System.out.println("Send email using Amigoscode");
//        //구현해야하는 메서드가 1개가 넘어가면 이렇게 못씀.
//
//        amigosCodeSender.send();

        EmailSender gmail = (from,to) -> {
            System.out.println("Sending email using gmail");
            return false;
        };

        EmailSender hotmail = (from,to) -> {
            //logic
            //var isValid : boolean = from.contains("@");
            System.out.println("Sending email using hotmail");
            return true;
        };

        boolean wasEmailSent = gmail.send("hello@amigoscode.com", "alex@amigoscode.com");
        boolean send1 = hotmail.send("hello@amigoscode.com", "minny@amigoscode.com");

        System.out.println(wasEmailSent);


        //forEach

        List<String> names = List.of("Jamila", "Alex", "Mariam");



        Consumer<String> stringConsumer = name -> System.out.println(name);
        names.forEach(stringConsumer);
        names.forEach(name -> {
            System.out.println(name);
//            name.contains("1");
        });
        names.forEach(System.out::println);

        names.stream().map(name -> name.getBytes());


    }
}
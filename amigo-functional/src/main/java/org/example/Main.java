package org.example;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        Consumer<String> stringConsumerMethodReference = System.out::println;
        names.forEach(stringConsumer);
        names.forEach(name -> {
            System.out.println(name);
//            name.contains("1");
        });
        names.forEach(System.out::println);

        names.stream().map(name -> name.getBytes());


        System.out.println(incrementByOneFunc.apply(1));
        List.of(1,2,3).forEach(Main::incrementByOne);

        List<Integer> integers = List.of(1, 2, 3)
                .stream()
                .map(Main::incrementByOne)
                .collect(Collectors.toList());

        System.out.println(integers);


        System.out.println("[Chaining Functions]");
        Function<Integer, Integer> combinedFunction = incrementByOneFunc.andThen(doubleFunc);
        System.out.println(combinedFunction.apply(1));
        System.out.println(incrementByOneFunc.andThen(doubleFunc).apply(1));
    }



    static Function<Integer, Integer> incrementByOneFunc =
            n -> n + 1;

    static Function<Integer, Integer> doubleFunc =
            n -> n * 2;

    static int incrementByOne(int n){
        return n + 1;
    }


//    record Person(String name,int age);
    static BiFunction<String, Integer, String> messageFunc;
}
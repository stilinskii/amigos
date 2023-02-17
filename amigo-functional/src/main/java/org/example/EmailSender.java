package org.example;

@FunctionalInterface //you r not allowed to add more methods because it is going to be used in lambdas
public interface EmailSender {
    boolean send(String from, String to);
    //only one abstract method

    String bar = "Bar";
    default void foo(){
    }
}

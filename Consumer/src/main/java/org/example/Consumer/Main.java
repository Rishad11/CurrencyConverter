package org.example.Consumer;

import org.example.service.Greeting;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Greeting> loader = ServiceLoader.load(Greeting.class);
        for (Greeting greeting : loader) {
            System.out.println(greeting.greet("Rishad"));
        }
    }
}

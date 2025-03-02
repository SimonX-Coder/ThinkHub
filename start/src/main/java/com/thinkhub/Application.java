package com.thinkhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author SimonX
 */
@SpringBootApplication(scanBasePackages = {"com.thinkhub"}, exclude = {SecurityAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("  _______ _     _       _    _    _       _ ");
        System.out.println(" |__   __| |   (_)     | |  | |  | |     | |");
        System.out.println("    | |  | |__  _ _ __ | | _| |__| |_   _| |");
        System.out.println("    | |  | '_ \\| | '_ \\| |/ /  __  | | | | '_ \\");
        System.out.println("    | |  | | | | | | | |   <| |  | | |_| | |_) |");
        System.out.println("    |_|  |_| |_|_|_| |_|_|\\_\\_|  |_|\\__,_|_.__/");
        System.out.println("Welcome to ThinkHub!");
    }
}
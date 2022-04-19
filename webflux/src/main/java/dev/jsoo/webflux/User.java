package dev.jsoo.webflux;

public class User {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
        this.message = "hello " + name;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}

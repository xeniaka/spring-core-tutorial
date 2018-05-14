package config;

public class Hello {
    private String greeting;
    private String subject;

    public Hello(String greeting, String subject) {
        System.out.println("---------------> New Instance");
        this.greeting = greeting;
        this.subject = subject;
    }

    public void sayHi() {
        System.out.println(greeting + ", " + subject);
    }
}

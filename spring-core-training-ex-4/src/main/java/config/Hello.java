package config;

public class Hello {
    private String greeting;
    private String subject;

    public Hello(String greeting, String subject) {
        this.greeting = greeting;
        this.subject = subject;
    }

    public void sayHi() {
        System.out.println(greeting + ", " + subject);
    }
}

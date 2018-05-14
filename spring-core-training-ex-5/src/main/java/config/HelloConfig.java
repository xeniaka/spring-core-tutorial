package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application-${spring.active.profiles}.properties")
public class HelloConfig {

    @Value("${greeting}")
    private String greet;

    @Value("${subject}")
    private String subject;

    @Bean
    public Hello greetingText() {
        return new Hello(greet, subject);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello = context.getBean(Hello.class);
        hello.sayHi();
    }
}

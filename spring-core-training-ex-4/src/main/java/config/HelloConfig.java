package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class HelloConfig {

    @Value("${greeting}")
    private String greet;

    @Bean
    @Profile("dev")
    public Hello greetingTextForDev() {
        return new Hello(greet, "Developers");
    }

    @Bean
    @Profile("prod")
    public Hello greetingTextForProd() {
        return new Hello(greet, "Producers");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello = context.getBean(Hello.class);
        hello.sayHi();
    }
}

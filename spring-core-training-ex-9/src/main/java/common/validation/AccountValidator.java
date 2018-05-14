package common.validation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AccountValidator {
    public AccountValidator() {
        System.out.println("Bean instantiated");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized");
    }
}

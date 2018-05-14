package common.config;

import common.dao.AccountDao;
import common.service.AccountService;
import common.service.AccountServiceImpl;
import common.validation.AccountValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataConfig.class)
public class AppConfig {

    @Bean
    public AccountService accountService(AccountValidator accountValidator, AccountDao accountDao) {
        return new AccountServiceImpl(accountValidator, accountDao);
    }

    @Bean
    public AccountValidator accountValidator() {
        return new AccountValidator();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println(accountService == null ? "NULL" : "SUCCESSFULLY CREATED");
    }

}

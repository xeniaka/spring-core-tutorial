package wipro.common.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wipro.common.dao.AccountDao;
import wipro.common.dao.AccountDaoImpl;
import wipro.common.service.AccountService;
import wipro.common.service.AccountServiceImpl;
import wipro.common.validation.AccountValidator;

@Configuration
public class AppConfig {

    @Bean
    public AccountService accountService(AccountValidator accountValidator, AccountDao accountDao) {
        return new AccountServiceImpl(accountValidator, accountDao);
    }

    @Bean
    public AccountValidator accountValidator() {
        return new AccountValidator();
    }

    @Bean
    public AccountDao accountDao() {
        return new AccountDaoImpl();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println(accountService == null ? "NULL" : "SUCCESSFULLY CREATED");
    }

}

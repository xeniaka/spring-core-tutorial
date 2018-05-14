package common.config;

import common.dao.AccountDao;
import common.dao.AccountDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public AccountDao accountDao() {
        return new AccountDaoImpl();
    }

}

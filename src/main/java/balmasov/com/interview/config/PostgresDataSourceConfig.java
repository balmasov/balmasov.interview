package balmasov.com.interview.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.Resource;

//@Configuration
public class PostgresDataSourceConfig {

//    @Resource
//    private ConfigurableEnvironment environment;

//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
//    public HikariDataSource dataSource() {
//        return buildBaseDataSource();
//    }
//
//    @Bean
//    @FlywayDataSource
//    public HikariDataSource flywayDataSource() {
//        final HikariDataSource dataSource = buildBaseDataSource();
//        dataSource.setPoolName("interview-flyway-pool");
//        dataSource.setMaximumPoolSize(1);
//        dataSource.setMinimumIdle(1);
//        dataSource.setRegisterMbeans(false);
//        return dataSource;
//    }
//
//    private HikariDataSource buildBaseDataSource() {
//        final HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setJdbcUrl(environment.getProperty("spring.datasource.hikari.jdbc-url"));
//        dataSource.setUsername(environment.getProperty("spring.datasource.hikari.username"));
//        dataSource.setPassword(environment.getProperty("spring.datasource.hikari.password"));
//        return dataSource;
//    }
}

package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.repository.UserRepo;
import com.fundamentos.springboot.fundamentos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Slf4j
@Configuration
public class GeneralConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/jpa_app")
                .username("root")
                .password("admin123");
        log.info("entrando al mentodo dataSource"+dataSourceBuilder);
        return dataSourceBuilder.build();
    }

}

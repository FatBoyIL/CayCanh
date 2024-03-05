package com.example.tree.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Dataconfig {
    @Bean
    public DataSource Dataconfig() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3309/caycanh");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("123456");
        return dataSourceBuilder.build();
    }
}

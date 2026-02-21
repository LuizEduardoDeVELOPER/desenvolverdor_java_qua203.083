package com.login.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration

public class DataConfig {
private DriverManagerDataSource dataSource;


@Bean
    public DataSource dataSource () {
    DriverManagerDataSource DriverManagerDataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc.mysql://localhost:3306/db_login");
    dataSource.setUsername("root");
    dataSource.setPassword("");

    return dataSource;

    }


    @Bean
    public JpaVendorAdapter jpaVendorAdapter () {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        return adapter;

    }
}

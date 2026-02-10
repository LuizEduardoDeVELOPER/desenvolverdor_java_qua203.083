package com.login.app;

import javax.sql.DataSource;

import org.hibernate.Hibernate;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class Dataconfig {

    @Bean
    public DataSource







    @Bean
    public JpaVendorAdapter jpaVendorAdapter (){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        adapter.setDatabase(Database,MYSQL);
        adapter.setShowSql(true);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
    }
    
}

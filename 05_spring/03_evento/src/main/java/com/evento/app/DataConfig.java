package com.evento.app;


import javax.sql.DataSource;

import org.springframework.orm.jpa.vendor.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration

public class DataConfig {

@Bean
public DataSource dataSource() {

DriverManagerDataSource dataSource = new DriverManagerDataSource();
dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
dataSource.setUrl("jdbc:mysql://localhost:3306/db_eventos");
dataSource.setUsername("root");
dataSource.setPassword("");

return dataSource();

}

/**
 * @return
 */
@Bean
public JpaVendorAdapter jpaVendorAdapter (){
HibernateJpavendoadapter();

Object adpter;
((Object) adpter).setDatabase(Database.MYSQL);
adpter.seShowsql.(true);
adpter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
adpter.setPrepareConnection(true);

return adapter;


}

private void HibernateJpavendoadapter() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'HibernateJpavendoadapter'");
}




}

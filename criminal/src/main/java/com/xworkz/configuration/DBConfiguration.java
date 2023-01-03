package com.xworkz.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration 
{
        public DBConfiguration() {
			System.out.println("created dbconfiguration ");
		}

		
		@Bean
		public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {
			LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
			factoryBean.setPackagesToScan("com.xworkz");
			factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
			System.out.println("getting datasource from spring ");
			factoryBean.setDataSource(dataSource);

			Map<String, Object> jpaproperties = new HashMap<String, Object>();
			jpaproperties.put("hibernate.show_sql", true);

			factoryBean.setJpaPropertyMap(jpaproperties);
			return factoryBean;
		}



		@Bean
		public DataSource datasource() {
			System.out.println("created datasource");
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/xworkz");
			dataSource.setPassword("Rajini@123456789");
			dataSource.setUsername("root");
			return dataSource;
		}

	}


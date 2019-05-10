package com.springdataexample.springdatapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"com.springdataexample", "com.springdataexample.services"})
@ComponentScan("com.springdataexample")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })

@SpringBootApplication
@EnableJpaRepositories("com.springdataexample.repositories")
public class SpringdatapracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatapracticeApplication.class, args);
	}

}

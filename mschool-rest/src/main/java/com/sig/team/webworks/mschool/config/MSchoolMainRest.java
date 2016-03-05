package com.sig.team.webworks.mschool.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sig.team.webworks.mschool.BasePackage;

@SpringBootApplication
@EntityScan("com.sig.team.webworks.ekirana")
@EnableJpaRepositories("com.sig.team.webworks.ekirana.crud.repository")
@ComponentScan(basePackageClasses = BasePackage.class)
@PropertySource("classpath:db.properties")
@ImportResource({ "classpath:applicationContext.xml", "applicationContext-mail.xml" })
public class MSchoolMainRest {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "mschool-rest");
		SpringApplication.run(MSchoolMainRest.class, args);
	}

}

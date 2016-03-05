package com.sig.team.webworks.matrimonial.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

import com.sig.team.webworks.matrimonial.RestBasePackage;
import com.sig.team.webworks.matrimonial.crud.entity.EntiryBasePackage;
import com.sig.team.webworks.matrimonial.crud.repository.RepositoryBasePackage;

@SpringBootApplication
@EntityScan(basePackageClasses = EntiryBasePackage.class)
@EnableJpaRepositories(basePackageClasses = RepositoryBasePackage.class)
@ComponentScan(basePackageClasses = RestBasePackage.class)
@PropertySource("classpath:db.properties")
@ImportResource({ "classpath:applicationContext.xml", "applicationContext-mail.xml" })
@RestController
public class MatrimonialMainRest {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "matrimonial-rest");
		SpringApplication.run(MatrimonialMainRest.class, args);
	}
}

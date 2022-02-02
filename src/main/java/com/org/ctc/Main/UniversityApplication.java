package com.org.ctc.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.org.ctc.Controllers.UniversityController;

@SpringBootApplication
@EntityScan(basePackages = {"com.org.ctc.Models"})
@ComponentScan(basePackages ={"com.org.ctc.Controllers,com.org.ctc.Services"})
@EnableJpaRepositories(basePackages={"com.org.ctc.Repositeries"})
public class UniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

}

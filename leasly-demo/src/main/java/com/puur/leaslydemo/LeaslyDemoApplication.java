package com.puur.leaslydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.puur.leaslydemo.repositories.ApartmentsRepository;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

@ComponentScan(basePackages = {"com.puur.leaslydemo"})
public class LeaslyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaslyDemoApplication.class, args);
	}

	@Autowired
	private ApartmentsRepository apartmentsRepository;

}

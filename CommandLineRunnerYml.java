package com.webservice.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class CommandLineRunnerYml {
	@SpringBootApplication
	public static class MyApplication implements CommandLineRunner {

	    @Autowired
	    private YAMLConfig myConfig;

	    public static void main(String[] args) {
	        SpringApplication app = new SpringApplication(MyApplication.class);
	        app.run();
	    }

	    public void run(String... args) throws Exception {
	        System.out.println("using location: " + myConfig.getLocation());
	        System.out.println("name: " + myConfig.getName());
	        
	    }
	}

}

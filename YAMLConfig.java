package com.webservice.employee;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


	@Configuration
	@EnableConfigurationProperties
	@ConfigurationProperties
	public class YAMLConfig {
	 
	    private String name;
	    private String location;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	   



}

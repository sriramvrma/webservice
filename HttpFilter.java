package com.webservice.employee;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@Validated
	public class HttpFilter {
	
		
		@PostMapping("/employee/")
		ResponseEntity<String> employee(@RequestHeader("client_id")@Min(8) @Max(8) char value) {
		    System.out.println("Header client_id = "+ value);
			return ResponseEntity.ok("header read sucessfully");
		}
	}


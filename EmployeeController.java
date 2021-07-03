package com.webservice.employee;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String employee()
	{
		return "employee.jsp";
	}
	
	@PostMapping(path="/Employee",consumes= {"application/json"})
	public String addEmployee(@RequestBody Employee employee) {
		
		repo.save(employee);
		return "employee";
		}
	@DeleteMapping("/employee/{employee_nbr}")
	public String deleteEmployee(@PathVariable int employee_nbr)
	{
	    Employee e = repo.getOne(employee_nbr);
	    return "deleted";
	}
	 
	@PutMapping(path="/Employee",consumes= {"application/json"})
	public String saveOrUpdateEmployee(@RequestBody Employee employee) {
		
		repo.save(employee);
		return "employee";
		}
	
	@GetMapping(path="/employees")
	public List<Employee> getEmployee()
	{
		return (List<Employee>) repo.findAll();
	}
	
	@RequestMapping("/employee/{employee_nbr}")
	public Optional<Employee> getEmployee(@PathVariable("employee_nbr") int employee_nbr)
	{
		return repo.findById(employee_nbr);
	}
  
}

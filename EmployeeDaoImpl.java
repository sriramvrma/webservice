package com.webservice.employee;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl {

	

	public class EmployeeDAOImpl implements EmployeeDaoJdbc {
	  private JdbcTemplate jdbcTemplate;  
	  final String INSERT_QUERY = "insert into employee"
	  		+ " (employee_first_name,"
	  		+ "employee_last_name, "
	  		+ " employee_nbr,"
	  		+ " yearofbirth,"
	  		+ " projectid"
	  		+ ") values (?, ?)";
	  final String UPDATE_QUERY = "update employee set employee_first_name = ? where employee_nbr = ?";
	  final String UPDATE_QUERY1 = "update employee set employee_last_name = ? where employee_nbr = ?";
	  final String UPDATE_QUERY2 = "update employee set yearofbirth = ? where employee_nbr = ?";
	  final String UPDATE_QUERY3 = "update employee set projectid = ? where employee_nbr = ?";
	  
	  final String DELETE_QUERY = "delete from employee where employee_nbr = ?";

	  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	  }

	  public int save(Employee employee) {
	    return jdbcTemplate.update(INSERT_QUERY, employee.getEmployee_first_name(), employee.getEmployee_nbr());   
	  }

	  public void update(Employee employee) {
	    int status = jdbcTemplate.update(UPDATE_QUERY, employee.getEmployee_first_name(), 
	      employee.getEmployee_nbr()); 
	    if(status != 0){
	      System.out.println("Employee data updated for ID " + employee.getEmployee_nbr());
	    }else{
	      System.out.println("No Employee found with ID " + employee.getEmployee_nbr());
	    }       
	  }

	  public void deleteEmpById(int employee_nbr) {
	    int status = jdbcTemplate.update(DELETE_QUERY, employee_nbr);
	    if(status != 0){
	      System.out.println("Employee data deleted for ID " + employee_nbr);
	    }else{
	      System.out.println("No Employee found with ID " + employee_nbr);
	    }
	  }
	}
}

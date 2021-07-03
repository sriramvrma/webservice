package com.webservice.employee;


public interface EmployeeDaoJdbc {
	
	 public int save(Employee employee);
	 
	 public void update(Employee employee);
	 
	 public void deleteEmpById(int employee_nbr);


}

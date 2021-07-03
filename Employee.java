package com.webservice.employee;




import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;



public class Employee {

	
	    @NotNull(message="First name cannot be Empty")
	   private String employee_first_name;
	    @NotNull(message="Last name cannot be Empty")
	    private String employee_last_name;
	    @Id
	     private int employee_nbr;
	    @Size(min=1900,max=2999)
	    private int yearofbirth;
	   
		@Size(max=10)
	    private int projectid;
	   
	    
	    
		
		@Override
		public String toString() {
			return "Employee [employee_first_name=" + employee_first_name + ", employee_last_name=" + employee_last_name
					+ ", employee_nbr=" + employee_nbr + ", yearofbirth=" + yearofbirth + ", projectid=" + projectid
					+ ", ]";
		}
		public Employee(String employee_first_name, String employee_last_name, int employee_nbr, int birthDate,
				int projectid, String employeelocation, @Size(min = 1900, max = 2999) int yearofbirth) {
			super();
			this.employee_first_name = employee_first_name;
			this.employee_last_name = employee_last_name;
			this.employee_nbr = employee_nbr;
			this.yearofbirth = yearofbirth;
			this.projectid = projectid;
		
		}
		public Employee() {
			// TODO Auto-generated constructor stub
		}
		public String getEmployee_first_name() {
			return employee_first_name;
		}
		public void setEmployee_first_name(String employee_first_name) {
			this.employee_first_name = employee_first_name;
		}
		public String getEmployee_last_name() {
			return employee_last_name;
		}
		public void setEmployee_last_name(String employee_last_name) {
			this.employee_last_name = employee_last_name;
		}
		public int getEmployee_nbr() {
			return employee_nbr;
		}
		public void setEmployee_nbr(int employee_nbr) {
			this.employee_nbr = employee_nbr;
		}
		 public int getYearofbirth() {
				return yearofbirth;
			}
			public void setYearofbirth(int yearofbirth) {
				this.yearofbirth = yearofbirth;
			}
		
		public int getProjectid() {
			return projectid;
		}
		public void setProjectid(int projectid) {
			this.projectid = projectid;
		}
	
	    

}

CREATE TABLE Employee (
                       employee_first_name varchar(255) NOT NULL,
                       employee_last_name varchar(255) NOT NULL,
                       employee_nbr int NOT NULL PRIMARY KEY,
                       yearofbirth int NOT NULL,
                        projectid int NOT NULL,);
                        
 INSERT INTO Employee (employee_first_name,employee_last_name, employee_nbr, yearofbirth, projectid )
              VALUES('sriram','varma','1767787','1999','4444');
    
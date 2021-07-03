# webservice

#this is a Beta Version and contains some errors in service and Controller Classes 
#there is a completed version and will update it soon........



the following are done within this :

• API consumes request in json must have following attribute ( validation needs to done using annotation )

o Employee First Name (Validation Mandatory)

• Employee Last Name (Optional Attribute)

o Employee Nbr ( Number)

o Year of birth ( max 2999 & min 1900)

o Project ID (max 10 char string)

o Location (let say CHENNAI, MUMBAI, DELHI ) read this value from application.yaml (you can skip annotation-based validation for this attribute alone, throw 400 error if failed)

Also,

* GET - to get details using employee number

* POST - to save details to

Database

* DELETE to delete record in

database 
* PUT to update the record

• Add HTTP Filter to validate request header must contain "client-id" attribute and must equal to 8 char alphanumeric 

• Print the incoming request using logger in controller layer ( should be in json format)

• Create table in H2 to save above attributes (primary key employee number)

Using Spring JDBC (or) JPA insert/update/delete record (also used CRUD this is just for understaing)

• Write @ExceptionHandling to print message in log in case of any exception/error




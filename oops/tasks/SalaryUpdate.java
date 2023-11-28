package oops.tasks;
class EmployeeAccount{
	private String name;
	private String jobTitle;
	private double salary;
	EmployeeAccount(String name,String jobtitle,double salary){
		this.name=name;
		this.jobTitle=jobtitle;
		this.salary=salary;
	}
	//getter =>Read
	//setter=Write
	//getter and setter 
	String getName() { //ReadOnly
		return name;
	}
	void setName(String name) {
		this.name=name;//WriteOnly
	}
	String getJobTitle() {
		return jobTitle;
	}
	void setJobTitle(String job) {
		this.jobTitle=job;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary=salary;
	}
	public void raiseSalary(double percentage) {
		salary=salary+salary*percentage/100;
	}
	void empDetails() {
		System.out.println("Name :"+name);
		System.out.println("JobTitle :"+jobTitle);
		System.out.println("Salary :"+salary);
	}
}
public class SalaryUpdate {
	public static void main(String[] args) {
      EmployeeAccount emp=new EmployeeAccount("Saravanan","SofteWereEnginer",10000);
      emp.empDetails();
		
		 System.out.println("After Raining employee Salary "); emp.raiseSalary(8);
		 System.out.println("%8 for Saravanan"); emp.empDetails();
		
	}
}

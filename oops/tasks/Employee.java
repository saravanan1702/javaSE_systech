package oops.tasks;

import java.time.LocalDate;
import java.time.Period;

class Office{
	private String name;
	private double salary;
	private LocalDate hireDate;
	Office(String name,double salary,LocalDate hireDate){
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	//setter and getter 
	public String setName( ) { //read property
		return name;
	}
	public void getName(String name) {//write property
		this.name=name;
	}
	public double setSalary() {
		return salary;
	}
	void getSalary(double salary) {
		this.salary=salary;
	}
	//read property 
	public LocalDate getHireDate() {
		return hireDate;
		
	}//write property
	public void setHireDate(LocalDate hireDate) {
		this.hireDate=hireDate;
	}
	public int getYearofService() {
		return Period.between(hireDate,LocalDate.now()).getYears();
	}
    //printing Employee Details
	void info() {
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("HireDate :"+hireDate);
	}
}
public class Employee {
	public static void main(String[] args) {
      Office o=new Office("Saravanan",500000,LocalDate.parse("2021-04-01"));
      o.info();
      System.out.println("Years of Service :"+o.getYearofService());
      Office o1=new Office("Dora",1000000,LocalDate.parse("1999-09-15"));
      o1.info();
      System.out.println("Years of Service :"+o1.getYearofService());
	}
}

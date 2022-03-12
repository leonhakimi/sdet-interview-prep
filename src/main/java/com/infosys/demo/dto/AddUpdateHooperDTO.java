package com.infosys.demo.dto;

import java.util.Objects;

public class AddUpdateHooperDTO {

	private String firstName;
	private String lastName;
	private int jerseyNum;
	private double salary;
	
	

	public AddUpdateHooperDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddUpdateHooperDTO(String firstName, String lastName, int jerseyNum, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jerseyNum = jerseyNum;
		this.salary = salary;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, jerseyNum, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddUpdateHooperDTO other = (AddUpdateHooperDTO) obj;
		return Objects.equals(firstName, other.firstName) && jerseyNum == other.jerseyNum
				&& Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "AddUpdateHooperDTO [firstName=" + firstName + ", lastName=" + lastName + ", jerseyNum=" + jerseyNum
				+ ", salary=" + salary + "]";
	}
	
	

}

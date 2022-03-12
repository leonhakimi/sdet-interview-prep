package com.infosys.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hooper {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int hooperId;
		
		@Column(nullable = false)
		private String firstName;
		
		@Column(nullable = false)
		private String lastName;
		
	
		@Column(nullable = false)
		private int jerseyNum;
		
		@Column(nullable = false)
		private double salary;

		public Hooper() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Hooper(String firstName, String lastName, int jerseyNum, double salary) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.jerseyNum = jerseyNum;
			this.salary = salary;
		}

		public int getHooperId() {
			return hooperId;
		}

		public void setHooperId(int hooperId) {
			this.hooperId = hooperId;
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
			return Objects.hash(firstName, hooperId, jerseyNum, lastName, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Hooper other = (Hooper) obj;
			return Objects.equals(firstName, other.firstName) && hooperId == other.hooperId
					&& jerseyNum == other.jerseyNum && Objects.equals(lastName, other.lastName)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}

		@Override
		public String toString() {
			return "Hooper [hooperId=" + hooperId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", jerseyNum=" + jerseyNum + ", salary=" + salary + "]";
		}
		
		
		
}

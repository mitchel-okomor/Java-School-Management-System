/**
 * 
 */
package com.school.management.system;

/**
 * @author CoddeXaver
 *
 */
public class Student {

	private int id;
	private String fName;
	private String lName;
	private String fullName;
	private String sujectClass;
	private int feespaid;
	private int totalFees;
	
	/**
	 * @param id student Id
	 * @param fName Name of student
	 * @param lName Surname of Student
	 * @param sujectClass Class of Student
	 * @param totalFees Total fees to be paid
	 */
	public Student(int id, String fName, String lName, String sujectClass, int totalFees) {
	
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.sujectClass = sujectClass;
		this.totalFees = totalFees;
	}
	
	

	/**
	 * @return
	 * student id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id
	 * set student id
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * set full name of student.
	 */
	public void setName() {
		this.fullName = this.fName + " " + this.lName;
	}
	
	public String getName() {
		return fullName;
	}
	
	
	/**
	 * get the class of a student
	 *
	 */
	public String getSujectClass() {
		return sujectClass;
	}

	/**
	 * @param sujectClass
	 * set the class of a student
	 */
	public void setSujectClass(String sujectClass) {
		this.sujectClass = sujectClass;
	}

	/**
	 * @return
	 * get the amount of fees paid by a student
	 */
	public int getFeespaid() {
		return feespaid;
	}

	/**
	 * @param feespaid
	 * set the amount of fees paid by a student
	 */
	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}

	/**
	 * @return
	 * the amount of fees a student is suppose to pay
	 */
	public int getTotalFees() {
		return totalFees;
	}

	/**
	 * @param totalFees
	 * set the amount of fees a student is supose to pay
	 */
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	
	/**
	 * @return
	 * get the balance fees for a student
	 */
	public int feesBalance() {
		return totalFees - this.feespaid; 
	}
	
	
}

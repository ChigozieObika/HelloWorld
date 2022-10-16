package com.bptn.courseweek3;

import java.util.*;

//Student class
class Student1{

	// scanner for student class
	Scanner scan = new Scanner(System.in);

	// declaring class attributes
	private String studentId, studentName, passWord, userName, fatherName, email, phone, address, gender, dob, year, curriculumID;

	// constructor for student1 class
	public Student1 (String studentId, String userName, String passWord, String studentName, String fatherName, String email, String phone, 
			String address, String gender, String dob, String year, String curriculumID) {
		this.studentId = studentId;
		this.userName = userName; 
		this.passWord = passWord;
		this.studentName = studentName;
		this.fatherName = fatherName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.year = year;
		this.curriculumID = curriculumID;
	}

	// getters and setters for class attributes
	public String getStudentId(){  
		return this.studentId;
	}
	public String getYear(){
		return this.year;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public String getPassWord(){
		return this.passWord;
	}
	public String getUserName(){
		return this.userName;
	}
	public String getFatherName(){
		return this.fatherName;
	}
	public String getEmail(){
		return this.email;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getAddress(){
		return this.address;
	}
	public String getGender(){
		return this.gender;
	}
	public String getDob(){
		return this.dob;
	}
	public String getCurriculumID(){
		return this.curriculumID;
	}
	public void setStudentId( String studentId){   
		this.studentId = studentId;
	}
	public void setYear(String year){
		this.year = year;
	}
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setDob(String dob){
		this.dob = dob;
	}
	public void setcurriculumID(String curriculumID){
		this.curriculumID = curriculumID;
	}

	// gets specific student details 
	public void getStudent()
	{
		System.out.println("Student Id: " + getStudentId() + "\n" + "Username: " + getUserName() 
		+ "\n" + "Password: " + getPassWord() + "\n" + "Student Name: " + getStudentName() + "\n" + "Father Name: " + getFatherName()
		+ "\n" + "E-mail: " + getEmail() + "\n" + "Phone: " + getPhone() +  "\n" + "Address: " + getAddress() 
		+ "\n"  + "Gender: " + getGender() + "\n" + "DOB: " + getDob() + "\n" + "Year: " + getYear() 
		+ "\n" + "Curriculum ID: " +  getCurriculumID()); 

		System.out.println();
	}
	// adds the students' details to the university management system
	// details are taken from user inputs
	public void addStudent (){

		System.out.println("Please enter student id: ");
		String studentId = scan.nextLine();
		setStudentId(studentId);
		System.out.println("Please enter username: ");
		String userName1 = scan.nextLine();
		setUserName(userName1);
		System.out.println("Password: ");
		String passWord = scan.nextLine();
		setPassWord(passWord);
		System.out.println("Please enter your first name: ");
		String firstName = scan.nextLine();
		setStudentName(firstName);
		System.out.println("Please enter father's name: ");
		String fatherName = scan.nextLine();
		setFatherName(fatherName);
		System.out.println("Please enter Email: ");
		String email = scan.nextLine();
		setEmail(email);
		System.out.println("Please enter phone number: ");
		String phoneNumber = scan.nextLine();
		setPhone(phoneNumber);
		System.out.println("Please enter Address: ");
		String homeAddress = scan.nextLine();
		setAddress(homeAddress);
		System.out.println("Please enter Gender: ");
		String gender = scan.nextLine();
		setGender(gender);
		System.out.println("Please enter Date of Birth: ");
		String DateOfBirth = scan.nextLine();
		setDob(DateOfBirth);
		System.out.println("Please enter Year: ");
		String year = scan.nextLine();
		setYear(year);
		System.out.println("Please enter Curriculum Id: ");
		String curriculumId = scan.nextLine();
		setcurriculumID(curriculumId);

	}
	//deletes student details
	public void deleteStudent(){
		setStudentId("");
		setUserName("");
		setPassWord("");
		setStudentName("");
		setFatherName("");
		setEmail("");
		setPhone("");
		setAddress("");
		setGender("");
		setDob("");
		setYear("");
		setcurriculumID("");
	}

	// return selected details of students
	public void searchStudent() {

		System.out.println("Student Id: " + getStudentId() + "\n" + "First Name: " 
				+ getStudentName() +  "\n" + "Surname: " + getFatherName());
		System.out.println();
	}

	// set new attributes to existing students
	public void editStudent(){
		System.out.println("Press 1 edit to Email " );
		System.out.println("Press 2 to edit Phone number");
		String tempPress = scan.nextLine();
		if (tempPress.equals("1")){      
			System.out.println("OldEmail: " + getEmail());   
			System.out.println( "Please enter new email:");
			String newEmail = scan.nextLine();              
			setEmail(newEmail);
			System.out.println("NewEmail: " + getEmail());        
		}
		else if (tempPress.equals("2")){
			System.out.println("Old Phone: " + getPhone());
			System.out.println( "Please enter new phone number: ");
			String newPhone = scan.nextLine();
			setPhone(newPhone);
			System.out.println("New Phone: " + getPhone()); 
		}
		else 
			System.out.println("Please enter a valid number");
	}
}


public class UniversityMgtSystem {

	// scanner for taking inputs from user
	public static Scanner scan = new Scanner(System.in);

	// method too check if an ID exists in the system
	public static boolean checkId(List<Student1> uniMgtSys) {
		System.out.println("Enter ID of new student: ");

		String newStudentId = scan.nextLine();

		int i = 0;

		while (i < uniMgtSys.size()) {
			if (uniMgtSys.get(i).getStudentId().equals(newStudentId)) {
				return true;
			}
			i++;
		} return false;
	}

	public static void main(String[] args) {

		// create arraylist for storing objects from students1 class
		List<Student1> uniMgtSys = new ArrayList<>();	

		// creating objects from Student1 class
		Student1 newStudent1 = new Student1("", "kdbg", "pass", "Karim", "Dad", "karim@aol.com", "0725223344", "P.0. Box 100", "M", 
				"01/01/2001","2001","GCSE");
		Student1 newStudent2 = new Student1("2", "Barry", "wrong", "gnton", "Dada", "barry@aol.com", "0725223344", "P.0. Box 101", "M", 
				"01/01/2002","2001","GCSE");
		Student1 newStudent3 = new Student1("", "Chigozie", "whats", "donald", "Daddy", "chigozie@aol.com", "0725223344", "P.0. Box 102", "M",
				"01/01/2003","2003","GCSE");
		Student1 newStudent4 = new Student1("4", "Asterix", "okay", "kathingo", "Dadu", "asterix@aol.com", "0725223344", "P.0. Box 103", "M", 
				"01/01/2004","2004","GCSE");
		Student1 newStudent5 = new Student1("5", "Akinwale", "word", "Jemiseye", "Dadu", "akinwale@aol.com", "0725223344", "P.0. Box 104", "M",
				"01/01/2005","2005","GCSE");

		// adding objects to arraylist
		uniMgtSys.add(newStudent1);
		uniMgtSys.add(newStudent2);
		uniMgtSys.add(newStudent3);
		uniMgtSys.add(newStudent4);
		uniMgtSys.add(newStudent5);

		boolean startMenu = true;

		while (startMenu) {

			// menu for user to select an option
			System.out.println(
					"--------Welcome to Team 4 University Management System Menu----------" + "\n" + 
							"To add a new student, enter 1" + "\n" + 
							"To delete a student, enter 2" + "\n" + 
							"To search a student, enter 3" + "\n" + 
							"To edit a student details, enter 4" + "\n" + 
							"To get student details, enter 5" + "\n" + 
							"Please enter an option"
					);

			// declaring and initializing integer variables 
			int option = 0, i = 0;

			// take option from user
			option = scan.nextInt();

			scan.nextLine();

			// switch-case block to implement user's choice
			switch(option) {

			case 1:
				System.out.println("Add New Student");
				
				boolean existingStudent = false, existingIndex = false;

				// call method to check if new student ID exists in system
				existingStudent = checkId(uniMgtSys);

				// if-else block to output existing student ID or output a newly created student object
				if (existingStudent) {
					System.out.println("Student ID exists, create a new ID");
				}
				else {

					while (i < uniMgtSys.size()) {
						if (uniMgtSys.get(i).getStudentId().equals("")) {
							existingIndex = true;
							System.out.println("Adding student to existing index");
							uniMgtSys.get(i).addStudent();
							uniMgtSys.get(i).getStudent();
							break;
						}
						i++;
					}

					if (existingIndex == false) {
						System.out.println("Adding student to end of arraylist");
						Student1 newStudent = new Student1("", "", "", "", "", "", "", "", "", "", "", "");
						uniMgtSys.add(newStudent);
						int lastIndex = uniMgtSys.size() - 1;
						uniMgtSys.get(lastIndex).addStudent();
						uniMgtSys.get(lastIndex).getStudent();
					}
				}
				break;

			case 2:
				System.out.println("Delete Student Details");
				System.out.println("Enter student ID to be deleted: ");
				String idDel = scan.nextLine();

				while (i < uniMgtSys.size()) {
					if (uniMgtSys.get(i).getStudentId().equals(idDel)) {
						uniMgtSys.get(i).getStudent();
						System.out.println("Are you sure you want to delete this student? If YES enter 1, if  NO enter any other number");
						String response = scan.nextLine(); // input from user to confirm the delete operation
						if (response.equals("1")) {
							uniMgtSys.get(i).deleteStudent(); 
							uniMgtSys.get(i).getStudent();
							System.out.println("The student has been removed."); 
						}
					}
					i++;
				}
				break;

			case 3:
				System.out.println("Search for Student Details by year or by curriculumID");
				System.out.println("Enter your search criteria (1 for search by year, 0 for search by curriculumId: ");
				String searchCriteria = scan.nextLine(); // user chooses to search by year or by curriculumID
				int count = 0;
				if (searchCriteria.equals("1")) {
					System.out.println("Enter the year: "); 
					String year = scan.nextLine(); // take year as input from user
					for (i = 0; i < uniMgtSys.size(); i++) {
						if(uniMgtSys.get(i).getYear().equals(year)){
							uniMgtSys.get(i).searchStudent(); 
							count++;
						}
					}
					if (count == 0)
						System.out.println("The year is not available"); // when the user enters a year that is not found
					else
						System.out.println("Number of students returned from search: " + count);
				}
				else if (searchCriteria.equals("0")) {
					System.out.println("Enter the Curriculum Id: ");
					String currId = scan.nextLine(); // take curriculumID as input from user
					for (i = 0; i < uniMgtSys.size(); i++) {
						if(uniMgtSys.get(i).getCurriculumID().equals(currId)){
							uniMgtSys.get(i).searchStudent();
							count++;
						}
					}
					if (count == 0)
						System.out.println("The curriculumID is not available"); // when the user enters a curriculum that is not found
					else
						System.out.println("Number of students returned from search: " + count);
				}
				
				break;

			case 4:
				System.out.println("Edit Student Details");
				System.out.println("Enter student ID to be edited: ");
				String idEdit = scan.nextLine(); // take student ID as input from user
				while (i < uniMgtSys.size()) {
					if(uniMgtSys.get(i).getStudentId().equals(idEdit) == true) {
						uniMgtSys.get(i).editStudent();
					}
					i++;
				}
				break;

			case 5:
				System.out.println("Get Student Details");
				System.out.println("Enter student ID to display: ");
				String studentId = scan.nextLine(); // take year as input from user
				while (i < uniMgtSys.size()) {
					if (uniMgtSys.get(i).getStudentId().equals(studentId)) {
						uniMgtSys.get(i).getStudent();
					}
					i++;
				}

				break;

			default:
				System.out.println("Please enter a valid option"); // text to display if an invalid option is entered by user 

			}
			// restart system based on user's decision
			System.out.println("\n" + "Enter 0 to exit or enter any number to go back to the menu");
			String restart = scan.nextLine();
			if (restart.equals("0"))
				startMenu = false;

		}
		// close scanners and exit the system
		scan.close();
		System.out.println( "Thank you for using Team 4 University Management System");
		System.exit(0);

	}

}


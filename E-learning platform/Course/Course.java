package Courses;

import java.util.ArrayList;

import Gateways.Adapter;
import Gateways.EmailGateway;
import Gateways.OldGateway;
import Users.Professor;
import Users.Student;
import Users.TA;

public class Course implements CourseProxy_Interface{
	
	String name;
	String code;
	ArrayList<String> announcements;
	ArrayList<String> exams;
	ArrayList<String> grades;
	
	ArrayList<Professor> professorsForEmailNotification;
	ArrayList<Professor> professorsForSMSNotification;
	
	ArrayList<TA> TAsForEmailNotification;
	ArrayList<TA> TAsForSMSNotification;
	
	ArrayList<Student> studentsForEmailNotification;
	ArrayList<Student> studentsForSMSNotification;
	ArrayList<Observer> observers= new ArrayList<Observer>();

	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
		announcements = new ArrayList<String>();
		exams = new ArrayList<String>();
		grades = new ArrayList<String>();
		
		professorsForEmailNotification = new ArrayList<Professor>();
		professorsForSMSNotification = new ArrayList<Professor>();
		
		TAsForEmailNotification = new ArrayList<TA>();
		TAsForSMSNotification = new ArrayList<TA>();
		
		studentsForEmailNotification = new ArrayList<Student>();
		studentsForSMSNotification = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void subscribeProfessorForEmailNotification(Professor professor) {
		professorsForEmailNotification.add(professor);
	}
	
	public void subscribeProfessorForSMSNotification(Professor professor) {
		professorsForSMSNotification.add(professor);
	}
	
	public void subscribeTAForEmailNotification(TA ta) {
		TAsForEmailNotification.add(ta);
	}
	
	public void subscribeTAForSMSNotification(TA ta) {
		TAsForSMSNotification.add(ta);
	}
	
	public void subscribeStudentForEmailNotification(Student student) {
		studentsForEmailNotification.add(student);
	}
	
	public void subscribeStudentForSMSNotification(Student student) {
		studentsForSMSNotification.add(student);
	}
	
	
    @Override
	public void AddAssignment(String assignName, String assignBody) {
		announcements.add(assignName);
		String[] placeholders = new String[]{
				"Assignment: "+assignName, assignBody
		};
		// do some logic here
		notifyAllUsers(placeholders);
	}
	
	// AddExam, PostGrades, PostAnnouncement  will be the same 

	private void notifyAllUsers(String[] placeholders) {
		// notify users by email

		String notification = placeholders[0] + " " + placeholders[1];
		
		// open connection for Email gateway and do some configurations to the object
		
		EmailGateway emailGateway = new EmailGateway();

		Adapter ad = new Adapter();
		OldGateway old = ad;

		for (Observer observer : observers)
		{
			observer.update();
			ad.sendMessage(notification, observer.pr.getEmail());
		}
		for (Observer observer : observers)
		{
			observer.update();
			ad.sendMessage(notification, observer.ta.getEmail());
		}
		for (Observer observer : observers)
		{
			observer.update();
			ad.sendMessage(notification, observer.st.getEmail());
		}

	}

	@Override
	public void AddExam() {

	}

	@Override
	public void PostGrade() {

	}

	@Override
	public void PostAnnoucement() {

	}
}

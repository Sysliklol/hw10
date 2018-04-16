package dao;

import java.util.List;

import entity.Student;

public interface StudentsService {
	Student addStudent(Student student);
	Student getStudentById(int studentId);
	List<Student> getAllStudents();
	Student getStudentByPIB(String pib);
	List<Student> getAllStudentsByCourse(int course);
	void saveStudent(Student student);
}

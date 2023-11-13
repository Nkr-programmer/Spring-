package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Student student) {
		
		Integer result=(Integer) this.hibernateTemplate.save(student);
		return result;
	}
	@Transactional
	public void update(Student student) {
						this.hibernateTemplate.update(student);
	}
	@Transactional
	public void delete(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
	                    this.hibernateTemplate.delete(student);
	}
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	public List<Student> getAllStudent() {
		List<Student> allStudent=this.hibernateTemplate.loadAll (Student.class);
		return allStudent;
	}
	
	
}

package com.spring.jdbc.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student student) {
        String query="insert into Student values (?,?,?)";
        int result= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
	}
	public int change(Student student) {
		String query="update Student set name=? , address=? where id=?";
		int result=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return result;
	}
	public int delete(int studentId) {
		String query="delete from Student where id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	public Student getStudent(int studentId) {
		String query="select * from Student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student result=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return result;
	}
	public List<Student> getAllStudent() {
		String query="select * from Student";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		List<Student> result=this.jdbcTemplate.query(query,rowMapper);
		return result;
	}

}

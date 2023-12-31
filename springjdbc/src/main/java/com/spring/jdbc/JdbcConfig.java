package com.spring.jdbc;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDriver()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("9211");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDriver());
		return jdbcTemplate;
	}
	
//	@Bean("studentDao")
//	public StudentDaoImpl getStudentDao()
//	{
//		StudentDaoImpl studentDao=new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;
//	}
	
}

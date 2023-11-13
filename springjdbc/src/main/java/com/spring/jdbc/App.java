package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");// WITH XML
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);// WITHOUT XML
        //INSERT OPERATION
        
//        1st WAY
//        JdbcTemplate temp= context.getBean("jdbcTemplate",JdbcTemplate.class);
//        // inserting the query
//        String query="insert into Student values (?,?,?)";
//        int result= temp.update(query,104,"kumaro","bengalo");
//        System.out.println(result);
        
      ////2ND WAY
      //  //StudentDaoImpl studentDaoImpl=context.getBean("studentDao",StudentDaoImpl.class);// both will work as 
//        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        Student student =new Student();
//        student.setId(106);
//        student.setName("kumara");
//        student.setAddress("banglore");
//        int result=studentDao.insert(student);
//        System.out.println(result);
        
        //UPDATE OPERATION
//      StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//      Student student =new Student();
//      student.setId(106);
//      student.setName("RAI");
//      student.setAddress("YELANKHA");
//      int result=studentDao.change(student);
//      System.out.println(result);
        
        //DELETE OPERATION
//        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        int result=studentDao.delete(105);
//        System.out.println(result);
        
        //Fetch Single row
//      StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//      Student result=studentDao.getStudent(106);
//      System.out.println(result.toString());
        
        //Fetch Multiple rows
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        List<Student> result=studentDao.getAllStudent();
        for(Student s:result)
        System.out.println(s.toString());
        
    }
}

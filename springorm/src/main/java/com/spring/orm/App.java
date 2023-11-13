package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		boolean go = true;
		while (go) {
			System.out.println("1 for insert");
			System.out.println("2 for single");
			System.out.println("3 for all");
			System.out.println("4 for delete");
			System.out.println("5 for update");
			System.out.println("6 for exit");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int input = Integer.parseInt(br.readLine());
				if (input == 1) {
					// insert code
					System.out.println("Enter Id");
					int eId = Integer.parseInt(br.readLine());
					System.out.println("Enter name");
					String eName = br.readLine();
					System.out.println("Enter address");
					String eAddress = br.readLine();
					Student student = new Student(eId, eName, eAddress);
					int insert = studentDao.insert(student);
					System.out.println(insert + " inserted");

				} else if (input == 2) {
					// single object
					System.out.println("Enter Id");
					int eId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(eId);
					System.out.println("id: " + student.getId());
					System.out.println("name: " + student.getName());
					System.out.println("city: " + student.getAddress());
				} else if (input == 3) {
					// show all objects
					List<Student> allStudent = studentDao.getAllStudent();
					for (Student student : allStudent) {
						System.out.println("id: " + student.getId());
						System.out.println("Name: " + student.getName());
						System.out.println("city: " + student.getAddress());
					}
				} else if (input == 4) {
					// delete
					System.out.println("Enter id");
					int id = Integer.parseInt(br.readLine());
					studentDao.delete(id);
					System.out.println("deleted");
				} else if (input == 5) {
					// update
					System.out.println("Enter Id");
					int eId = Integer.parseInt(br.readLine());
					System.out.println("Enter Name");
					String eName = br.readLine();
					System.out.println("Enter city");
					String eCity = br.readLine();
					Student student = new Student(eId, eName, eCity);
					studentDao.update(student);
					System.out.println("updated...");
				} else if (input == 6) {
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("try again..");
				e.printStackTrace();
			}
		}

    }
}

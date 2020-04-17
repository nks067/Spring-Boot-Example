package com.nilesh.data;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nilesh.data.DAO.EmployeeDAO;
import com.nilesh.data.DAO.StudentDAO;
import com.nilesh.data.model.Students;
import com.nilesh.data.mongo.repository.StudentNoSqlRepositery;
import com.nilesh.data.utility.ScheduledTasks;
import com.nilesh.data.entity.Employee;

@SpringBootApplication
@EnableScheduling
//@EnableMongoRepositories ("com.nilesh.data.mongo.repository")
public class SpringDataApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringDataApplication.class);
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataApplication.class, args);
		StudentDAO studentDAO=context.getBean(StudentDAO.class);
		EmployeeDAO employeeDAO=context.getBean(EmployeeDAO.class);
		/**************      Working With MongoDB      **************/
		/*Find By Id
		Students obj=studentDAO.findById("5b994ba7b5ad823e6f31120d");
		System.out.println(obj.toString());
		log.debug(obj.toString());
		obj=null;
		*/
		
		
		/*Find by Name returns list of Students
		List<Students> obj1=studentDAO.findByName("nilesh kumar Singh");
		for(Students s:obj1) {
		System.out.println(s.toString());
		log.debug(s.toString());
		}
		obj1=null;
		*/
		
		//Create a new Students Entry
		Students s=new Students(null, "XXXXXr Singh", "MT2018011", 9709700400L, "rajiv@gmail.com");
		s=studentDAO.addStudents(s);
		System.out.println("New Students Added"+s.toString());
		log.debug("New Students Added"+s.toString());
		s=null;
	
		
		
		/**************      Working With Mysql      **************/
		/*Adding Employee
		 * 
		 * Employee e=new Employee(null, "Nilesh Kumar Singh", "Engineering", 9457240028L, "nileshsingh067@gmail.com");
		e=employeeDAO.addEmployee(e);
		System.out.println("New Employee Added\n"+e.toString());
		log.debug("New Employee Added\n"+e.toString());
		e=null;
		*/
		/*
		 * finding Employee by Name
		 */
	/*	Employee e=employeeDAO.findById(1L);
		System.out.println(""+e.toString());
		log.debug(""+e.toString());*/
	}
}

package com.nilesh.data.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nilesh.data.model.Students;
import com.nilesh.data.mongo.repository.StudentNoSqlRepositery;

import java.util.List;

@Component
public class StudentDAO {
	@Autowired
	StudentNoSqlRepositery studentNoSqlRepositery;
	public Students addStudents(Students student) {
		student=studentNoSqlRepositery.save(student);
		return student;
	}
	public List<Students> getAllStudents() {
		return studentNoSqlRepositery.findAll();
	}
	public List<Students> findByName(String name) {
		return studentNoSqlRepositery.findByName(name);
	}
	public List<Students> findByMobile(Long mobile) {
		return studentNoSqlRepositery.findByMobile(mobile);
	}
	public Students findById(String id) {
		return studentNoSqlRepositery.findById(id);
	}
}

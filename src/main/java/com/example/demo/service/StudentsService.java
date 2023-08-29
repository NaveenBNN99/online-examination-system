
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Students;

@Service
public interface StudentsService {
	List<Students> getAllStudents();
	Students Editprofile(Students obj, int id);
	void saveStudents(Students obj);
	void deleteStudentbyid(int id);
	
	
}

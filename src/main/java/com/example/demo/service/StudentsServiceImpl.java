package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Students;
import com.example.demo.repositories.StudentsRepository;

@Service
public class StudentsServiceImpl implements StudentsService
{

	@Autowired
	StudentsRepository studentrepository;
	
	@Override
	public List<Students> getAllStudents() {
		return studentrepository.findAll();
	}

	@Override
	public Students Editprofile(Students obj, int id) {
		// TODO Auto-generated method stub
		Students Z = studentrepository.getById(id);
		Z.setStudentname(obj.getStudentname());
		Z.setUsername(obj.getUsername());
		Z.setPassword(obj.getPassword());
		return studentrepository.save(Z);
	}

	@Override
	public void saveStudents(Students obj) {
		// TODO Auto-generated method stub
		studentrepository.save(obj);
		
	}

	@Override
	public void deleteStudentbyid(int id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(id);
	}



	
	

}
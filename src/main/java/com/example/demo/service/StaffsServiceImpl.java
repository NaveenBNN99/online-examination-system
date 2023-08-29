package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;
import com.example.demo.model.Staffs;
import com.example.demo.model.Students;
import com.example.demo.repositories.QuestionsRepository;
import com.example.demo.repositories.StaffsRepository;
import com.example.demo.repositories.StudentsRepository;

@Service
public class StaffsServiceImpl implements StaffsService{

	@Autowired
	StaffsRepository staffrepository;
	
	@Autowired
	StudentsRepository studentrepository;
	
	@Autowired
	QuestionsRepository questionsrepository;
	@Override
	public List<Staffs> getAllStaffs() {
		return staffrepository.findAll();
	}
	@Override
	public Staffs Editprofile(Staffs obj, int staffid) {
		// TODO Auto-generated method stub
		Staffs staffs= staffrepository.getById(staffid);
		staffs.setStaffname(obj.getStaffname());
		staffs.setDepartment(obj.getDepartment());
		staffs.setUsername(obj.getUsername());
		staffs.setPassword(obj.getPassword());
		return staffrepository.save(staffs);

		
	}
	


}
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;
import com.example.demo.model.Staffs;
import com.example.demo.model.Students;

@Service
public interface StaffsService {
	List<Staffs> getAllStaffs();

	Staffs Editprofile(Staffs obj, int staffid);

	

	


}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerSheets;
import com.example.demo.repositories.AnswerSheetsRepository;

@Service
public class AnswerSheetsServiceImpl implements AnswerSheetsService{

	@Autowired
	AnswerSheetsRepository sheetrepository;
	
	@Override
	public List<AnswerSheets> getAllAnswerSheets() {
		return sheetrepository.findAll();
	}

	@Override
	public List<AnswerSheets> getAnswerSheetsByStudentid(int studentid) {
		return sheetrepository.getAnswerSheetsByStudentid(studentid);
	}

	@Override
	public void addResponse(AnswerSheets obj) {
		// TODO Auto-generated method stub
		sheetrepository.save(obj);
	}

}
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerSheets;

@Service
public interface AnswerSheetsService {
	List<AnswerSheets> getAllAnswerSheets();
	List<AnswerSheets> getAnswerSheetsByStudentid(int studentid);
	void addResponse(AnswerSheets obj);
}
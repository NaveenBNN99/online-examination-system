package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerKeys;
import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Results;
import com.example.demo.repositories.AnswerKeysRepository;
import com.example.demo.repositories.AnswerSheetsRepository;
import com.example.demo.repositories.ResultsRepository;

@Service
public class ResultsServiceImpl implements ResultsService{

	@Autowired
	ResultsRepository resultrepository;
	
	@Autowired
	AnswerKeysRepository keyrepository;
	
	@Autowired
	AnswerSheetsRepository sheetrepository;
	
	@Override
	public List<Results> getAllResults() {
		return resultrepository.findAll();
	
	}

	@Override
	public int calculateResult(int studentid, int subjectid) {
		Results res=resultrepository.getById(studentid);
		List<AnswerKeys> key=keyrepository.getAnswerKeyBySubjectid(subjectid);
		List<AnswerSheets> sheet=sheetrepository.getAnswerSheetsByStudentid(studentid);
		int count=0;
		for(int i=0;i<key.size();i++) {
			if(key.get(i).getAnswer().equalsIgnoreCase(sheet.get(i).getResponse())) {
				count++;
			}
		}
		res.setResult(count);
		resultrepository.save(res);
		return count;
	}

}
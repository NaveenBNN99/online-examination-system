package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;
import com.example.demo.repositories.QuestionsRepository;

@Service
public class QuestionsServiceImpl implements QuestionsService{

	@Autowired
	QuestionsRepository questionrepository;
	
	@Override
	public List<Questions> getAllQuestions() {
		return questionrepository.findAll();
	}

	@Override
	public void saveQuesions(Questions obj) {
		// TODO Auto-generated method stub
		questionrepository.save(obj);
	}

	@Override
	public void editQuestions(Questions obj, int questionnumber) {
		// TODO Auto-generated method stub
		Questions q= questionrepository.getById(questionnumber);
		q.setSubjectid(obj.getSubjectid());
		q.setQuestion(obj.getQuestion());
		questionrepository.save(q);
		
		
	}

	@Override
	public void deleteQuestion(int qno) {
		// TODO Auto-generated method stub
		questionrepository.deleteById(qno);
		
	}

}

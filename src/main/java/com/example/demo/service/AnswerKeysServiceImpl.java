package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerKeys;
import com.example.demo.repositories.AnswerKeysRepository;

@Service
public class AnswerKeysServiceImpl implements AnswerKeysService {

	@Autowired
	AnswerKeysRepository keyrepository;
	
	@Override
	public List<AnswerKeys> getAllAnswerKeys() {
		return keyrepository.findAll();
	}

	@Override
	public List<AnswerKeys> getAnswerKeyBySubjectid(int subjectid) {
		return keyrepository.getAnswerKeyBySubjectid(subjectid);
	}

	@Override
	public void addAnswerkey(AnswerKeys obj) {
		// TODO Auto-generated method stub
		keyrepository.save(obj);
	}

	
	@Override
	public void deleteKey(int qno) {
		// TODO Auto-generated method stub
		keyrepository.deleteById(qno);
		
	}

	@Override
	public void updateKey(AnswerKeys obj, int questionnumber) {
		// TODO Auto-generated method stub
		AnswerKeys a = keyrepository.getById(questionnumber);
		a.setAnswer(obj.getAnswer());
		a.setSubjectid(obj.getSubjectid());
		keyrepository.save(a);
		
	}

}
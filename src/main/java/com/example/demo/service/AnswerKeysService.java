package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerKeys;

@Service
public interface AnswerKeysService {
	List<AnswerKeys> getAllAnswerKeys();
	List<AnswerKeys> getAnswerKeyBySubjectid(int subjectid);
	void addAnswerkey(AnswerKeys obj);
	
	void deleteKey(int qno);
	void updateKey(AnswerKeys obj, int questionnumber);
}

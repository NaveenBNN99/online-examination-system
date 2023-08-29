package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;

@Service
public interface QuestionsService {
	List<Questions> getAllQuestions();

	void saveQuesions(Questions obj);

	void editQuestions(Questions obj, int questionnumber);

	void deleteQuestion(int qno);
}

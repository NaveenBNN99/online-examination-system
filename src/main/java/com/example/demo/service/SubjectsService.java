package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Subjects;

@Service
public interface SubjectsService {
	List<Subjects> getAllSubjects();

	void addsubject(Subjects obj);

	void deleteSubject(int id);


}
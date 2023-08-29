package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Results;

@Service
public interface ResultsService {
	List<Results> getAllResults();
	int calculateResult(int studentid,int subjectid);
}
package com.example.demo.controller;

import com.example.demo.model.Questions;
import com.example.demo.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Results;
import com.example.demo.model.Students;
import com.example.demo.repositories.ResultsRepository;
import com.example.demo.service.AnswerSheetsService;
import com.example.demo.service.ResultsService;
import com.example.demo.service.StudentsService;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class Studentcontroller {
	@Autowired
	StudentsService service;

	@Autowired
	AnswerSheetsService ansservice;

	@Autowired
	ResultsService resservice;
	@Autowired
	QuestionsService questionservice;

	@Autowired
	ResultsRepository resrepo;

	@RequestMapping("/Test")
	public String test() {
		return "working";
	}

	@PutMapping("/EditProfile")
	public ResponseEntity<Students> update(@RequestBody Students obj) {
		service.Editprofile(obj, obj.getStudentid());
		return new ResponseEntity<Students>(obj, HttpStatus.OK);

	}

	@GetMapping("/showquestions")
	public List<Questions> getAllQuestions() {
		return questionservice.getAllQuestions();
	}

	@PostMapping("/addresponse")
	public ResponseEntity<AnswerSheets> addAnswer(@RequestBody AnswerSheets obj) {
		ansservice.addResponse(obj);
		return new ResponseEntity<AnswerSheets>(obj, HttpStatus.OK);
	}

	@GetMapping("/displayresults/{id}")
	public ResponseEntity<Results> showResult(@PathVariable(value = "id") Integer id) {
		Results results = resrepo.getById(id);
		if (results != null) {
			return new ResponseEntity<>(results, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		}

	}
}

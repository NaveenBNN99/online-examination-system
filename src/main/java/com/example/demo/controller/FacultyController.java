package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AnswerKeys;
import com.example.demo.model.AnswerSheets;
import com.example.demo.model.Questions;
import com.example.demo.model.Results;
import com.example.demo.model.Staffs;
import com.example.demo.model.Students;
import com.example.demo.model.Subjects;
import com.example.demo.service.AnswerKeysService;
import com.example.demo.service.AnswerSheetsService;
import com.example.demo.service.QuestionsService;
import com.example.demo.service.ResultsService;
import com.example.demo.service.StaffsService;
import com.example.demo.service.StudentsService;
import com.example.demo.service.SubjectsService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	AnswerKeysService keyservice;

	@Autowired
	AnswerSheetsService sheetservice;

	@Autowired
	QuestionsService questionservice;

	@Autowired
	ResultsService resultservice;

	@Autowired
	StaffsService staffservice;

	@Autowired
	StudentsService studentservice;

	@Autowired
	SubjectsService subjectservice;

	@GetMapping("/test")
	public String test() {
		return "Faculty!!!!!";
	}

	@GetMapping("/showkeys")
	public List<AnswerKeys> getAllAnswerKeys() {
		return keyservice.getAllAnswerKeys();
	}

	@PostMapping("/addkey")
	public ResponseEntity<AnswerKeys> addAnswerkey(@RequestBody AnswerKeys obj) {
		keyservice.addAnswerkey(obj);
		return new ResponseEntity<AnswerKeys>(obj, HttpStatus.OK);
	}

	@PutMapping("/updatekey")
	public ResponseEntity<AnswerKeys> updateAnswerkey(@RequestBody AnswerKeys obj) {
		keyservice.updateKey(obj, obj.getQuestionnumber());
		return new ResponseEntity<AnswerKeys>(obj, HttpStatus.OK);

	}

	@DeleteMapping("/deletekey/{qno}")
	public String deleteAnswerkey(@PathVariable(value = "qno") Integer qno) {
		keyservice.deleteKey(qno);
		return "Answer key Deleted successfully";

	}

	@GetMapping("/showsheets")
	public List<AnswerSheets> getAllAnswerSheets() {
		return sheetservice.getAllAnswerSheets();
	}

	@GetMapping("/showquestions")
	public List<Questions> getAllQuestions() {
		return questionservice.getAllQuestions();
	}

	@PostMapping("/addquestions")
	public ResponseEntity<Questions> addQuestions(@RequestBody Questions obj) {
		questionservice.saveQuesions(obj);
		return new ResponseEntity<Questions>(obj, HttpStatus.OK);
	}

	@PutMapping("/updatequestions")
	public ResponseEntity<Questions> updateQuestions(@RequestBody Questions obj) {
		questionservice.editQuestions(obj, obj.getQuestionnumber());
		return new ResponseEntity<Questions>(obj, HttpStatus.OK);
	}

	@DeleteMapping("/deletequetions/{qno}")
	public String deleteQuestion(@PathVariable(value = "qno") Integer qno) {
		questionservice.deleteQuestion(qno);
		return "Question Deleted Successfully";

	}

	@GetMapping("/showresults")
	public List<Results> getAllResults() {
		return resultservice.getAllResults();
	}

	@GetMapping("/showstudents")
	public List<Students> getAllStudents() {
		return studentservice.getAllStudents();
	}

	@GetMapping("/showsubjects")
	public List<Subjects> getAllSubjects() {
		return subjectservice.getAllSubjects();
	}

	@PostMapping("/addsubjects")
	public ResponseEntity<Subjects> addSubject(@RequestBody Subjects obj) {
		subjectservice.addsubject(obj);
		return new ResponseEntity<Subjects>(obj, HttpStatus.OK);

	}

	@DeleteMapping("/deletesubject/{id}")
	public String deleteSubject(@PathVariable(value = "id") Integer id) {
		subjectservice.deleteSubject(id);
		return "Subject Deleted Successfully";
	}
	@PutMapping("/EditProfile")
	public ResponseEntity<Staffs> update(Staffs obj) {
		staffservice.Editprofile(obj, obj.getStaffid());
		return new ResponseEntity<Staffs>(obj, HttpStatus.OK);

	}
}

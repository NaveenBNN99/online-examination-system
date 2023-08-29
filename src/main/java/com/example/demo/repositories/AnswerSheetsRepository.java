package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AnswerSheets;

@Repository
public interface AnswerSheetsRepository extends JpaRepository<AnswerSheets, Integer>{
	List<AnswerSheets> getAnswerSheetsByStudentid(int studentid);
}
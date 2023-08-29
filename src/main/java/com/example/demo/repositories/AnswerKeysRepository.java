package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AnswerKeys;

@Repository
public interface AnswerKeysRepository extends JpaRepository<AnswerKeys, Integer>{
	List<AnswerKeys> getAnswerKeyBySubjectid(int subjectid);
}

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer>{

}
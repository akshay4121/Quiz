package com.learning.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.quizapp.POJO.Question;
import com.learning.quizapp.repository.QuestionRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class QuestionService {

        QuestionRepository questionRepository;


        public List<Question> getAllQuestions(){
            return questionRepository.findAll();
        }

        public List<Question> getQuestionsByCategory(String category){
            return questionRepository.findByCategory(category);
        }
    
}

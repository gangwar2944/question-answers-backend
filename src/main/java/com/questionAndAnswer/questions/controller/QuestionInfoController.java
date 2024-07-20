package com.questionAndAnswer.questions.controller;

import com.questionAndAnswer.questions.Entity.QuestionInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.questionAndAnswer.questions.services.QuestionInfoService;

import java.util.List;
@CrossOrigin(allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/questions")
public class QuestionInfoController {


    @Autowired
    private QuestionInfoService questionService;

    @GetMapping("/")
    public List<QuestionInfoEntity> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public QuestionInfoEntity getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping("/")
    public QuestionInfoEntity createQuestion(@RequestBody QuestionInfoEntity question) {
        return questionService.createQuestion(question);
    }

    @PutMapping("/{id}")
    public QuestionInfoEntity updateQuestion(@PathVariable Long id, @RequestBody QuestionInfoEntity question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }
}

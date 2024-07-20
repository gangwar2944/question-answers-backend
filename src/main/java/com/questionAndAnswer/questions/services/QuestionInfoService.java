package com.questionAndAnswer.questions.services;

import com.questionAndAnswer.questions.Entity.QuestionInfoEntity;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public interface QuestionInfoService {
    List<QuestionInfoEntity> getAllQuestions();
    QuestionInfoEntity getQuestionById(Long id);
    QuestionInfoEntity createQuestion(QuestionInfoEntity question);
    QuestionInfoEntity updateQuestion(Long id, QuestionInfoEntity question);
    void deleteQuestion(Long id);
}

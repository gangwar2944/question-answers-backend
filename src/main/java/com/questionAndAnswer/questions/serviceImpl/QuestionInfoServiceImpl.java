package com.questionAndAnswer.questions.serviceImpl;

import com.questionAndAnswer.questions.Entity.QuestionInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.questionAndAnswer.questions.repository.QuestionInfoRepo;
import com.questionAndAnswer.questions.services.QuestionInfoService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionInfoServiceImpl implements QuestionInfoService {

    @Autowired
    private QuestionInfoRepo repository;

    @Override
    public List<QuestionInfoEntity> getAllQuestions() {
        return repository.findAll();
    }

    @Override
    public QuestionInfoEntity getQuestionById(Long id) {
        Optional<QuestionInfoEntity> question = repository.findById(id);
        return question.orElse(null);
    }

    @Override
    public QuestionInfoEntity createQuestion(QuestionInfoEntity question) {
        return repository.save(question);
    }

    @Override
    public QuestionInfoEntity updateQuestion(Long id, QuestionInfoEntity question) {
        if (repository.existsById(id)) {
            question.setId(id);
            return repository.save(question);
        }
        return null; // Handle not found
    }

    @Override
    public void deleteQuestion(Long id) {
        repository.deleteById(id);
    }
}

package com.questionAndAnswer.questions.repository;

import com.questionAndAnswer.questions.Entity.QuestionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionInfoRepo extends JpaRepository<QuestionInfoEntity, Long> {

}

package com.questionAndAnswer.questions.EntitiesDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionInfoDto {

    private Long id;
    private String javascriptCode;
    private String answerInput;
    private String question;
    private String type;
    private String language;

}

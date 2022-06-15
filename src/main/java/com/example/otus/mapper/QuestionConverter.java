package com.example.otus.mapper;

import com.example.otus.dto.Answer;
import com.example.otus.dto.Question;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class QuestionConverter {
    private static final int INDEX_OF_QUESTION_DESCRIPTION = 0;
    private static final int INDEX_OF_FIRST_ANSWER = 1;

    public List<Question> convertToDTO(List<String[]> str) {
        List<Question> questions = new ArrayList<>();
        for (String[] strings : str) {
            questions.add(createQuestion(strings));
        }
        return questions;
    }

    private Question createQuestion(String[] line) {
        Question question = new Question();
        question.setDescription(line[INDEX_OF_QUESTION_DESCRIPTION]);
        if (!isOpenedQuestion(line)) {
            question.setAnswers(createFullAnswer(line));
        } else {
            question.setAnswers(createOpenedAnswer(line));
        }
        return question;
    }

    private List<Answer> createFullAnswer(String[] line) {
        List<Answer> answers = new ArrayList<>();
        for (int i = INDEX_OF_FIRST_ANSWER; i < line.length; i++) {
            answers.add(new Answer(line[i], Boolean.parseBoolean(line[++i])));
        }
        return answers;
    }

    private List<Answer> createOpenedAnswer(String[] line) {
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer(line[INDEX_OF_FIRST_ANSWER], true));
        return answers;
    }

    private boolean isOpenedQuestion(String[] strings) {
        return strings.length < 3;
    }

}

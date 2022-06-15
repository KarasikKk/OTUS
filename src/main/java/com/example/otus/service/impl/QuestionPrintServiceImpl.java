package com.example.otus.service.impl;

import com.example.otus.dto.Answer;
import com.example.otus.dto.Question;
import com.example.otus.parser.QuestionParser;
import com.example.otus.service.QuestionPrintService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class QuestionPrintServiceImpl implements QuestionPrintService {
    private final QuestionParser questionParser;

    @Override
    public void viewAllQuestions() {
        System.out.println(stringConverter(questionParser.getParse()));
    }

    public String stringConverter(List<Question> question) {
        StringBuilder line = new StringBuilder();
        for (Question value : question) {
            line.append(value.getDescription()).append("\n");
            List<Answer> answers = value.getAnswers();
            for (Answer answer : answers) {
                line.append(answer.getDescription()).append("\n");
            }
            line.append("\n");
        }
        return line.toString();
    }
}

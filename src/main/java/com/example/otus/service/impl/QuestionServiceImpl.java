package com.example.otus.service.impl;

import com.example.otus.service.QuestionPrintService;
import com.example.otus.service.QuestionService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionPrintService questionPrintService;

    @Override
    public void printAllQuestionsToConsole() {
        questionPrintService.viewAllQuestions();
    }
}

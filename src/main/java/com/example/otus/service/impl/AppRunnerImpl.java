package com.example.otus.service.impl;

import com.example.otus.service.AppRunner;
import com.example.otus.service.QuestionService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AppRunnerImpl implements AppRunner {
    private final QuestionService questionService;

    @Override
    public void run() {
        questionService.printAllQuestionsToConsole();
    }
}

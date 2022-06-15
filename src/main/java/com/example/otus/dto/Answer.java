package com.example.otus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Answer {
    private String description;
    private boolean isRightAnswer;
}

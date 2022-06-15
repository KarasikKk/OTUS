package com.example.otus.dto;

import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Setter
public class Question {
    private String description;
    private List<Answer> answers;
}

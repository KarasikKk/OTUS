package com.example.otus.parser.impl;

import com.example.otus.dto.Question;
import com.example.otus.mapper.QuestionConverter;
import com.example.otus.parser.QuestionParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import lombok.RequiredArgsConstructor;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class QuestionParserImpl implements QuestionParser {
    private final String FILE_PATH;
    private final QuestionConverter questionConverter = new QuestionConverter();

    @Override
    public List<Question> getParse() {
        try (CSVReader reader = new CSVReader(new FileReader(FILE_PATH))) {
            List<String[]> r = reader.readAll();
            return questionConverter.convertToDTO(r);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return null;
    }
}

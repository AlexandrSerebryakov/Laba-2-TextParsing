package com.epam.alex.service;

/**
 * Created by Alexandr Serebryakov on 25.10.2016.
 */
public class TextPreparator {
    String preparedText = "";

    public String preparateText() {
        String preparedText = TextReader.getText().trim();
        return preparedText;

    }
}

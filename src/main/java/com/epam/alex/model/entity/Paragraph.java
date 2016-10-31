package com.epam.alex.model.entity;

import com.epam.alex.model.composite.TextComposite;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Paragraph implements TextComposite {
    public static final String REGEX_FROM_PARAGRAPH_TO_SENTENCE = "[^.!?]*(\\.[^. \\n]+[^.!?]*)?[.!?]+ (\\r?\\n)";
    public static final String REGEX_FROM_PARAGRAPH_TO_SENTENCE_VARIANT = "[\\p{L}]+((\\.|-)?([\\p{L}]+))?|\\s|\\d+|[\\p{Punct}]";
}

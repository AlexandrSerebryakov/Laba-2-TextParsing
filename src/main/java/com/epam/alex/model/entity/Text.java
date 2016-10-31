package com.epam.alex.model.entity;

import com.epam.alex.model.composite.TextComposite;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Text implements TextComposite {
    public static final String REGEX_FROM_TEXT_TO_PARAGRAPH = "(\\n|^).*?(?=\\n|$)";
    private List<String> paragraphs = new ArrayList<String>();

}

package com.epam.alex.main;

import com.epam.alex.model.io.RegexTextParser;
import com.epam.alex.model.io.TextPreparator;
import com.epam.alex.model.io.TextPrinter;
import com.epam.alex.model.io.TextReader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String text = TextReader.readText();
        String prepText = TextPreparator.prepareText(text);
        TextPrinter.printTextString(prepText);
        List<String> textAfterParsing = RegexTextParser.textParse(prepText);
        System.out.println(textAfterParsing.toString().trim());
    }
}
package com.epam.alex.main;

import com.epam.alex.model.entity.Paragraph;
import com.epam.alex.model.entity.Sentence;
import com.epam.alex.model.entity.Text;
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

        List<String> textAfterParsingText = RegexTextParser.textParse(prepText, Text.REGEX_FROM_TEXT_TO_PARAGRAPH);
        System.out.println(textAfterParsingText.toString().trim());

        List<String> textAfterParsingParagraph = RegexTextParser.textParse(textAfterParsingText.toString(),
                Paragraph.REGEX_FROM_PARAGRAPH_TO_SENTENCE_VARIANT);
        System.out.println(textAfterParsingParagraph.toString().trim());

        List<String> textAfterParsingSentence = RegexTextParser.textParse(textAfterParsingParagraph.toString(),
                Sentence.REGEX_FROM_SENTENCE_TO_WORD);
        System.out.println(textAfterParsingSentence.toString().trim());


    }
}
package com.epam.alex.main;

import com.epam.alex.model.io.TextPreparator;
import com.epam.alex.model.io.TextPrinter;
import com.epam.alex.model.io.TextReader;

import java.io.FileNotFoundException;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String text = TextReader.readText();
        TextPreparator.prepareText(text);
        TextPrinter.printText(text);
    }
}

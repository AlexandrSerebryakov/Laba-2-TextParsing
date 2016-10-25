package com.epam.alex.main;

import java.io.FileNotFoundException;

import static com.epam.alex.service.TextReader.readText;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String text =readText();
    }
}

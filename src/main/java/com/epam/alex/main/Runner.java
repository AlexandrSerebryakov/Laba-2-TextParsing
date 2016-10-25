package com.epam.alex.main;

import com.epam.alex.service.TextReader;

import java.io.FileNotFoundException;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String text = TextReader.readText();
        System.out.println(text);
    }
}

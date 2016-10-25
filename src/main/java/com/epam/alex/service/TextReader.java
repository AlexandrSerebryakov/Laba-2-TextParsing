package com.epam.alex.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class TextReader {


    static String text = "";

    public String readText() throws FileNotFoundException {
        String text = "";
        Scanner scanner = new Scanner(new File("text.txt"));
        while (scanner.hasNextLine()) {
            text += scanner.nextLine() + '\n';

        }
        return text;
    }

    public static String getText() {
        return text;
    }


}

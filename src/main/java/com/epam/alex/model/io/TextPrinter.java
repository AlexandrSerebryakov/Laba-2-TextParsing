package com.epam.alex.model.io;

import java.util.List;

/**
 * Created by Alexandr Serebryakov on 22.10.2016.
 */
public class TextPrinter {
    public static String printTextString (String text) {
        System.out.println(text);
        return text;
    }
    public static List<String> printTextList (List<String> stringList) {
        System.out.println(stringList);
        return stringList;
    }

}

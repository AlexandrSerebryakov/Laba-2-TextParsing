package com.epam.alex.model.io;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AlexandrSerebryakov on 31.10.2016.
 */
public class RegexTextParser {
    public static List<String> textParse(String prepText, String regex) {
        /*regex = Text.REGEX_FROM_TEXT_TO_PARAGRAPH;*/
        List<String> list = new ArrayList<String>();
        Matcher matcher = Pattern.compile(regex).matcher(prepText);
        while (matcher.find()) {
            list.add(matcher.group().trim());
        }


        return list;

    }
}
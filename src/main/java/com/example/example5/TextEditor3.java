package com.example.example5;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by levont on 20/03/2017.
 */
public class TextEditor3 {

    @Autowired
    private SpellChecker3 checker;

    public TextEditor3() {
        System.out.println("inside textEditor constructor3");
    }

//    public SpellChecker3 getChecker() {
//        return checker;
//    }

    public void spellCheck() {
        checker.checkSpelling();
    }
}

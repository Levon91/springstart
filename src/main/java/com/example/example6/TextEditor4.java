package com.example.example6;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by levont on 20/03/2017.
 */
public class TextEditor4 {

    private SpellChecker4 checker;

    @Autowired
    public TextEditor4(SpellChecker4 checker) {
        System.err.println("inside textEditor constructor4");
        this.checker = checker;
    }

    public void spellCheck() {
        checker.checkSpelling();
    }
}

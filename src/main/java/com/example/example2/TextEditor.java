package com.example.example2;

/**
 * Created by levont on 20/03/2017.
 */
public class TextEditor {

    private SpellChecker checker;

    public TextEditor(SpellChecker checker) {
        System.out.println("inside text editor constructor");
        this.checker = checker;
    }

    public void spellCheck() {
        checker.checkSpelling();
    }
}

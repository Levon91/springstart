package com.example.example4;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by levont on 20/03/2017.
 */
public class TextEditor2 {

    private SpellChecker2 checker;

    @Autowired
    public void setChecker(SpellChecker2 spellChecker){
        System.err.println("inside setSpellChecker method2");
        this.checker = spellChecker;
    }

    public SpellChecker2 getChecker() {
        return checker;
    }

    public void spellCheck() {
        checker.checkSpelling();
    }
}

package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import com.robinsonduffy.guesswho.Person;

public interface Question {
    String getName();

    EnumSet<Person> getPeople();
}

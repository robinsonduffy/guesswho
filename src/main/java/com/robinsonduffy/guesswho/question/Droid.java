package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Droid implements Question {
    @Override
    public String getName() {
        return "Is your person a droid?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.C_3PO,
                Person.R2_D2);
    }
}

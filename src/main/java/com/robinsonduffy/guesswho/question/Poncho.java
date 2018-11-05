package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Poncho implements Question {
    @Override
    public String getName() {
        return "Is your person wearing a poncho?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.LUKE_SKYWALKER);
    }
}

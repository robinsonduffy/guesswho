package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Helmet implements Question {
    @Override
    public String getName() {
        return "Is your person wearing a helmet?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.BOBA_FETT,
                Person.DARTH_VADER,
                Person.CAPTAIN_REX);
    }
}

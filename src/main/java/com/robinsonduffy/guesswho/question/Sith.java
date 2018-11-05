package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Sith implements Question {
    @Override
    public String getName() {
        return "Is your person a sith?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.ASAJJ_VENTRESS,
                Person.DARTH_VADER,
                Person.COUNT_DOOKU,
                Person.DARTH_MAUL,
                Person.EMPEROR_PALPATINE);
    }
}

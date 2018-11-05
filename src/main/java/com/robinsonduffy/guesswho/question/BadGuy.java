package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class BadGuy implements Question {
    @Override
    public String getName() {
        return "Is your person a bad guy?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.BOBA_FETT,
                Person.ASAJJ_VENTRESS,
                Person.DARTH_VADER,
                Person.COUNT_DOOKU,
                Person.JABBA_THE_HUTT,
                Person.DARTH_MAUL,
                Person.EMPEROR_PALPATINE,
                Person.GENERAL_GRIEVOUS);
    }
}

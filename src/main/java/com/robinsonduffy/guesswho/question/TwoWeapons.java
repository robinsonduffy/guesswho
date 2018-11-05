package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class TwoWeapons implements Question {
    @Override
    public String getName() {
        return "Is your person CARRYING TWO WEAPONS?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.ASAJJ_VENTRESS,
                Person.GENERAL_GRIEVOUS);
    }
}

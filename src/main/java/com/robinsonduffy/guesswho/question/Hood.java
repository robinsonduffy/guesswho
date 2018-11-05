package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Hood implements Question {
    @Override
    public String getName() {
        return "Is your person WEARING A HOOD?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.WICKET_W_WARRICK,
                Person.EMPEROR_PALPATINE,
                Person.COUNT_DOOKU,
                Person.DARTH_MAUL);
    }
}

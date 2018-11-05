package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class HairBuns implements Question {
    @Override
    public String getName() {
        return "Does you person have hair buns?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.PRINCESS_LEIA);
    }
}

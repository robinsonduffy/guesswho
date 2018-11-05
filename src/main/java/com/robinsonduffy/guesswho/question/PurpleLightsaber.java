package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class PurpleLightsaber implements Question {
    @Override
    public String getName() {
        return "Is your person holding a purple lightsaber?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.MACE_WINDU);
    }
}

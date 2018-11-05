package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class RedLightsaber implements Question {
    @Override
    public String getName() {
        return "Is your person holding a red lightsaber?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.EMPEROR_PALPATINE,
                Person.DARTH_MAUL,
                Person.COUNT_DOOKU,
                Person.DARTH_VADER,
                Person.ASAJJ_VENTRESS);
    }
}

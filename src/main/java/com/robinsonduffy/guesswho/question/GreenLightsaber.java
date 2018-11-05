package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class GreenLightsaber implements Question {
    @Override
    public String getName() {
        return "Is your person holding a Green lightsaber?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.AHSOKA_TANO,
                Person.KIT_FISTO,
                Person.GENERAL_GRIEVOUS,
                Person.YODA);
    }
}

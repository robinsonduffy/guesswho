package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class BlueLightsaber implements Question {
    @Override
    public String getName() {
        return "Is your person holding a blue lightsaber?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.LUKE_SKYWALKER,
                Person.AAYLA_SECURA,
                Person.ANAKIN_SKYWALKER,
                Person.OBI_WAN_KENOBI);
    }
}

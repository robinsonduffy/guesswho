package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Blaster implements Question {
    @Override
    public String getName() {
        return "Is your person holding a blaster?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.BOBA_FETT,
                Person.CAPTAIN_REX,
                Person.PRINCESS_LEIA,
                Person.PADME_AMIDALA,
                Person.HAN_SOLO,
                Person.GENERAL_GRIEVOUS);
    }
}

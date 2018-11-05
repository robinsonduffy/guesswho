package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Human implements Question {
    @Override
    public String getName() {
        return "Is your person a human?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.PRINCESS_LEIA,
                Person.CAPTAIN_REX,
                Person.DARTH_VADER,
                Person.ANAKIN_SKYWALKER,
                Person.HAN_SOLO,
                Person.PRINCESS_LEIA,
                Person.BOBA_FETT,
                Person.OBI_WAN_KENOBI,
                Person.LUKE_SKYWALKER,
                Person.EMPEROR_PALPATINE,
                Person.COUNT_DOOKU);
    }
}

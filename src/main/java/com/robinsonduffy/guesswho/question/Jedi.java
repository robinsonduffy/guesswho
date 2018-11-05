package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Jedi implements Question {
    @Override
    public String getName() {
        return "Is your person a jedi?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.AHSOKA_TANO,
                Person.LUKE_SKYWALKER,
                Person.KIT_FISTO,
                Person.AAYLA_SECURA,
                Person.ANAKIN_SKYWALKER,
                Person.MACE_WINDU,
                Person.OBI_WAN_KENOBI,
                Person.YODA);
    }
}

package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Lightsaber implements Question {
    @Override
    public String getName() {
        return "Is your person holding a lightsaber?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.LUKE_SKYWALKER,
                Person.AHSOKA_TANO,
                Person.KIT_FISTO,
                Person.GENERAL_GRIEVOUS,
                Person.EMPEROR_PALPATINE,
                Person.AAYLA_SECURA,
                Person.DARTH_MAUL,
                Person.COUNT_DOOKU,
                Person.ANAKIN_SKYWALKER,
                Person.DARTH_VADER,
                Person.MACE_WINDU,
                Person.OBI_WAN_KENOBI,
                Person.ASAJJ_VENTRESS,
                Person.YODA);
    }
}

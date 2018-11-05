package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Female implements Question {
    @Override
    public String getName() {
        return "Is your person a woman?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.ASAJJ_VENTRESS,
                Person.PRINCESS_LEIA,
                Person.PADME_AMIDALA,
                Person.AAYLA_SECURA,
                Person.AHSOKA_TANO
                );
    }
}

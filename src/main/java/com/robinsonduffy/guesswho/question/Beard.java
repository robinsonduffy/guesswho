package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Beard implements Question {
    @Override
    public String getName() {
        return "Does your person have facial hair showing?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.OBI_WAN_KENOBI,
                Person.WICKET_W_WARRICK,
                Person.CHEWBACCA,
                Person.COUNT_DOOKU);
    }
}

package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Hair implements Question {
    @Override
    public String getName() {
        return "Does your person have hair showing?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.COUNT_DOOKU,
                Person.EMPEROR_PALPATINE,
                Person.CAPTAIN_REX,
                Person.WICKET_W_WARRICK,
                Person.PRINCESS_LEIA,
                Person.OBI_WAN_KENOBI,
                Person.LUKE_SKYWALKER,
                Person.HAN_SOLO,
                Person.PADME_AMIDALA,
                Person.ANAKIN_SKYWALKER,
                Person.CHEWBACCA);
    }
}

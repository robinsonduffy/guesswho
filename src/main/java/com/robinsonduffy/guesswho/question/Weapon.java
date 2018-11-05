package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Weapon implements Question {
    @Override
    public String getName() {
        return "Is your person holding a weapon?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.AHSOKA_TANO,
                Person.LUKE_SKYWALKER,
                Person.KIT_FISTO,
                Person.GENERAL_GRIEVOUS,
                Person.EMPEROR_PALPATINE,
                Person.AAYLA_SECURA,
                Person.DARTH_MAUL,
                Person.HAN_SOLO,
                Person.COUNT_DOOKU,
                Person.ANAKIN_SKYWALKER,
                Person.DARTH_VADER,
                Person.MACE_WINDU,
                Person.PADME_AMIDALA,
                Person.PRINCESS_LEIA,
                Person.OBI_WAN_KENOBI,
                Person.ASAJJ_VENTRESS,
                Person.YODA,
                Person.CAPTAIN_REX,
                Person.BOBA_FETT,
                Person.WICKET_W_WARRICK);
    }
}

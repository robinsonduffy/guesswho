package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class Male implements Question {
    @Override
    public String getName() {
        return "Is your person a man?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.LUKE_SKYWALKER,
                Person.KIT_FISTO,
                Person.GENERAL_GRIEVOUS,
                Person.EMPEROR_PALPATINE,
                Person.DARTH_MAUL,
                Person.JABBA_THE_HUTT,
                Person.HAN_SOLO,
                Person.CHEWBACCA,
                Person.COUNT_DOOKU,
                Person.ANAKIN_SKYWALKER,
                Person.R2_D2,
                Person.DARTH_MAUL,
                Person.MACE_WINDU,
                Person.OBI_WAN_KENOBI,
                Person.YODA,
                Person.CAPTAIN_REX,
                Person.BOBA_FETT,
                Person.C_3PO,
                Person.WICKET_W_WARRICK);
    }
}

package com.robinsonduffy.guesswho.question;

import java.util.EnumSet;

import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.Person;

@Component
public class GoodGuy implements Question {
    @Override
    public String getName() {
        return "Is your person a good guy?";
    }

    @Override
    public EnumSet<Person> getPeople() {
        return EnumSet.of(
                Person.AHSOKA_TANO,
                Person.LUKE_SKYWALKER,
                Person.KIT_FISTO,
                Person.AAYLA_SECURA,
                Person.HAN_SOLO,
                Person.CHEWBACCA,
                Person.ANAKIN_SKYWALKER,
                Person.R2_D2,
                Person.MACE_WINDU,
                Person.PADME_AMIDALA,
                Person.PRINCESS_LEIA,
                Person.OBI_WAN_KENOBI,
                Person.YODA,
                Person.CAPTAIN_REX,
                Person.C_3PO,
                Person.WICKET_W_WARRICK);
    }
}

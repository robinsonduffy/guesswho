package com.robinsonduffy.guesswho;

import java.util.EnumSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robinsonduffy.guesswho.question.Question;

@RestController
@RequestMapping("/api")
public class Api {
    private Player player;

    @Autowired
    public Api(Player player) {
        this.player = player;
    }

    @GetMapping("/question")
    public String askQuestion() {
        if (player.getPeople().size() == 1) {
            return "Is your person " + player.getPeople().iterator().next().toString();
        }
        Question question = player.getNextQuestion();
        if (question == null) {
            return "Is your person " + player.makeAGuess().toString();
        }
        return question.getName();
    }

    @GetMapping("/yes")
    public String answerYes(){
        player.answerQuestion(true);
        return "People left: " + player.getPeople().size();
    }

    @GetMapping("/no")
    public String answerNo(){
        player.answerQuestion(false);
        return "People left: " + player.getPeople().size();
    }

    @GetMapping("/newGame")
    public String startNewGame(){
        player.setUpNewGame();
        return "I am ready to play! I am " + player.getMyPerson().toString();
    }

    @GetMapping("/who")
    public EnumSet<Person> whoIsLet() {
        return player.getPeople();
    }
}

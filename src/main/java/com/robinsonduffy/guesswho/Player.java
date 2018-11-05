package com.robinsonduffy.guesswho;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.robinsonduffy.guesswho.question.Question;

@Component
public class Player {
    private static final Logger LOG = Logger.getLogger( Player.class.getName() );
    private List<Question> questions;
    private List<Question> unaskedQuestions;
    private EnumSet<Person> people;
    private Question currentQuestion;
    private Person myPerson;
    private Person currentGuess;

    @Autowired
    public Player(List<Question> questions) {
        this.questions = questions;
        setUpNewGame();
    }

    public void setUpNewGame() {
        unaskedQuestions = new ArrayList<>(questions);
        people = EnumSet.allOf(Person.class);
        Random rand = new Random();
        myPerson = Person.values()[rand.nextInt(people.size())];
        people.remove(myPerson);
    }

    public Question getNextQuestion() {
        Question question = null;
        if (unaskedQuestions.size() == questions.size()) {
            Random rand = new Random();
            question = unaskedQuestions.get(rand.nextInt(unaskedQuestions.size()));
        } else {
            int difference = Integer.MAX_VALUE;
            for (Question currentQuestion : unaskedQuestions) {
                int currentNumMatches = 0;
                int currentNumNotMatches = people.size();

                for (Person person : people) {
                    if (currentQuestion.getPeople().contains(person)) {
                        currentNumMatches++;
                        currentNumNotMatches--;
                    }
                }

                int currentDifference = Math.abs(currentNumMatches - currentNumNotMatches);
                LOG.info(currentQuestion.getName() + ": " + String.valueOf(currentDifference));
                if (currentDifference < difference) {
                    question = currentQuestion;
                    difference = currentDifference;
                }
            }
            if (difference == people.size()) {
                return null;
            }
        }
        this.currentQuestion = question;
        return question;
    }

    public void answerQuestion(boolean yes){
        if (currentQuestion != null) {
            if (yes) {
                people.retainAll(currentQuestion.getPeople());
            } else {
                people.removeAll(currentQuestion.getPeople());
            }
            unaskedQuestions.remove(currentQuestion);
            currentQuestion = null;
        } else if (currentGuess != null) {
            if (!yes) {
                people.remove(currentGuess);
                currentGuess = null;
            }
        }
    }
    
    public Person getMyPerson() {
        return myPerson;
    }

    public Person makeAGuess() {
        Random rand = new Random();
        currentGuess = (Person) people.toArray()[rand.nextInt(people.size())];
        currentQuestion = null;
        return currentGuess;
    }

    public EnumSet<Person> getPeople(){
        return people;
    }
}

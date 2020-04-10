package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        //Less cases in this instance, does have to go through if statement,
        // if none match of the wins or draws, return lose
        //this also fices the fact that the tests were not passing due to the old system.
        if ((mine == Move.PAPER && theirs == Move.ROCK) || (mine == Move.SCISSORS && theirs == Move.PAPER) || (mine == Move.ROCK && theirs == Move.SCISSORS) ) {
            return Result.WIN;
        } else if (mine == theirs) {
            return Result.DRAW;
        }

        return Result.LOSE;
    }
}

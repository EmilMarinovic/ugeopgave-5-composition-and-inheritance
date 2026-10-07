package Del2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal simba = new Lion("Simba");
        Animal ulf = new Wolf("Ulf");
        Animal snurreSnup = new Rabbit("Snurre Snup");
        Contest contest = new Contest();


        contest.playRound(snurreSnup, ulf);


    }
}

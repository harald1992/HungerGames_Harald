package com.capgemini;

import com.capgemini.Controllers.ArenaController;
import com.capgemini.Models.Contestant;
import com.capgemini.Models.ContestantList;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        //SETUP ARENA
        ArenaController arenaController = new ArenaController();  //This is the Setup of the arena and has methods.

        System.out.println("Welcome To The Game \n Press enter to load the participants");
        scanner.nextLine();

        //Setting up the board, later should be in a setup game class
        ContestantList contestantList = new ContestantList();
        contestantList.fillContestantList();

        while (running) {
            System.out.println("State Your Choice");
            System.out.println("1 = Proceed to next day \n 2 = See Participants \n 3 = Quit");

            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    arenaController.newDay();
                case "2":
                    contestantList.printContestantList();
                case "3":
                    running = false;

            }
        }
    }
}
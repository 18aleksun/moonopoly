package com.company;

import java.util.Scanner;

public class Logic {

    CreatePlayer newPlayer = new CreatePlayer();
    CitiesDataBase newCities = new CitiesDataBase();
    int i = 0;

    public void action() {
        newPlayer.createNewPlayer();
        System.out.println("Game start!");

        //todo random int countOfcub
        int countOfcub  = 2;
        int numberField;
        int i = 0;
        while (true) {
            for (; i < newPlayer.getPlayersList().size(); i++) {
                stepPlayer();

            }
           break;
        }
    }

    private void stepPlayer(){
        int countOfcub  = 2;
        int numberField;
        System.out.println("Step of player " + newPlayer.getPlayersList().get(i).getName());
        System.out.println(newPlayer.getPlayersList().get(i).getName() + " throw cubic");
        System.out.println(newPlayer.getPlayersList().get(i).getName() + " get number " + countOfcub);

        numberField = newPlayer.getPlayersList().get(i).getField();

        if(numberField + countOfcub >= newCities.getDataBaseCity().length) {
            newPlayer.getPlayersList().get(i).setField(numberField
                    - newCities.getDataBaseCity().length);
            newPlayer.getPlayersList().get(i).setBalance(newPlayer.getPlayersList().get(i).getBalance() + 2000);
            System.out.println("You finish round, now your balance is: "
                    + newPlayer.getPlayersList().get(i).getBalance());
        }
        else {
            newPlayer.getPlayersList().get(i).setField(countOfcub + numberField);
        }
        System.out.println("You get field " + newCities.getDataBaseCity()[countOfcub].getName());
    }

    private void solutionPlayer() {
        System.out.println("...");
        Scanner scanner = new Scanner(System.in);
        int chooseAction = scanner.nextInt();

        switch (chooseAction) {
            case 1:
                System.out.println();
                break;

            case 2:
                System.out.println();
                break;
            case 3:
                // new change line 2
                // new change line 3
                // new change line 3
        }
    }
}
































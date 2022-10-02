package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePlayer{
     private List<Players> playersList = new ArrayList<>();

    public void createNewPlayer(){
        while (true) {
            System.out.println("Введите имя игрока или q");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if(name.equals("q")){
                break;
            }
            playersList.add(new Players(name));
        }
    }

    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }
}

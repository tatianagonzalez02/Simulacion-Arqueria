/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author USER-LENOVO
 */
public class Team {
    private int id;
    private String nameTeam;
    private ArrayList<Person> listPlayers;

    public Team(int id, String nameTeam, ArrayList<Person> listPlayers) {
        this.id = id;
        this.nameTeam = nameTeam;
        this.listPlayers = listPlayers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public ArrayList<Person> getListPlayers() {
        return listPlayers;
    }

    public void setListPlayers(ArrayList<Person> listPlayers) {
        this.listPlayers = listPlayers;
    }
    
    
}

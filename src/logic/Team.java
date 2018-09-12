package logic;

import java.util.ArrayList;

/**
 * Clase que almacena lo correspondiente a un equipo
 *
 * @author David Guerrero
 * @author Karol Alfonso
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

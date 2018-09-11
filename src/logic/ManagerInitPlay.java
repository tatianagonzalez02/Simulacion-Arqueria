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
public class ManagerInitPlay {

    private ArrayList<Team> listTeams;

    public ManagerInitPlay() {
        listTeams = new ArrayList<>();
    }

    public String getNameRandom(int gender) {
        String auxName = "";
        if (gender == 0) {
            auxName = "David";
        } else {
            auxName = "Tatiana";
        }
        return auxName;
    }

    public EnumGender getGenderRandom() {
        if (0 == 0) {
            return EnumGender.MALE;
        } else {
            return EnumGender.FEMALE;
        }
    }
        public int ageRandom(){
            int auxAge=0;
            return auxAge;
        }
        public int resistenceRandom(int gender){
        int auxResistence=0;
        return auxResistence;
        }
        public int precisionRandom(int gender){
        int auxPrecision=0;
        return auxPrecision;
        }
        public float luckyRandom(){
        int auxLucky=0;
        return auxLucky;
        }
            
    public ArrayList<Person> createPlayersOneTeam() {
        ArrayList<Person> auxListPlayers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            EnumGender genderSelected=getGenderRandom();
            int dataGender=-1;
            if(genderSelected.equals(EnumGender.MALE)){
                dataGender=0;
            }else if(genderSelected.equals(EnumGender.FEMALE)){
            dataGender=1;
            }
            Person person = new Person(
                    getNameRandom(dataGender),genderSelected,
                    ageRandom(), resistenceRandom(dataGender), 
                    precisionRandom(dataGender),10,
                    luckyRandom());
            auxListPlayers.add(person);
        }
        return auxListPlayers;
    }

    public void createTeams() {
        Team teamA = new Team(1, "Equipo A",createPlayersOneTeam());
        Team teamB = new Team(2, "Equipo B",createPlayersOneTeam());
        listTeams.add(teamA);
        listTeams.add(teamB);
        
    }

    public ArrayList<Team> getListTeams() {
        return listTeams;
    }

    public void setListTeams(ArrayList<Team> listTeams) {
        this.listTeams = listTeams;
    }

}

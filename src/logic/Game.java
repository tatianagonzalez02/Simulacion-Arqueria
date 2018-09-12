package logic;

import java.util.ArrayList;

/**
 * Clase correspondiente a una partida
 *
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class Game {

    private float averageLucky;
    private float averageExperience;
    private ArrayList<RoundGroup> listRoundGroups;
    private int countVictoriesTeamA;
    private int countVictoriesTeamB;
    private ArrayList<Team> listTeams;
    
    public Game(double valueEscenary, ArrayList<Team> listTeams) {
        this.countVictoriesTeamA = 0;
        this.countVictoriesTeamB = 0;
        listRoundGroups = new ArrayList<>();
        this.listTeams=listTeams;
        startGame(valueEscenary);
    }

    /**
     * Iniciar Partida
     *
     * @param valueEscenary
     */
    private void startGame(double valueEscenary) {
        //Realizar n rondas grupales hasta que algun equipo gane 10 
//    if(countVictoriesTeamA!=10 || countVictoriesTeamB!=10){
        RoundGroup roundGroup=new RoundGroup(valueEscenary);
        roundGroup.playRoundIndividual(listTeams);
        if(roundGroup.getWinnerRound().equals("A")){
            countVictoriesTeamA+=1;
        }else if(roundGroup.getWinnerRound().equals("B")){
        countVictoriesTeamB+=1;
        }
        listRoundGroups.add(roundGroup);
       }
//       }

    public void calculateAverageLucky() {
    }

    public void calculateAverageExperience() {
    }

}

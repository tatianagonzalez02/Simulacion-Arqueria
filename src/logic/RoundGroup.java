/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class RoundGroup {

    private double valueEscenary;
    private String winnerRound;

    public RoundGroup(double valueEscenary) {
        this.valueEscenary = valueEscenary;
        winnerRound = "";
        
    }

    /**
     * Obtener velocidad aleatoria
     *
     * @return
     */
    private int getSpeedRandom() {
        return 0;
    }

    /**
     * Obtener angulo aleatorio
     *
     * @return
     */
    private int getAnguloRandom() {
        return 0;
    }

    /**
     * Calcular la distancia con MonteCarlo
     *
     * @param speed
     * @param angulo
     * @return
     */
    private float calculateDistance(int speed, int angulo) {
//usar la restriccion del escenario para calcular la distancia. OJOOOOO
        return 0;
    }

    /**
     * Metodo que genera los lanzamientos n hasta que se agote le resistencia
     * del jugador
     *
     * @param player
     */
    private void generateLaunchingsOnePlayer(Person player) {
        int i = 1;
        int resistenceCurrent = player.getResistence();
        while (resistenceCurrent > 3) {
            int angulo = getAnguloRandom();
            int speed = getSpeedRandom();
            float distance = calculateDistance(speed, angulo);
            Launching launching = new Launching(i, angulo, speed, distance);
            player.getListLaunching().add(launching);
            resistenceCurrent = resistenceCurrent - 4;
            i++;
        }
    }

    private void generateSpecialLaunching() {

    }

    public void playRoundIndividual(ArrayList<Team> listTeams) {
        //recorremos la lista de equipos
        for (int i = 0; i < listTeams.size(); i++) {
            //por cada equipo para todos sus jugadores se crearan sus respectivos lanzamientos
            for (int j = 0; j < listTeams.get(i).getListPlayers().size(); j++) {
                generateLaunchingsOnePlayer(listTeams.get(i).getListPlayers().get(j));
            }
            //lanzamiento especial
            generateSpecialLaunching();
        }
        getWinnerRoundGroup(listTeams);

    }
    /**
     * Obtener el ganador de la ronda grupal
     * @param listTeams 
     */
    private void getWinnerRoundGroup(ArrayList<Team> listTeams){
        float totalDistanceTeamA=0;
        float totalDistanceTeamB=0;
    for (int j = 0; j < listTeams.get(0).getListPlayers().size(); j++) {
     for (int k = 0; k < listTeams.get(0).getListPlayers().get(j).getListLaunching().size(); k++) {
      totalDistanceTeamA+=listTeams.get(0).getListPlayers().get(j).getListLaunching().get(k).getDistance();
                }
            }
        for (int j = 0; j < listTeams.get(0).getListPlayers().size(); j++) {
     for (int k = 0; k < listTeams.get(0).getListPlayers().get(j).getListLaunching().size(); k++) {
      totalDistanceTeamB+=listTeams.get(0).getListPlayers().get(j).getListLaunching().get(k).getDistance();
                }
            }
        if(totalDistanceTeamA>totalDistanceTeamB){
        winnerRound="A";
        }else{
        winnerRound="B";
        }
        
    }

    public String getWinnerRound() {
        return winnerRound;
    }
    
}

package logic;

import java.util.ArrayList;

/**
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class ManagerArchery {

    private ManagerInitPlay managerInitPlay;
    private ArrayList<Escenary> listEscenary;

    public ManagerArchery() {
        managerInitPlay = new ManagerInitPlay();
        listEscenary=new ArrayList<>();
    }

    /**
     * Generar escenario Aleatorio dentro de los 4 disponibles
     *
     * @return
     */
    private EnumEscenary escenaryRandom() {
        EnumEscenary enumEscenarySelected = EnumEscenary.N_WIND_N_RAIN;
        return enumEscenarySelected;
    }
/**
 * Crear los tres escenarios para la simulacion
 */
    private void createEscenary() {
        for (int i = 0; i < 3; i++) {
            Escenary escenary = new Escenary(escenaryRandom());
            listEscenary.add(escenary);
        }
    }
/**
 * Metodo que controla la siluacion en general
 */
    public void startSimulation() {
        createEscenary();
        managerInitPlay.createTeams();
        for (int i = 0; i < listEscenary.size(); i++) {
            for (int j = 0; j < 3; j++) {//son 500
                Game game = new Game(listEscenary.get(i).getTypeEscenary().
                        getValueEscenary(),managerInitPlay.getListTeams());
            listEscenary.get(i).getListGames().add(game);
            }
        }
//        System.out.println(listEscenary.toString());
    }
}

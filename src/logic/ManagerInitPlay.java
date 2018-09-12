package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Administrador para las condiciones inciales de un juego
 *
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class ManagerInitPlay {

    private ArrayList<Team> listTeams;
    private ArrayList<String> listWomen;
    private ArrayList<String> listMen;
    private int countW;
    private int countM;

    public ManagerInitPlay() {
        this.countW = 0;
        this.countM = 0;
        listTeams = new ArrayList<>();
        listWomen = new ArrayList<>();
        listWomen.add("Graciela");listWomen.add("Daniela");listWomen.add("Maira");
        listWomen.add("Lina");listWomen.add("Lorena");listWomen.add("Tatiana");
        listWomen.add("Gloria");listWomen.add("Paola");listWomen.add("Maria");
        listWomen.add("Sandra");listWomen.add("Luisa");listWomen.add("Teresa");
        listWomen.add("Erika");listWomen.add("Delia");listWomen.add("Jazmine");
        listWomen.add("Rosa");listWomen.add("Juana");listWomen.add("Martha");
        listWomen.add("Eulalia");listWomen.add("Carmen");listWomen.add("Maira");
        
        listMen = new ArrayList<>();
        listMen.add("Ricardo");listMen.add("Mateo");listMen.add("Luis");listMen.add("Pedro");
        listMen.add("Eduardo");listMen.add("David");listMen.add("Daniel");listMen.add("Leonardo");
        listMen.add("Rafael");listMen.add("Juan");listMen.add("Carlos");listMen.add("Isaac");
        listMen.add("James");listMen.add("Radamel");listMen.add("Guillermo");listMen.add("Modric");
        listMen.add("Cristiano");listMen.add("Davinson");listMen.add("Diego");listMen.add("Santiago");
        listMen.add("Sebastian");
    }

    /**
     * Obtener el nombre aleatorio segun el genero que se tenga
     *
     * @param gender
     * @return
     */
    private String getNameRandom(int gender) {
        String auxName = "";
        if (gender == 0) {
            auxName = listMen.get(countM);
            countM ++;
        } else if(gender==1) {
            auxName = listWomen.get(countW);
            countW ++;
        }
        return auxName;
    }

    /**
     * Obtener el genero en forma aleatoria
     *
     * @return
     */
    private EnumGender getGenderRandom() {
        double y = Math.random();
        if (y < 0.5) {
            y = Math.floor(y);
        } else {
            y = Math.ceil(y);
        }
        System.out.println(y);
        if (y == 0) {
            return EnumGender.MALE;
        } else {
            return EnumGender.FEMALE;
        }
    }

    /**
     * Obtener la edad aleatoria
     *
     * @return
     */
    private int ageRandom() {
        int auxAge = 0;
        return auxAge;
    }

    /**
     * Obtener el valor de la resistencia aleatorio entre 50 y 54, de acuerdo al
     * genero 0 sera hombre 1 sera mujer
     *
     * @param gender
     * @return
     */
    private int resistenceRandom(int gender) {
        int auxResistence = 0;
        return auxResistence;
    }

    /**
     * Obtener el valor de la precision aleatorio entre 50 y 54
     *
     * @param gender
     * @return
     */
    private int precisionRandom(int gender) {
        int auxPrecision = 0;
        return auxPrecision;
    }

    /**
     * Obtener el valor de la suerte aleatoria
     *
     * @return
     */
    private float luckyRandom() {
        int auxLucky = 0;
        return auxLucky;
    }

    /**
     * Metodo para crear los jugadores para un solo equipo con las condiciones
     * necesarias
     *
     * @return
     */
    private ArrayList<Person> createPlayersOneTeam() {
        ArrayList<Person> auxListPlayers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            EnumGender genderSelected = getGenderRandom();
            int dataGender = -1;
            if (genderSelected.equals(EnumGender.MALE)) {
                dataGender = 0;
            } else if (genderSelected.equals(EnumGender.FEMALE)) {
                dataGender = 1;
            }
//            System.out.println("datagender"+dataGender);
            Person person = new Person(
                    getNameRandom(dataGender),
                    genderSelected,
                    ageRandom(), resistenceRandom(dataGender),
                    precisionRandom(dataGender), 10,
                    luckyRandom());
            auxListPlayers.add(person);
        }
        return auxListPlayers;
    }

    /**
     * Crear los equipos con sus jugadores
     */
    public void createTeams() {
        Team teamA = new Team(1, "Equipo A", createPlayersOneTeam());
        Team teamB = new Team(2, "Equipo B", createPlayersOneTeam());
        listTeams.add(teamA);
        listTeams.add(teamB);

    }
//----------------------------Get and set-----------------------------------

    public ArrayList<Team> getListTeams() {
        return listTeams;
    }

    public void setListTeams(ArrayList<Team> listTeams) {
        this.listTeams = listTeams;
    }

}

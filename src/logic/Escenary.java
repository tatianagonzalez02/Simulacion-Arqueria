package logic;

import java.util.ArrayList;

/**
 *
 * @author USER-LENOVO
 */
public class Escenary {
   private int id=1;
   private EnumEscenary typeEscenary;
    private ArrayList<Game> listGames;

    public Escenary(EnumEscenary typeEscenary) {
        this.typeEscenary = typeEscenary;
        this.listGames = new ArrayList<>();
        this.id+=1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumEscenary getTypeEscenary() {
        return typeEscenary;
    }

    public void setTypeEscenary(EnumEscenary typeEscenary) {
        this.typeEscenary = typeEscenary;
    }

    public ArrayList<Game> getListGames() {
        return listGames;
    }

    public void setListGames(ArrayList<Game> listGames) {
        this.listGames = listGames;
    }
    
   
    
}

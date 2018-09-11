package logic;

/**
 * Enumerado para generos de la persona
 * @author David Guerrero
 * @author Karol Alfonso
 */
public enum EnumGender {

    MALE("Hombre","0"),
    FEMALE("Mujer","1");
    

    private String nameGender;
    private String codeGender;

    private EnumGender(String nameD, String codeDish) {
        this.nameGender = nameD;
        this.codeGender = codeDish;

    }

    public String getNameGender() {
        return nameGender;
    }

    public String getCodeGender() {
        return codeGender;
    }

   

}

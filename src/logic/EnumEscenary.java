package logic;

/**
 * Enumerado para los escenarios
 *
 * @author David Guerrero
 * @author Karol Alfonso
 */
public enum EnumEscenary {
    Y_WIND_Y_RAIN("Si viento, si lluvia",0.12),
    N_WIND_N_RAIN("No viento, no lluvia",0.0),
    Y_WIND_N_RAIN("Si viento, no lluvia",0.04),
    N_WIND_Y_RAIN("No viento, si lluvia",0.08);

    private String nameEscenary;
    private double valueEscenary;

    private EnumEscenary(String nameEscenary, double valueEscenary) {
        this.nameEscenary = nameEscenary;
        this.valueEscenary = valueEscenary;

    }

    public String getNameEscenary() {
        return nameEscenary;
    }

    public double getValueEscenary() {
        return valueEscenary;
    }

}

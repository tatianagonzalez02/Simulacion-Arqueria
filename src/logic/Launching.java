package logic;

/**
 * Clase que maneja un lanzamiento
 *
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class Launching {

    private int id;
    private int angulo;
    private int speed;//velocidad
    private float distance;

    public Launching(int id, int angulo, int speed, float distance) {
        this.id = id;
        this.angulo = angulo;
        this.speed = speed;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

}

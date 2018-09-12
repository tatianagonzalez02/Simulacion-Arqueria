package controller;

import logic.ManagerArchery;

/**
 *
 * @author David Guerrero
 * @author Karol Alfonso
 */
public class MainController {
private ManagerArchery managerArchery;
    public MainController() {
    managerArchery=new ManagerArchery();
    }

    public void runPrincipal() {
        managerArchery.startSimulation();
    }
}

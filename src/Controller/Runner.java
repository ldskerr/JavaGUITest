package Controller;

import View.GUI;

public class Runner {

    private GUI myGUI;

    public Runner() {
        myGUI = new GUI();
    }

    public void run() {
        myGUI.display();
    }
}

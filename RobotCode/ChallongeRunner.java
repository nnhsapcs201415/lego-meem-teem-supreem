import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;

public class ChallongeRunner {
    public static void main(String[] args) {
        Challonge c = new Challonge();
        for (;;) {
            if (Button.readButtons() > 0) break;
        }
    }
}
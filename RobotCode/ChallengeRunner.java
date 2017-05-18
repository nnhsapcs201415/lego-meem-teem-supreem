import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;

public class ChallengeRunner {
    public static void main(String[] args) {
        Challenge c = new Challenge();
        c.go();
        Button.ENTER.waitForPressAndRelease();
        for (;;) {
            if (Button.readButtons() > 0) break;
        }
    }
}
import lejos.nxt.Button;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.Motor;
import lejos.nxt.LCD;

public class MotorTutor1 {
    public static void main(String[] args) {
        LCD.drawString("PROGRAM 1", 0, 0);
        Button.waitForAnyPress();
        Motor.A.forward();
        LCD.drawString("FORWARD  ", 0, 0);
        Button.waitForAnyPress();
        Motor.A.backward();
        LCD.drawString("BACKWARD ", 0, 0);
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
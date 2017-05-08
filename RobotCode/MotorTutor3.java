import lejos.nxt.Button;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.Motor;
import lejos.nxt.LCD;

public class MotorTutor3 {
    public static void main(String[] args) {
        LCD.drawString("PROGRAM 3", 0, 0);
        Motor.A.rotate(1440);
        LCD.drawString("" + Motor.A.getTachoCount() + "           ", 0, 0);
        Motor.A.rotateTo(0);
        LCD.drawString("" + Motor.A.getTachoCount(), 0, 1);
        Button.waitForAnyPress();
    }
}
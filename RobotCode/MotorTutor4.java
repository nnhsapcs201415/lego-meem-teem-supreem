import lejos.nxt.Button;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;

public class MotorTutor4 {
    public static void main(String[] args) {
        LCD.drawString("PROGRAM 4", 0, 0);
        Button.waitForAnyPress();
        while(Button.readButtons()>0);
        LCD.clear();
        Motor.A.rotate(-1440, true);
        while (Motor.A.isMoving()) {
            LCD.drawInt(Motor.A.getTachoCount(), 0, 0);
            if (Button.readButtons()>0)
                Motor.A.stop();
        }
        LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
        Button.waitForAnyPress();
    }
}
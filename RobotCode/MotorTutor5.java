import lejos.nxt.Button;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;

public class MotorTutor5 {
    public static void main(String[] args) {
        LCD.drawString("PROGRAM 5", 0, 0);
        Button.waitForAnyPress();
        while (Button.readButtons()>0);
        LCD.clear();
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        Motor.A.rotate(720, true);
        Motor.B.rotate(720, true);
        Motor.C.rotate(720, true);

        for (int i = 0; i < 8; i++) {
            LCD.drawString("" + Motor.A.getTachoCount() + " " + Motor.B.getTachoCount() + " " + Motor.C.getTachoCount(), 0, i);
            Delay.msDelay(200);
        }
        
        Button.waitForAnyPress();
    }

}

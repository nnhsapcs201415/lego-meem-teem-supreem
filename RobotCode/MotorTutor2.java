import lejos.nxt.Button;
import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;

public class MotorTutor2 {
    public static void main(String[] args) {
        LCD.drawString("PROGRAM 2", 0, 0);
        Motor.A.setSpeed(720);
        Motor.A.forward();
        Delay.msDelay(2000);
        LCD.drawString("MOTOR ANGLE: " + Motor.A.getTachoCount(), 0, 0);
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
        Motor.A.backward();
        while (Motor.A.getTachoCount() > 0);
        LCD.drawInt(Motor.A.getTachoCount(), 0, 2);
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(), 0, 3);
        Button.waitForAnyPress();
    }
}
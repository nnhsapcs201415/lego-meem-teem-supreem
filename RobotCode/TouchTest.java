import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.robotics.navigation.DifferentialPilot;

public class TouchTest {
    public static void main(String[] args) throws Exception {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        DifferentialPilot pilot = new DifferentialPilot(5.45f, 5.6f, 11.4f, Motor.A, Motor.C, false);
        while (true) {
            if(touch.isPressed())
            {
                pilot.travel(1);
                LCD.drawString("Moving", 3, 4);
            }
            else
            {
                LCD.drawString("Stopped", 3, 4);
            }
        }
    }
}
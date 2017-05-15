import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.Delay;
import lejos.nxt.LCD;
import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class ColorFollower {
    private static DifferentialPilot pilot;

    public static void main(String[] args)
    {
        ColorFollower cf = new ColorFollower();
        cf.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false); //left slightly stronger .05
        cf.pilot.setTravelSpeed(2);
        
        LightSensor light = new LightSensor(SensorPort.S2);
        
        Button.ENTER.waitForPressAndRelease();
        
        pilot.forward();
        
        while (true) {
            LCD.drawInt(light.getNormalizedLightValue(), 0, 0);
            if (light.getNormalizedLightValue() > 500) {
                pilot.stop();
            } else {
                pilot.stop();
                pilot.forward();
            }
            if (!pilot.isMoving()) {
                pilot.rotate(-270, true);
            }
            if (Button.readButtons() > 0) break;
            Delay.msDelay(150);
        }
    }
}
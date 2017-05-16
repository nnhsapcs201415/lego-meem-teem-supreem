import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;
import lejos.nxt.TouchSensor;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.LightSensor;

public class LightTest2 implements SensorPortListener 
{

    public static void main(String[] args) throws Exception 
    {
        LightTest2 lt = new LightTest2();
        
        SensorPort.S2.addSensorPortListener(lt);
        DifferentialPilot pilot = new DifferentialPilot(5.45f, 5.6f, 11.4f, Motor.A, Motor.C, false);
        while (true) 
        {
        }
    }

    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue)
    {
        LCD.drawString(" "+aNewValue, 3, 4);
        // 700 - 800 white
        // 800 above black
    }
}
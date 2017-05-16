import lejos.nxt.LCD;
import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SensorPortListener;

public class newLightTest implements SensorPortListener{
    public static void main(String[] args) throws Exception {
        LightSensor light = new LightSensor(SensorPort.S2);
                System.out.println("aa");
        Button.ENTER.waitForPressAndRelease();
    }
    public void stateChanged(SensorPort aSource,int aOldValue,int aNewValue)
    {
        System.out.println("aa");
    }
}
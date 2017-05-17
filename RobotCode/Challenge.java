import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Motor;
import lejos.nxt.Button;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.SensorPortListener;

public class Challenge implements FeatureListener, SensorPortListener {
    private static DifferentialPilot pilot;
    
    public Challenge(String[] args) 
    {
        Challenge c = new Challenge();
        
        c.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, 
            Motor.A, Motor.C, false);
            
        circlePattern();
    }

    public static void circlePattern()
    {
        while(true)
        {
            
        }
    } 

    public void featureDetected(Feature feature, FeatureDetector detector)
    {
    }

    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) 
    {

    }
}
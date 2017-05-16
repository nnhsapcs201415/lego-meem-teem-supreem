import lejos.nxt.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.navigation.DifferentialPilot;

public class Challenge implements FeatureListener, SensorPortListener {

    public static DifferentialPilot pilot;
    public static int MAX_DETECT = 80;
    
    public static void main(String[] args) {
        Challenge C = new Challenge();
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        LightSensor light = new LightSensor(SensorPort.S2);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        fd.addListener(C);
        C.pilot = new DifferentialPilot(5.315f, 5.355f, 11.4f, Motor.A, Motor.C, false);
        pilot.travel(500);
        Button.ENTER.waitForPressAndRelease();
    }
    
    public void featureDetected(Feature feature, FeatureDetector detector) {
        pilot.stop();
    }
    
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue) {
        
    }
}